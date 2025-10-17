import java.util.*;
public class TrapeWater {
    public static int trap(int num[]){
        
        //calculating left max boundary
        int leftmax[]=new int[num.length];
        leftmax[0]=num[0];
        for(int i=1 ; i<num.length ;i++){
           leftmax[i]=Math.max(num[i],leftmax[i-1]);
        }

        //calculating rught max boundary
        int rightmax[]=new int[num.length];
        rightmax[num.length-1]=num[num.length-1];
        for(int i=num.length-2 ; i>=0 ; i--){
            rightmax[i]=Math.max(num[i],rightmax[i+1]);
        }

        int TrapeWater=0;
        for(int i=0 ; i<num.length ; i++){

            //waterlevel=min(leftmax,rightmax)
            int waterlevel=Math.min(leftmax[i],rightmax[i]);
           
            //trapewater=waterlevel-hieght
            TrapeWater= TrapeWater + waterlevel-num[i];

        }
        return TrapeWater;
    }
    public static void main(String[] args) {
        int num[]={4,2,0,6,3,2,5};
        System.out.println(trap(num));
    }
}
