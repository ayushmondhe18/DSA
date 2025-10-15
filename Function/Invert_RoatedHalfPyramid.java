public class Invert_RoatedHalfPyramid {

    public static void pyra( int n){

        for(int i=0; i<=n;i++){
            //space
            for(int j=0;j<=n-i;j++){
                System.out.print(" ");
            }
            //star
            for(int k=0;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    

    public static void main(String[] args) {
        pyra(4);
    
    }
}
