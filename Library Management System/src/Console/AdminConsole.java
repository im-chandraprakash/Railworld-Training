package Console;

import Models.Users;
import Services.AdminService;

import java.sql.SQLException;
import java.util.Scanner;

public class AdminConsole {

    Scanner scanner;
    AdminService adminService;

    public AdminConsole(){
        scanner = new Scanner(System.in);
        adminService = new AdminService();
    }

    public void CreateLibrariens() throws SQLException{

        Users user = new Users();

        System.out.println("Enter Username: ");
        String userName = scanner.nextLine();

        System.out.println("Enter Password: ");
        String password = scanner.nextLine();

        System.out.println("Enter Email: ");
        String email = scanner.nextLine();

        System.out.println("Enter Phone Number: ");
        int phoneNumber = scanner.nextInt();

        user.setUserName(userName);
        user.setPassword(password);
        user.setEmail(email);
        user.setPhoneNumber(phoneNumber);

        adminService.CreateLibrarianService(user);
    }

    public void CreateCategory() throws SQLException {
        System.out.println("Enter Category Name: ");
        String categoryName = scanner.nextLine();

        System.out.println("Enter Category Description: ");
        String categoryDescription = scanner.nextLine();

        adminService.CreateCategoryService(categoryName , categoryDescription);
    }

    public void ViewAllStudents()  throws  SQLException{
        adminService.ViewAllStudentsService();
    }
    public void ViewAllCategories() throws  SQLException {
        adminService.ViewAllCategoriesService();
    }
    public void ViewAllLibrarians()  throws  SQLException {
        adminService.ViewAllLibrarians();
    }

}
