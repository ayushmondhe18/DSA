public class OperationOnBit{
    //IT IS USED FOR ACCESSING iTH NO. OF BIT IN NO.
    public static int Get_Ithbit(int num, int i){
        int bitmass=1<<i;
        if((bitmass & num)==0){
            return 0;
        }else{
           return 1;
        }
    }
    //IT IS USED TO INSERT 1 iTH POSITION
    public static int Set_Ithbit(int num, int i){
        int bitmass=1<<i;
        return num | bitmass;
    }
    //IT IS USED INSERT 0 AT iTH POSITION
    public static int CleariTHBit(int num, int i){
        int bitmass=~(1<<i);
        return (bitmass & num);
    }
    public static int UpdateBit(int num, int i , int newbit){
        if(newbit==1){
            return Set_Ithbit(num, i);
        }else{
            return CleariTHBit(num, i);
        }
    }
    public static int ClearLastBit(int num ,int i){
        int bitmass=(~0)<<i;
        return num & bitmass;
    }
    public static void main(String[] args) {
        int num=10;
        int i=2;
        int New=1;
        System.out.println(Get_Ithbit(num, i));
        System.out.println(Set_Ithbit(num, i));
        System.out.println(CleariTHBit(num, i));
        System.out.println(UpdateBit(num, i, New));
        System.out.println(ClearLastBit(15, 2));
        
    }
}