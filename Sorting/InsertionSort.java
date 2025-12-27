import java.util.Arrays;
import java.util.Collections;

public class InsertionSort {
    public static void main(String args []){
        int arr[]={15,2,-9,0,5};
        InsertionSort(arr);
        PrintArr(arr);
    }

    public static void PrintArr(int arr[]){
        for(int i=0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void InsertionSort( int arr[]){
        for(int i=0 ; i<arr.length-1 ; i++){
            for( int j=i+1 ; j>0 ; j--){        // j > 0 becuase when j became 0 then i is at -1 postion so 
                if(arr[j]<arr[j-1]){            // we can assign value here
                    //swaping
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }else{
                    break;
                }
            }
        }
    }
}
