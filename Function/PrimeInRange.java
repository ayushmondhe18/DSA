import java.util.*;
public class PrimeInRange {

    public static boolean isprime(int n){
        for(int i=2; i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void PrimeRange(int n){
        for(int i=2; i<=n ; i++){
            if (isprime(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        PrimeRange(180000000);
    }
}

