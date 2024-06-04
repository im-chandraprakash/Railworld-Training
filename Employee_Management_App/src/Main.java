import Models.Employee;
import Services.EmployeeService;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {

    private final Scanner sc;
    EmployeeService employeeService = new EmployeeService();

    private  Main(){
       sc = new Scanner(System.in);
    }

     private void showMenu(){
        System.out.println("1. Add Employee");
        System.out.println("2. Update Employee");
        System.out.println("3. Delete Employee");
        System.out.println("4. Exit");
        System.out.println("Click any option");
    }

     private void addEmployee() throws SQLException  {

        System.out.println("Enter name of employee");
         String name = sc.nextLine();
        System.out.println("Enter department of employee");
         String dept = sc.nextLine();
        System.out.println("Enter salary of employee");
        double salary = Double.parseDouble(sc.nextLine());


         Employee emp = new Employee();
         emp.setName(name);
         emp.setDept(dept);
         emp.setSalary(salary);
         employeeService.addEmployeeService(emp);
         System.out.println("Employee added successfully");
    }

    private void updateEmployee() throws  SQLException {

        System.out.println("Enter id of employee");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Enter name of employee");
        String name = sc.nextLine();
        System.out.println("Enter department of employee");
        String dept = sc.nextLine();
        System.out.println("Enter salary of employee");
        double salary = Double.parseDouble(sc.nextLine());


        Employee emp = new Employee();
        emp.setName(name);
        emp.setDept(dept);
        emp.setSalary(salary);
        emp.setId(id);
        employeeService.updateEmployeeService(emp);
        System.out.println("Employee updated successfully");
    }

    private void run() throws  SQLException {

        while(true){

            showMenu();
            int option = sc.nextInt();
            sc.nextLine();
            switch (option){

                case 1 :
                    addEmployee();
                    break;
                case 2 :
                    updateEmployee();
                    break;
                case 3 :

                case 4 :
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("select right option");
                    break;
            }
        }
    }

    public static void main(String[] args) throws  SQLException {
        Main app = new Main();
       app.run();
    }
}