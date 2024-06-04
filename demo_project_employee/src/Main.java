import service.EmployeeService;
import model.Employee;
import utils.DbConfig;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {

    private EmployeeService empService;
    private Scanner scanner;

    public Main() {
        empService = new EmployeeService();
        scanner = new Scanner(System.in);
    }

    private void showMenu() {
        System.out.println("\nEmployee Management System");
        System.out.println("1. Add Employee");
        System.out.println("2. View All Employees");
        System.out.println("3. Update Employee");
        System.out.println("4. Delete Employee");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }

    private void addEmployee() throws SQLException {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter department: ");
        String department = scanner.nextLine();
        System.out.print("Enter salary: ");
        double salary = Double.parseDouble(scanner.nextLine());

        model.Employee emp = new Employee();
        emp.setName(name);
        emp.setDepartment(department);
        emp.setSalary(salary);

        empService.addEmployee(emp);
        System.out.println("Employee added successfully!");
    }

    private void updateEmplyee() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter department: ");
        String department = scanner.nextLine();
        System.out.print("Enter salary: ");
        double salary = Double.parseDouble(scanner.nextLine());
    }

    public void run() throws SQLException {
        while (true) {
            showMenu();
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    addEmployee();
                    break;
//                    case 2:
//                        viewAllEmployees();
//                        break;
//                    case 3:
//                        updateEmployee();
//                        break;
//                    case 4:
//                        deleteEmployee();
//                        break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
    public static void main(String[] args) throws SQLException {
        System.out.println("Hello world!");
        Main app = new Main();
        app.run();
    }
}