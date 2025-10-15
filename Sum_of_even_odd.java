import java.util.Scanner;

public class Sum_of_even_odd {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        int choice;
        int n;
        int sumeven=0;
        int sumodd=0;

        do{
            System.out.println("Enter The Number:");
            n=sc.nextInt();

            if(n%2==0){
                sumeven+=n;
            }else{
                sumodd+=n;
            }

            System.out.println("do want to continue ? if yes press 1 otherwise press 0.");

            choice= sc.nextInt();

        }while(choice==1);

        System.out.println("sum of even number is" +sumeven);
        System.out.println("sum of odd number is" +sumodd);



    }
    
}
