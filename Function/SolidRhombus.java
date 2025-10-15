public class SolidRhombus {
    public static void rhombus(int n){
        for(int i=1 ; i<=n ; i++){
            for(int j=i; j<n ; j++){
                System.out.print(" ");
            }
            for( int j=1 ; j<=n ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void rhombus2(int n){
        for(int i=1 ; i<=n ; i++){
            for(int j=1; j<=(n-i) ; j++){
                System.out.print(" ");
            }
            for( int j=1 ; j<=n ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        rhombus(5);
        System.out.println("-------------------");
        rhombus2(5);
    }
}
