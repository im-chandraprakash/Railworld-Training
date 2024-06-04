package Dao;

import Models.Employee;
import Utils.DButil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmpyloyeeDao {


    public void addEmployeeDao(Employee employee) throws SQLException {

        String sql = "INSERT INTO employees (name , department , salary) VALUES (?, ? , ?)";

        try(Connection conn = DButil.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, employee.getName());
            stmt.setString(2, employee.getDept());
            stmt.setDouble(3, employee.getSalary());

            stmt.executeUpdate();
        }
    }

    public void updateEmployeeDao(Employee employee) throws  SQLException {

        String sql = "UPDATE employees SET name = ? , department = ? , salary = ? WHERE id = ?";
        try(Connection conn = DButil.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)){

            stmt.setString(1 , employee.getName());
            stmt.setString(2 , employee.getDept());
            stmt.setDouble(3 , employee.getSalary());
            stmt.setInt(4 , employee.getId());
            stmt.executeUpdate();
        }
    }

    public void deleteEmployeeDao(int id) throws SQLException {
        String sql = "DELETE FROM employees WHERE id = ?";
        try(Connection conn = DButil.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setInt(1 , id);
        }
    }
}
