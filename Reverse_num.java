import java.util.*;

public class Reverse_num {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        int rev=0;

        while(num>0){
            int lastdigit=num%10;
            // System.out.print(lastdigit);
            rev= (rev*10)+lastdigit;
            num=num/10;
            
        }
        System.out.println(rev);
    }
}
