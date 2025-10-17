import java.util.*;
public class LargestNo{
    public static int getlargestno(int num[]){
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;

        for(int i=0 ; i < num.length ; i++){
            if(largest < num[i]){
                largest=num[i];
            }
            if(smallest>num[i]){
                smallest=num[i];
            }
        }
        System.out.println("Smllest no. in array is "+ smallest);
        return largest;

    }

    public static void main(String[] args) {
        int num[]={1,2,3,5,2,8,1,47,22,11,33};
        System.out.println(getlargestno(num));

    }
}