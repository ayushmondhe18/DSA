public class DiagonalMatrixSum {

    public static void sum(int Matrix[][]){
        int sum1=0;
        int sum2=0;
        int i=0;
        int j=0;
        while(i<Matrix.length && j<Matrix[0].length){
            sum1=sum1+Matrix[i][j];
            i++;
            j++;
        }
        int k=0;
        int m=Matrix[0].length-1;

        while(k<Matrix.length && m>=0){
            sum2=sum2+Matrix[k][m];
            k++;
            m--;
        }
        System.out.println(sum1+" "+sum2+" "+(sum1+sum2)+" ");
        
    }
    public static int add(int matrix[][]){
        int sum=0;
        for (int i = 0; i < matrix.length; i++) {
            // pd (primary diagonal)
            sum += matrix[i][i];

            // sd (secondary diagonal)
            if (i != matrix.length - 1 - i) {     // if conditional is applied in common element will not get countb twice 
            sum += matrix[i][matrix.length - i - 1];
    }
}

        return sum;
    }
    public static void main(String[] args) {
        int Matrix[][]={{1,2,3},
                        {5,6,7},
                        {9,10,11,}};
        sum(Matrix);
    }
}
