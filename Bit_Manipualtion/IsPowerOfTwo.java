public class IsPowerOfTwo {
    public static void main(String[] args) {
        int num=8;
        if((num & num-1)==0){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
