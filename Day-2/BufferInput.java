import java.io.*;

public class BufferInput{

    public static void main(String args[]) throws IOException{

        BufferedReader bfn = new BufferedReader( new InputStreamReader(System.in));

        System.out.println("Please enter message in String");
        String str = bfn.readLine();
        System.out.println("Please enter message in Integer");
       

        System.out.println(str);
    }
}