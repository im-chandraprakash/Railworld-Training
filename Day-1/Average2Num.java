
import java.util.Scanner;

public class Average2Num {
    
    public static void main(String args[]){

        double a , b , avg;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value of a : ");
        a =  scanner.nextFloat();
        System.out.println("Enter value of b  : ");
        b = scanner.nextDouble();

        avg = (a + b) / 2;

        System.out.println("Average is : "  +  avg);

    }
}
