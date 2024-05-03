import java.util.Scanner;

public class SwapVariable {
 
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = scanner.nextInt();
        
        System.out.print("Enter the value of b: ");
        int b = scanner.nextInt();
        
        
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
