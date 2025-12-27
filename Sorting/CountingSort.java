public class CountingSort {
    //USE ONLY FOR SMALL ARRAY

    public static void Counting(int arr[]){

        //FINDING LARGEST
        int largest=0;
        for(int i :arr){
            if(i>largest){
                largest=i;
            }
        }
        //CREATING COUNTING ARRAY
        int Count[]=new int[largest+1];
        for(int i:arr){
            Count[i]++;
        }
        //sorting
        int index=0;
        for (int i = 0; i < Count.length; i++) {
            while (Count[i] > 0) {
                arr[index] = i;
                index++;
                Count[i]--;
    }
}


    }
    public static void PrintArr(int arr[]){
        for(int i=0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[]={4, 3, 4, 6, 9, 0, 2 };
        Counting(arr);
        PrintArr(arr);
    }
}
