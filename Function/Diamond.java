public class Diamond {
    public static void Diamond(int n){
        // 1ST HALF
        for(int i=1 ; i<=n ; i++){
            for(int j=1 ; j<=(n-i) ; j++){
                System.out.print(" ");
            }
            for(int j=1 ; j<=(2*i)-1 ; j++){// their two way to represent odd no. e.i (2x+1) & (2x-1) from it this condition is get used
                System.out.print("*");
            }
            System.out.println();

        }
        //2ND HALF
        for(int i=n ; i>=1 ; i--){  // REVERSE THE OUTER CONDTION FOR 2ND HALF 
            for(int j=1 ; j<=(n-i) ; j++){
                System.out.print(" ");
            }
            for(int j=1 ; j<=(2*i)-1 ; j++){// their two way to represent odd no. e.i (2x+1) & (2x-1) from it this condition is get used
                System.out.print("*");
            }
            System.out.println();

        }

    }
    public static void main(String[] args) {
        Diamond(4);
    }
}
