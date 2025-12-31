public class SubString {
    public static void SubString(String str,int start , int end){
        String substring="";
        for(int i=start ; i<=end ; i++){
            substring= substring+(str.charAt(i));
        }
        System.out.println(substring);
    }
    public static void main(String[] args) {
        String str="Ayush Mondhe";
        SubString(str, 2, 05);

    }
}
