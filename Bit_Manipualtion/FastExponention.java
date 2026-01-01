public class FastExponention{
    public static void FastExponention(int num, int power){
        int ans=1;

        while(power>0){
            if((power & 1)==1){
                ans=ans * num ;
            }
            num = num * num;  //THIS A^2 DON'T GET ADD TO ANS BECAUSE BINARY(1010) BIT IS ZERO HERE 
            power=power>>1; // REMOVE LSB BIT
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        int a=5;
        int power=3;
        FastExponention(a, power);
    }
}