import java.util.Arrays;
import java.util.Collections;

public class InbuildSorting {
    public static void main(String args []){
        Integer arr[]={15,2,-9,0,5};
        Arrays.sort(arr,0,5,Collections.reverseOrder());
        PrintArr(arr);
    }
    public static void PrintArr(Integer arr[]){
        for(int i=0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
    

}
