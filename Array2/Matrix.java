import java.util.*;
public class Matrix{
    //Searching element in Matrix
    public static boolean Search(int Matrix[][],int key){
        for(int i=0 ; i < Matrix.length ; i++){
            for(int j=0 ;j < Matrix[0].length ; j++){
                if(Matrix[i][j]==key){
                    System.out.println("key is found at index ("+i+","+j+")");
                    return true;
                }
            }
        }
        System.out.println("key is not found");
        return false;
    }

    //Finding Largest element in Matrix
    public static void largest(int Matrix[][] ){
        int largest=Integer.MIN_VALUE;
        for(int i=0 ; i < Matrix.length ; i++){
            for(int j=0 ;j < Matrix[0].length ; j++){
                if(Matrix[i][j]>largest){
                    largest=Matrix[i][j];
                }
            }
        }  
        System.out.println("Largest no. in Matrix is "+largest); 
    }

    //Printinig only first row
    public static void print1(int Matrix[][]){
         for(int i=0 ; i < Matrix.length ; i++){
            for(int j=0 ;j < Matrix[0].length ; j++){
                if(j>1){
                    break;
                }
                System.out.print(Matrix[i][j]+" ");
                }
                System.out.println("");
            }
        }
    
    public static void main(String[] args) {
        int Matrix[][]=new int[3][3];
        int n=Matrix.length , m=Matrix[0].length;

        //TAKING INPUT
        Scanner sc= new Scanner(System.in);
        for(int i=0 ; i<n ; i++){
            for(int j=0 ;j<m ; j++){
                Matrix[i][j]=sc.nextInt();
            }

        }
        //PRINTING OUTPUT 
        for(int i=0 ; i<n ; i++){
            for(int j=0 ;j<m ; j++){
                System.out.print(Matrix[i][j]+" ");
            }
            System.out.println("");
        }
        int key=55 ;
        Search(Matrix,key);
        largest(Matrix);
        print1(Matrix);

    }
}