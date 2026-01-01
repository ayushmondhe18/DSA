public class ClearRangeofBit{
    public static int Range(int num , int i , int j){
        int a=(~0)<<(j+1);  //it give us 
        int b=(1<<i)-1;
        int bitmass= a | b;
        return bitmass & num ;
    }
    public static void main(String[] args) {
        System.out.println(Range(10, 02, 04));

        
    }
}