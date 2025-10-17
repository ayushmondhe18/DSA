public class Pairsnum {
    public static void array(int num[]){
        int totalPairs=0;

        for(int i=0; i<num.length ; i++){
            for(int j=i+1 ; j<num.length ; j++){
                System.out.print("(" +num[i] +","+ num[j] +")");
                totalPairs++;
            }
            System.out.println();
        }
        System.out.println("TotalPairs:"+totalPairs);
    }
    public static void main(String[] args) {
        int num[]={1,2,3,5,8,22,33,47};
        array(num);
    }
}
