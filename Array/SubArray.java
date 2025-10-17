import java.util.*;
public class SubArray {
    public static void subArray(int num[]){
        int TotalSubArray=0;
        int MaxSum=Integer.MIN_VALUE;
        int minSum=Integer.MAX_VALUE;

        for(int i=0 ; i<num.length ; i++){    // we abstract value of first element from here
            int start=i;
            for(int j=i; j<num.length ; j++){// we abstract value of last element from here
                int end=j;
                int sum=0;                    //use for printing sum
                for(int k=start; k<=end ; k++){
                    sum+=num[k];
                    System.out.print(num[k]+" ");// here we have print array elemnt
                } 
                
                System.out.print("Sum="+sum);
                if(MaxSum<sum){
                    MaxSum=sum;
                }
                if(sum<minSum){
                    minSum=sum;
                }



                TotalSubArray++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total sub  Array="+TotalSubArray);
        System.out.println("maxsum="+MaxSum);
        System.out.println("minsum="+minSum);

    }
    public static void main(String[] args) {
        int num[]={12,2,3,5,8,22,33,47};
        subArray(num);
    }
}
