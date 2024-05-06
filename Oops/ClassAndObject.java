package Oops;

public abstract class ClassAndObject {
    
    static String emp_name;
    static float emp_salary;

    static void setData(String name , float salary){
        emp_name = name;
        emp_salary = salary;
    }

    static void getData(){
        System.out.println("Employee name is : " + emp_name);
        System.out.println("Employee Salary is : " + emp_salary);
    }
    public static void main(String[] args) {
        
        emp_name = "chndra";
        emp_salary = 10.13f;

        getData();
    }
}
