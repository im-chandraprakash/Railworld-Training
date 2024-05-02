import java.util.Scanner;

public class UserInputProgram {
    
    public static void main(String args[]){

        int a= 0, b = 0 , sum = 0, product = 1;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter value of a : ");

        
        try {
             a = scan.nextInt();
         } catch (Exception e) {
             System.out.println("error : " +  e);
            //  scan.next();
         }

        System.out.println("Enter value of b : ");
         b = scan.nextInt();

         scan.close();

         sum = a+b;
         product = a*b;
         
         System.out.println("Sum is : " + sum);
         System.out.println("Product is : " + product);

        
    }
}
