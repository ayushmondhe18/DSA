import java.util.Scanner;
public class SumOfDigit {
    public static void sum(int num){
        int sum=0;
        while(num>0){
            sum=sum+num%10;
            num=num/10;  
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        sum(num);
    }
}
