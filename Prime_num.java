import java.util.Scanner;

public class Prime_num {
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      int num=sc.nextInt();
      if(num==2){
        System.out.println("num is prime");
      }else{

      boolean isprime=true;//i<=n-1 can also be written but math.sqrt improve effiency n=sqt(n)*sqt(n)
      for(int i=2; i<=Math.sqrt(num);i++){ 
        if(num%i == 0){
            isprime=false;
        }
      }
      if (isprime==true) {
        System.out.println("number is prime");
      } else {
        System.out.println("number is not a prime");
      }
      }

      
      
    }
}
