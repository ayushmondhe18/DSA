public class Print{
    public static void print(int n){
        if (n==50){
            System.out.println(n);
            return;
        }
        System.out.print(n);
        print(n+1);
    }
     public static void main(String[] args) {
        print(10);
     }
}