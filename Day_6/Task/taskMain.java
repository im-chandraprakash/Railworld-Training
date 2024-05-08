package Task;

import java.util.Scanner;

public class taskMain {

    public static void main(String[] args) {

        Subject sbj = new Subject();
        Student std = new Student();
        School scl = new School();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Student Name :");
        std.setName(scanner.nextLine());
        System.out.println(std.getName());

        std.setSubjects(new Subject("10" , "20" , "30" , "40" , "50"));

        System.out.println("Enter School Name : ");
        scl.setSclName(scanner.nextLine());

        scl.setStudents(new Student( "hello" , std.getSubjects()));
        System.out.println(scl.toString());
    }
}
