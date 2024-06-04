package Dao;
import DButils.DButils;
import Models.Book;
import Output.TableOutput;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LibraryDao {

    DButils dButils;
    TableOutput tableOutput;

    public  LibraryDao(){
        tableOutput = new TableOutput();
        dButils = new DButils();
    }

    public void BookCreationDao(Book book) throws SQLException {

        String query = "INSERT INTO Book (Title, Author, Publisher, CategoryId, TotalCopies, AvailableCopies) " +
                "VALUES (?, ?, ?, ?, ?, ?)";

        try(Connection conn = dButils.getConnection() ) {
            PreparedStatement stmt = conn.prepareStatement(query);

            stmt.setString(1 , book.getTitle());
            stmt.setString(2 , book.getAuthor());
            stmt.setString(3 , book.getPublisher());
            stmt.setInt(4  ,book.getCategoryId());
            stmt.setInt(5 , book.getTotalCopies());
            stmt.setInt(6 , book.getAvailableCopies());

            stmt.executeUpdate();
        }
    }

    public void SearchBook(String bookName , String authorName) throws SQLException{

        String query = "SELECT * FROM book WHERE Title = ? AND Author = ?";

        try( Connection conn = dButils.getConnection()) {
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1 , bookName);
            stmt.setString(2 , authorName);

            ResultSet rs = stmt.executeQuery();

            tableOutput.printInTableForm(rs);
        }
    }

    public void SearchStudent(String studentName , String studentEmail) throws SQLException {
        String query = "SELECT * FROM student WHERE Name = ? AND Email = ?";

        try(Connection conn = dButils.getConnection()){
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1 , studentName);
            stmt.setString(2 , studentEmail);

            ResultSet rs  = stmt.executeQuery();
            tableOutput.printInTableForm(rs);
        }
    }

    public void SearchCategory(String categoryName) throws SQLException {
        String query = "SELECT * FROM Category WHERE CategoryName = ?";

        try(Connection conn = dButils.getConnection()){
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1 , categoryName);
            ResultSet rs  = stmt.executeQuery();
            tableOutput.printInTableForm(rs);
        }
    }
    public void SearchLibrarian(String userName , String userEmail) throws  SQLException{
        String query = "SELECT * FROM Users WHERE UserName = ? AND Email = ?";

        try(Connection conn = dButils.getConnection()){
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1 , userName);
            stmt.setString(2 , userEmail);

            ResultSet rs = stmt.executeQuery();
            tableOutput.printInTableForm(rs);
        }
    }
}
