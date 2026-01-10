public class PrintxPower {
    public static double print(int num, int x){
        if(x==1){
            return num;
        }
        double ans=num * print(num, x-1);
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(print(2, 10));
    }
}
 