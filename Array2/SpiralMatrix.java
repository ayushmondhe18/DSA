public class SpiralMatrix {

    public static void Spiral(int Matrix[][]){
        int startRow=0;
        int startCol=0;
        int endRow=Matrix.length-1;
        int endCol=Matrix[0].length-1;
        while(startRow <= endRow && startCol <=endCol ){
            //Top layer
            for(int j=startCol ; j<=endCol ; j++){
                System.out.print(Matrix[startCol][j]+" ");
            }
            //Side-Last layer
            for(int i=startRow+1; i<=endRow ; i++){
                System.out.print(Matrix[i][endCol]+" ");
            }
            //Bottom layer
            for(int j=endCol-1 ; j>=startCol ; j--){
                if(startRow==endRow){
                    return;
                }
                System.out.print(Matrix[endRow][j]+" ");
            }
            //Side-First Layer
            for(int i=endRow-1 ; i>=startRow+1 ; i--){
                if(startCol==endCol){
                    return;
                }
                System.out.print(Matrix[i][startCol]+" ");
            }
            startRow++;
            startCol++;
            endCol--;
            endRow--;
        }
    }
    public static void main(String[] args) {
        int Matrix[][]={{1,2,3,4,45},
                        {5,6,7,8,55},
                        {9,10,11,12,65},
                        {13,14,15,16,75},
                        {17,18,19,20,85}};
        Spiral(Matrix);
    }
}
