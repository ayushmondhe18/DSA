public class FirstOccurance {
    public static int first(int arr[], int key , int i){
        if(arr.length - 1 == i){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return first(arr, key, i+1);
    }
    public static int last(int arr[], int key , int i){
        if( 0 == i){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return last(arr, key, i-1);
    }
    public static void main(String[] args) {
        int arr[]={1,7,5,62,8,7,45};
        int i=arr.length -1;
        System.out.println(last(arr, 7, i ));
    }
}
