import java.util.*;
public class DeciToBin {
    public static int DeciToBin(int deciNum){
        int BinNum=0;
        int pow=0;
        while(deciNum>0){
            int rem=deciNum % 2;
            BinNum=BinNum+rem*(int)Math.pow(10,pow);
            deciNum=deciNum/2;
            pow++;
        }
        return BinNum;
        
    }
    public static void main(String[] args) {

        System.out.println(DeciToBin(5));
    }
}
