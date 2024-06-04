package Day_8;


import java.util.Arrays;
import java.util.Scanner;

public class Fiboncchi {


    static void checkAnagram(String s1 ,String s2){

        char[] charS1 = s1.toCharArray();
        char[] charS2 = s2.toCharArray();

        Arrays.sort(charS1);
        Arrays.sort(charS2);

        String sortedS1 = new String(charS1);
        String sortedS2 = new String(charS2);

        if(sortedS1.equals(sortedS2)){
            System.out.println("String is Anagram");
        }
        else{
            System.out.println("String is Anagram");
        }


    }
    public static void main(String[] args) {

        checkAnagram("tea" , "aet");
    }
}
