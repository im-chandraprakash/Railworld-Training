package service;

import dao.EmployeeDao;
import model.Employee;

import java.sql.SQLException;

public class EmployeeService {

    EmployeeDao employeeDao;
    public EmployeeService() {
        employeeDao = new EmployeeDao();
    }

    public void addEmployee(Employee employee) throws SQLException {
        employeeDao.addEmployee(employee);
    }
    public void updateEmployee(Employee employee) throws SQLException {
//        employeeDao.addEmployee(employee);
    }
    public void deleteEmployee(int id) throws SQLException {
//        employeeDao.addEmployee(employee);
    }



}
