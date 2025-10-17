public class kadaneForNegative {
    public static void kadane(int num[]){
        int maxsum=Integer.MIN_VALUE;
        int curr=num[0];

        for(int i=0 ; i<num.length ;i++){
            curr=Math.max(num[i],curr+num[i]);
            maxsum=Math.max(maxsum,curr);
        }
        System.out.println(maxsum);
  
    }
    public static void main(){
        int num[]={-22,-32,-5,-85,-54,-74};
        kadane(num);
    }
}
