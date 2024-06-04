import Console.AdminConsole;
import Console.LibrarienConsole;
import Console.StudentConsole;
import DButils.DButils;
import Models.Student;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {

    static Scanner scanner;


    public  Main(){

        scanner = new Scanner(System.in);
    }


    public void showMenu(){
        System.out.println("Welcome to The Library");
        System.out.println("Are you .......... ?");
        System.out.println("1) Student");
        System.out.println("2) Librarian");
        System.out.println("3) Admin");
        System.out.println("4) Click to Exit");
        System.out.println("Enter your choice -> ");
    }

    public void showStudentMenu(){
        System.out.println("1) Register YourSelf");
        System.out.println("2) Buy Library Subscription");
        System.out.println("3) Issue Book");
        System.out.println("4) Submit a Book");
        System.out.println("5) View Profile");
        System.out.println("6) View All Books");
        System.out.println("7) Go Back");
        System.out.println("Enter your choice -> ");
    }

    public void showLibrarianMenu(){
        System.out.println("1) Book creation");
        System.out.println("2) Search book");
        System.out.println("3) Search student");
        System.out.println("4) Search Category");
        System.out.println("5) Search librarian");
        System.out.println("6) Go Back");
        System.out.println("Enter your choice -> ");
    }


    public void showStudentMenuOptions() throws SQLException {
        int choice;
        do {
            showStudentMenu();
            choice = scanner.nextInt();
            scanner.nextLine();
            StudentConsole studenCS= new StudentConsole();
            switch (choice) {
                case 1:
                    studenCS.RegisterStudent();
                    break;
                case 2:
                    studenCS.BuySubscription();
                    break;
                case 3:
                    studenCS.GetBookIssue();
                    break;
                case 4:
                    studenCS.SubmitBook();
                    break;
                case 5:
                    studenCS.ViewProfile();
                    break;
                case 6:
                    studenCS.ViewAllBooks();
                    break;
                case 7:
                    System.out.println("Going back to main menu...");
                    break;
                default:

                    break;
            }
        } while (choice != 7);

        run();
    }

    public void showLibrarianMenuOptions() throws SQLException {
        int choice;
        do {
            showLibrarianMenu();
            choice = scanner.nextInt();
            scanner.nextLine();
            LibrarienConsole librarianConsole = new LibrarienConsole();
            switch (choice) {
                case 1:
                    librarianConsole.BookCreation();
                    break;
                case 2:
                    librarianConsole.SearchBooks();
                    break;
                case 3:
                    librarianConsole.SearchStudent();
                    break;
                case 4:
                    librarianConsole.SearchCategory();
                    break;
                case 5:
                    librarianConsole.SearchLibrarian();
                    break;
                case 6:
                    System.out.println("Going back to main menu...");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
                    break;
            }
        } while (choice != 6);
        run();
    }

    public void showAdminMenu(){
        System.out.println("1) Create Category");
        System.out.println("2) Create Librarian");
        System.out.println("3) View All Students");
        System.out.println("4) View All Categories");
        System.out.println("5) View All Librarians");
        System.out.println("6) Go Back to Main Menu");
        System.out.println("Enter your choice -> ");
    }

    public void showAdminMenuOptions() throws SQLException{

        int choice;
        do{
            showAdminMenu();
            choice = scanner.nextInt();
            scanner.nextLine();
            AdminConsole adminConsole = new AdminConsole();

            switch (choice){

                case 1 :
                    adminConsole.CreateCategory();
                    break;
                case 2 :
                    adminConsole.CreateLibrariens();
                    break;
                case 3:
                    adminConsole.ViewAllStudents();
                    break;
                case 4 :
                    adminConsole.ViewAllCategories();
                    break;
                case 5:
                    adminConsole.ViewAllLibrarians();
                    break;
                case 6:
                    System.out.println("Going back to main menu...");
                    break;
                default:
                    System.out.println("Enter a valid choice");
                    break;
            }
        }while (choice != 6);
        run();
    }


    public void run() throws  SQLException {
        showMenu();
        int option = scanner.nextInt();

        switch (option) {
            case 1:
                showStudentMenuOptions();
                break;
            case 2:
                showLibrarianMenuOptions();
                break;
            case 3:
                 showAdminMenuOptions();
                break;
            case 4:
                System.out.println("Exiting....");
                return;
            default:
                System.out.println("Invalid option!");
        }
    }



    public static void main(String[] args) throws SQLException {
        Main app = new Main();
        DButils dButils = new DButils();
        dButils.getConnection();
        System.out.println("Database Connected Successfully");
        app.run();
    }
}