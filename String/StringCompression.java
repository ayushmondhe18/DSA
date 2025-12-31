public class StringCompression {
    static void Compresion(String str){
        StringBuilder strb=new StringBuilder();
        for(int i=0 ; i<str.length() ; i++){
            Integer count=1;
            while(i < str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            if(count > 1){
                strb.append(str.charAt(i)+count.toString());
            }else{
                 strb.append(str.charAt(i));
            }

        }
        System.out.println(strb);
    }
    public static void main(String[] args) {
        String str="aaahbb";
        Compresion(str);
    }
}
