import java.util.Scanner;

public class AreaOfTriangle {
    
    public static void main(String args[]){

        double a , b , c , s , area;

        Scanner scanner = new Scanner(System.in);

        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();

        scanner.close();

        s = ( a  + b  + c)/2;

        area =  Math.sqrt(s * (s - a ) * (s-b) * (s - c));
        
        System.out.println("Area is : "  +area);
    }
}
