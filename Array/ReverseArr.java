public class ReverseArr {
    public static void array(int num[]){
        int first=0, last=num.length-1;
        
        while(first < last){
            //swap 
            int temp=num[last];
            num[last]=num[first];
            num[first]=temp;

            first++;
            last--;
        }
    }
    public static void main(String[] args) {
        int num[]={1,2,3,5,2,8,1,47,22,11,33};

        array(num);
        //printing our array
        for(int i=0 ; i<num.length ; i++){
            System.out.print(num[i]+" ");
        }
    }
}
