public class Butterfly {
    public static void butter(int n){
        // 1st HALF
        for(int i=1 ; i<=n ; i++){
            //STAR
            for(int j=1 ; j<=i ;j++){
                System.out.print("*");
            }
            //SPACE
            for(int j=1 ; j<=2*(n-i) ; j++){
                System.out.print(" ");
            }
            //STAR
            for(int j=1 ; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();

        }

      // 2ND HALF
        for(int i=1 ; i<=n ; i++){
            for(int j=n-(i-1) ; j>=1 ; j--){
                System.out.print("*");
            }
            for(int j=n ; j>=2*(n-i); j--){
                System.out.print(" ");
            }
            for(int j=n-(i-1) ; j>=1 ; j--){
                System.out.print("*");
            }
            System.out.println();

        }
    }

    // IN SECOND JUST OUTER CONDTION GET CHANGE

    public static void secondway(int n){
        // 1st HALF
        for(int i=1 ; i<=n ; i++){
            //STAR
            for(int j=1 ; j<=i ;j++){
                System.out.print("*");
            }
            //SPACE
            for(int j=1 ; j<=2*(n-i) ; j++){
                System.out.print(" ");
            }
            //STAR
            for(int j=1 ; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();

        }
        for(int i=n ; i>=1 ; i--){
            //STAR
            for(int j=1 ; j<=i ;j++){
                System.out.print("*");
            }
            //SPACE
            for(int j=1 ; j<=2*(n-i) ; j++){
                System.out.print(" ");
            }
            //STAR
            for(int j=1 ; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();

        }  

    }
    public static void main(String[] args) {
        butter(4);
        System.out.println("i am ayush mondhe");
        secondway(4);
    }
}
