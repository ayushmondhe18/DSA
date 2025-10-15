import java.util.*;
public class BinaryToDecimal {
    public static int BinTodec(int BinNum){
        int deci=0;
        for(int i=0;BinNum>0;i++){
            int lastdigit=BinNum % 10;
            deci+=(int)Math.pow(2,i)*(lastdigit);
            BinNum=BinNum/10;

        }
        System.out.println(deci);
        return deci;
    }
    

    public static void main(String[] args) {
        BinTodec(101);

        
    }
}
