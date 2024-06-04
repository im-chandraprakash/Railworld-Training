import java.sql.*;

public class Main {

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/quizapp";
    private static final String JDBC_USERNAME = "root";
    private static final String JDBC_PASSWORD = "Chandra123#";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(JDBC_URL, JDBC_USERNAME, JDBC_PASSWORD);
    }

    public static void main(String[] args) {

        try (Connection connection = getConnection()) {
            System.out.println("Connected to the database!");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}