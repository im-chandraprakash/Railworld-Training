package Console;

import Models.Book;
import Services.LibraryService;

import java.sql.SQLException;
import java.util.Scanner;

public class LibrarienConsole {

    Scanner scanner;
    LibraryService libraryService;

    public LibrarienConsole() throws SQLException{
        scanner = new Scanner(System.in);
        libraryService = new LibraryService();
    }


    public void BookCreation() throws SQLException {

        Book book = new Book();

        System.out.print("Enter Title: ");
        String title = scanner.nextLine();

        System.out.print("Enter Author: ");
        String author = scanner.nextLine();

        System.out.print("Enter Publisher: ");
        String publisher = scanner.nextLine();

        System.out.print("Enter Category ID: ");
        int categoryId = scanner.nextInt();

        System.out.print("Enter Total Copies: ");
        int totalCopies = scanner.nextInt();

        System.out.print("Enter Available Copies: ");
        int availableCopies = scanner.nextInt();

        book.setTitle(title);
        book.setAuthor(author);
        book.setPublisher(publisher);
        book.setCategoryId(categoryId);
        book.setTotalCopies(totalCopies);
        book.setAvailableCopies(availableCopies);

        libraryService.CreateBookService(book);
    }

    public void SearchBooks()throws SQLException{
        System.out.print("Enter Book Name: ");
        String bookName = scanner.nextLine();
        System.out.print("Enter Book Author: ");
        String bookAuthor = scanner.nextLine();

        libraryService.SearchBookService(bookName , bookAuthor);
    }

    public void SearchStudent()throws SQLException{
        System.out.print("Enter Student Name: ");
        String studentName = scanner.nextLine();

        System.out.print("Enter Student Email: ");
        String studentEmail = scanner.nextLine();

        libraryService.SearchStudentService(studentName , studentEmail);
    }
    public  void SearchCategory()throws SQLException{
        System.out.println("Enter Categories name");
        String categoryName = scanner.nextLine();
        libraryService.SearchCategoryService(categoryName);
    }

    public void SearchLibrarian()throws SQLException{
        System.out.println("Enter Librarian name");
        String librarianName = scanner.nextLine();
        System.out.println("Enter Librarian Email");
        String librarianEmail = scanner.nextLine();
        libraryService.SearchLibrarianServicce(librarianName , librarianEmail);
    }

    //future enhancement
    public void BookIssuedStudents(){

    }
}
