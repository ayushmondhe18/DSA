public class index {
    public static boolean com(int num[]){
        for(int i=0 ; i<num.length-1 ; i++){
            for( int j=i+1 ; j<num.length ;j++){
                if(num[j]==num[i]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int num[]={1,2,3,4};
        System.out.println(com(num));
    }
}
