package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConfig {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/employee_db";
    private static final String JDBC_USERNAME = "root";
    private static final String JDBC_PASSWORD = "Chandra123#";

    public static Connection getConnection() throws SQLException {
        Connection conn =  DriverManager.getConnection(JDBC_URL, JDBC_USERNAME, JDBC_PASSWORD);
        System.out.println("Database Connected Successfully");
        return conn;
    }
}
