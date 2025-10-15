import java.util.*;
public class Prime {

    public static void prime_num(int n){
        boolean isprime=true;

        if(n==2){
            isprime=true;
        }

        for(int i=2; i<=Math.sqrt(n);i++){
            if(n%i==0){
                isprime=false;
            }
        }
        if(isprime==true){
            System.out.println("number is prime");
        }else{
            System.out.println("number is not a prime");
        }
    }



    public static void main(String[] args) {
        prime_num(2);
        prime_num(1);
        prime_num(7);
        prime_num(10);

    }
}
