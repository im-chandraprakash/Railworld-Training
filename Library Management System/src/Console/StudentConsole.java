package Console;

import Models.Student;
import Services.StudentService;

import java.sql.SQLException;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class StudentConsole {

    Scanner scanner;
    StudentService studentService;
    public StudentConsole(){
        scanner = new Scanner(System.in);
        studentService = new StudentService();
    }

    public void RegisterStudent() throws SQLException {
        Student student = new Student();

        System.out.println("Enter Name: ");
        String name = scanner.nextLine();

        System.out.println("Enter Email: ");
        String email = scanner.nextLine();

        System.out.println("Enter Phone Number: ");
        int phoneNo = scanner.nextInt();
        scanner.nextLine();  // consume the newline character

        System.out.println("Enter Address: ");
        String address = scanner.nextLine();

        student.setName(name);
        student.setEmail(email);
        student.setPhoneNo(phoneNo);
        student.setAddress(address);

        studentService.RegisterStudentService(student);

    }

    public void BuySubscription() throws SQLException {
        System.out.println("Enter Student Name: ");
        String name = scanner.nextLine();

        System.out.println("Enter Email: ");
        String email = scanner.nextLine();

        studentService.BuySubscriptionService(name , email);
    }

    public void GetBookIssue() throws SQLException {

        System.out.println("Enter Student Id: ");
        int studentId = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter Book Id: ");
        int bookId = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter a return date (yyyy-MM-dd): ");
        String date = scanner.nextLine();

        LocalDate ReturnDate = null;
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            ReturnDate = LocalDate.parse(date, formatter);
        } catch (DateTimeException e) {
            System.out.println("Invalid date format. Please enter the date in yyyy-MM-dd format.");
        }

        studentService.IssueBookService(studentId, bookId, ReturnDate);
    }

    public void SubmitBook() throws  SQLException {
        System.out.println("Enter Student Id: ");
        int studentId = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter Book Id: ");
        int bookId = scanner.nextInt();
        scanner.nextLine();

        studentService.SubmitBookService(studentId , bookId);
    }

    public void ViewAllBooks() throws SQLException {
       studentService.ViewAllBooksService();
    }

    public void ViewProfile() throws  SQLException {
        System.out.println("Enter Student Id: ");
        int studentId = scanner.nextInt();
        scanner.nextLine();

        studentService.ViewProfileService(studentId);
    }
}
