public class EvenOdd{
    public static void Even(int num){
        int bitmass=1;
        if((num & bitmass)==0){
            System.out.println("no. is Even");
        }else{
            System.out.println("no. is odd");
        }
    }
    public static void main(String[] args) {
        int num=8;
        Even(num);
    }
}