import java.util.ArrayList;


public class Functions {

    //void function
    static void printHello(){
        System.out.println("Hello Everyone");
    }

    //Parameterized Function

    static void addTwoNumbers(int a , int b){ //parameter
        int c = a+b;
        System.out.println("Sum is : " + c);
    }

    // Return Type Function

    static int addThreeNumbers(int a , int b , int c){

        int sum = a + b + c;

        return sum;
    }

    static String mergeTwoString(String str1 , String str2){

        String newStr = str1.concat(str2);



        return newStr;
    }


    public static void main(String[] args) {

       
        printHello();

        // addTwoNumbers(10, 20); // argument

        // int ans = addThreeNumbers(10, 20, 30);

        // System.out.println("Three Number sum is : " + ans);
        
        String a = "Hello";
        String b = "Dosto";
        String ans = mergeTwoString(a , b);

        System.out.println("Concanated String is : " + ans);

        // a = "hello" , b = "world"  ans  ="helloworld"
    }


    
    
    
}

//syntax of functions

// returnType functionName(datatype parameterName ,datatype parameterName  ){
//

    //return datatype;
//}



//Built In Functions

//User Defined Functions

//Void Function


//Parameterized Function
//Return Type Function

