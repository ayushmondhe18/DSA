public class PrifixArandKadane {
    public static void subArray(int num[]){
        int TotalSubArray=0;
        int MaxSum=Integer.MIN_VALUE;
        int minSum=Integer.MAX_VALUE;
        int sum=0;

        int prefix[]=new int[num.length];
        prefix[0]=num[0];

        //calculatimg Array of prefix 
        for(int i=1; i<prefix.length ; i++){
            prefix[i]=prefix[i-1]+num[i];
        }

        for(int i=0 ; i<num.length ; i++){    // we abstract value of first element from here
            int start=i;
            for(int j=i; j<num.length ; j++){// we abstract value of last element from here
                int end=j;
                sum=start==0 ? prefix[end] : prefix[end]-prefix[start-1];
                if(MaxSum<sum){
                    MaxSum=sum;
                }
                if(sum<minSum){
                    minSum=sum;
                }
                TotalSubArray++;
            }
        }
        System.out.println("Total sub  Array="+TotalSubArray);
        System.out.println("maxsum="+MaxSum);
        System.out.println("minsum="+minSum);

    }
    public static void kadane(int num[]){
        int maxsum=Integer.MIN_VALUE;
        int currsum=0;

        for(int i=0; i< num.length ; i++){
            currsum= currsum + num[i];
            if(currsum < 0){
                currsum=0;
            }
            maxsum=Math.max(currsum,maxsum);
        }
        System.out.println("maxsum according to kadane :"+maxsum);
    }
    public static void main(String[] args) {
        int num[]={12,2,3,5,8,22,33,47};
        subArray(num);
        kadane(num);
    }
}


