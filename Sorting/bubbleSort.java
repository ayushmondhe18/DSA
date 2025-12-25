public class bubbleSort {
    public static void Sorting(int arr[]){
        for(int turn = 0 ; turn < arr.length-1 ; turn ++){
            boolean swaping=false;
            for(int j = 0 ; j < arr.length-1-turn ; j ++){
                //swaping
                if (arr[j]< arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swaping=true;
                }
            }
            if(!swaping){
                break;
            }
        }
    }
    public static void PrintArr(int arr[]){
        for(int i=0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String []args){
        int arr[]={15,2,9,4,76};
        Sorting(arr);
        PrintArr(arr);
    }
    
}
