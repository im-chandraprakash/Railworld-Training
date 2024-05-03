
import java.util.Arrays;

public class ArrayStart {
    
    public static void main(String args[]){

        // int[] arr = new int[5];

        // int arr[] = {1 , 2 , 3 , 4 , 5};

        int[] arr = new int[5];
        Arrays.fill(arr , 10);
        arr = new int[]{10 , 20 , 30 , 40};
        String str = Arrays.toString(arr);
        
        for(int i =0;i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("String is : " + str);
    }
}
