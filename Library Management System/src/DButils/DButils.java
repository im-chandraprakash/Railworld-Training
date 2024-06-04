package DButils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DButils {


    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/librarymanagementsystem";
    private  static final String JDBC_USERNAME = "root";
    private  static  final String JDBC_PASSWORD = "Chandra123#";

    public Connection getConnection() throws SQLException {
        Connection connection = DriverManager.getConnection(JDBC_URL , JDBC_USERNAME , JDBC_PASSWORD);
        return connection;
    }
}
