import java.util.*;
public class SecondLargestNo{
    public static void main(String args[]){
        int [] arr ={2,3,5,56,2,5,35,15,55,25,};

        int LargestNo=Integer.MIN_VALUE;
        int SecondLargestNo=Integer.MIN_VALUE;

        for(int i=0 ; i < arr.length ; i++){
            if(arr[i] > LargestNo){
                SecondLargestNo=LargestNo;
                LargestNo=arr[i];
            }
            if(arr[i] > SecondLargestNo && arr[i] < LargestNo){
                SecondLargestNo=arr[i];
            }
        }

        System.out.println("Second Largest Number in array is " +SecondLargestNo);

    }
    
}
