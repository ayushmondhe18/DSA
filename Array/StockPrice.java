import java.util.*;
public class StockPrice {
    public static void stock(int num[]){
       int buyprice=Integer.MAX_VALUE;
       int maxprofit=0;

       for(int i=0 ; i<num.length ; i++){
        if(buyprice < num[i]){
            int profit=num[i]-buyprice;
            maxprofit=Math.max(maxprofit,profit);
        }else{
            buyprice=num[i];
        }
       }

       System.out.println("maximun profit:"+maxprofit);
    }
    public static void main(String[] args) {
        int num[]={7,1,5,3,6,4};
        stock(num);
    }
}
