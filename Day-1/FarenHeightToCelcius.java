import java.util.Scanner;

public class FarenHeightToCelcius {

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        float f , c ;

        System.out.print("Enter Fareheight number : ");
        System.out.println("Enter Fareheight number : ");

        f = scanner.nextFloat();
        scanner.close();

        c = ((float) 5.0 / (float) 9.0) * (f - 32);

        System.out.println("Celcius is : "  + c);

    }
}
