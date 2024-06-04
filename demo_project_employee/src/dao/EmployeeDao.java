package dao;

import model.Employee;
import utils.DbConfig;

import java.sql.*;
public class EmployeeDao {

    public void addEmployee(Employee employee) throws SQLException {
        String sql = "INSERT INTO employees (name, department, salary) VALUES (?, ?, ?)";

        try (Connection conn = DbConfig.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, employee.getName());
            stmt.setString(2, employee.getDepartment());
            stmt.setDouble(3, employee.getSalary());
            stmt.executeUpdate();
        }
    }

//    public void updateEmplyee(Employee employee) throws SQLException {
//        String sql = "INSERT INTO employees (name, department, salary) VALUES (?, ?, ?)";
//
//        try (Connection conn = DbConfig.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
//            stmt.setString(1, employee.getName());
//            stmt.setString(2, employee.getDepartment());
//            stmt.setDouble(3, employee.getSalary());
//            stmt.executeUpdate();
//        }
//    }
}
