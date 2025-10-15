import java.util.Scanner;
public class PalindroneNum {
    public static void palind(int num){
        int temp=num;
        int palindrome=0;
        while(temp>0){
            int rem=(temp%10); 
            palindrome=palindrome*10+rem;
            temp=temp/10;
        }
        if(num==palindrome){
            System.out.println(num+" is a palindrome");
        }else{
            System.out.println(num+" is not palindrome");
        }
        

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        palind(num);
    }
    
}
