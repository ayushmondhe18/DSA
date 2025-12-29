public class StairCaseSearch {
    public static boolean search(int Matrix[][],int key){
        int row=Matrix.length-1 , col=0;
        while(row>=0 && col< Matrix.length){
            if(key==Matrix[row][col]){
                System.out.println("key is found at ("+row +", "+col+")");
                return true;
            }else if(Matrix[row][col]>key){
                row--;
            }else{
                col++;
            }
        }
        System.out.println("key is not found!");
        return false;
    }
    public static void main(String[] args) {
        int Matrix[][]={{10,20,30,40},
                        {15,25,35,45},
                        {16,26,36,46},
                        {18,28,38,48}};
        search(Matrix, 48);
    }
}
