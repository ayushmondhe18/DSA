public class NumberPyramid {

     public static void numberPy(int n){
        
        for(int i=1 ; i<=n ;i++){
            for(int j=1 ; j<=(n-i); j++ ){
                System.out.print(" ");
            }
            int counter=1;
            for(int j=1 ; j<=i ; j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
     }
     public static void palindromeNo(int n){
        
        for(int i=1 ; i<=n ;i++){
            for(int j=1 ; j<=(n-i); j++ ){
                System.out.print(" ");
            }
            //descending loop
            for(int j=i ; j>=1 ; j--){
                System.out.print(j);
            }
            //ascending loop
            for(int j=2 ; j<=i ; j++){
                System.out.print(j);
            }
            System.out.println();
        }
     }

     public static void main(String[] args) {
        numberPy(5);
        System.out.println("--------------------------------------");
        palindromeNo(5);
     }
}
