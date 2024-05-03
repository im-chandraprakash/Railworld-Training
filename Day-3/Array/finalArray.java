
public class finalArray {

    public static void main(String args[]){


        final int[] arr = new int[]{1 , 2 ,3 ,4 ,5};

        System.out.println("Before Modifications");
        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("After modifications");

        arr[0] = 100;
        arr[1] = 300;
        for(int num : arr){
            System.out.print(num + " ");
        }
        
    }
}