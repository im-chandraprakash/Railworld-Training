import java.util.Scanner;

public class SecondLargest {
    
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter size of array : ");
        int size = scanner.nextInt();
        
        int[] arr = new int[size];
        System.out.println("Enter Elements");

        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > firstMax) {
                secondMax = firstMax;
                firstMax = num;
            } else if (num > secondMax && num != firstMax) {
                secondMax = num;
            }
        }

        System.out.println("Second largest element is : " + secondMax);
    }
}
