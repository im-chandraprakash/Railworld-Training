import java.util.Scanner;

public class CelciusToFarenHeight {
    
    public static void main(String[] args){

        float f , c;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter celcius value : ");
        c = scanner.nextFloat();

        f =  c * ((float) 9 / (float) 5) + 32;

        System.out.println("The farenheight value is  :" +  f);


    }
}
