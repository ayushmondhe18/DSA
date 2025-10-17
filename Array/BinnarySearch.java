public class BinnarySearch {

    public static int Binnary(int num[], int key){
        int start=0, end=num.length-1;
        
        while(start<=end){
            int mid=( start + end )/2;
            if(num[mid] == key){
                return mid;
            }
            if(num[mid] < key) {//right
                start = mid+1;
            } else {//left
                end = mid-1;
            }
        }
        return -1;
    }
     public static void main(String[] args) {
        int num[]={1,2,3,5,8,22,33,47};
        int key=47;

        System.out.println("index for key is :"+Binnary(num,key));
        

    }
}
