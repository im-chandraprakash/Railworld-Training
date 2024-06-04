package Dao;

import DButils.DButils;
import Models.Student;
import Models.Transaction;
import Output.TableOutput;

import java.sql.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class StudentDao {


    DButils dButils = new DButils();
    TableOutput tableOutput = new TableOutput();

    public void RegisterStudent(Student student) throws SQLException {

        String query = "INSERT INTO STUDENT (Name , Email , PhoneNo, Address) VALUES (? , ? , ? , ?)";

        try(Connection conn = dButils.getConnection()){
            PreparedStatement stmt = conn.prepareStatement(query);

            stmt.setString(1 , student.getName());
            stmt.setString(2 , student.getEmail());
            stmt.setInt(3 , student.getPhoneNo());
            stmt.setString(4 , student.getAddress());

            stmt.executeUpdate();
        }
    }

    public void BuySubscription(String name , String email ) throws  SQLException {

        String query = "UPDATE Student SET SubscriptionDate = ?, ExpiryDate = ?, IsSubscribed = ? WHERE Name = ? OR Email = ?";

        LocalDate subsciptionDate = LocalDate.now();
        LocalDate expiryDate = subsciptionDate.plusYears(1);

        try(Connection conn = dButils.getConnection()){
            PreparedStatement stmt = conn.prepareStatement(query);
            System.out.println(subsciptionDate);
            System.out.println(Date.valueOf(subsciptionDate));
            stmt.setDate(1 , Date.valueOf(subsciptionDate));
            stmt.setDate(2  , Date.valueOf(expiryDate));
            stmt.setBoolean(3 , true);
            stmt.setString(4  , name );
            stmt.setString(5 , email);
            stmt.executeUpdate();
        }
    }

    public void BookIssue (int studentId ,int bookId , LocalDate returnDate) throws  SQLException {

        String query = "INSERT INTO TRANSACTION (BookId , StudentId , IssueDate , DueDate, ReservationStatus) VALUES (? , ? , ? , ? , ?)";
        String updateStudentQuery = "UPDATE Student SET TotalBookIssued = TotalBookIssued + 1 WHERE StudentId = ?";
        String bookAvailableQuery = "SELECT * FROM Book WHERE BookId = ?";
        String updateBookQuery = "UPDATE Book SET AvailableCopies = AvailableCopies - 1 WHERE BookId = ?";
        String countQuery = "SELECT COUNT(*) FROM Transaction WHERE BookId = ? AND StudentId = ? AND ReservationStatus = 'Issue'";


        LocalDate IssueDate = LocalDate.now();
        try(Connection conn = dButils.getConnection()){

            if (!isStudentSubscribed(conn, studentId)) {
                System.out.println("Buy subscription first.");
                return;
            }

            // verify already not issued by the same user
            PreparedStatement issueStmt = conn.prepareStatement(countQuery);
            issueStmt.setInt(1 , bookId);
            issueStmt.setInt(2 , studentId);
            ResultSet rs = issueStmt.executeQuery();
            while (rs.next()){
                int count = rs.getInt(1);
                if(count != 0){
                    System.out.println("You Can't Issue the Same Book Again");
                    return;
                }
            }

            //verify the available books
            PreparedStatement astmt = conn.prepareStatement(bookAvailableQuery);
            astmt.setInt(1 , bookId);
            ResultSet availableSet = astmt.executeQuery();

            while(availableSet.next()){
                int availableCopies = availableSet.getInt("AvailableCopies");
                if(availableCopies <= 0){
                    System.out.println("Book is not Avaialable");
                    return;
                }
            }

            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1 , bookId);
            stmt.setInt(2 , studentId);
            stmt.setDate(3 , Date.valueOf(IssueDate));
            stmt.setDate(4 , Date.valueOf(returnDate));
            stmt.setString(5 , "Issue");
            stmt.executeUpdate();


            try(PreparedStatement stmt1 = conn.prepareStatement(updateStudentQuery);){
                stmt1.setInt(1 , studentId);
                stmt1.executeUpdate();
            }
            try( PreparedStatement stmt2 = conn.prepareStatement(updateBookQuery);){
                stmt2.setInt(1 , bookId);
                stmt2.executeUpdate();
            }


            System.out.println("Book Has been Issued Successfully");
        }
    }
    private boolean isStudentSubscribed(Connection conn, int studentId) throws  SQLException {
        String checkSubscriptionQuery = "SELECT IsSubscribed FROM STUDENT WHERE StudentId = ?";
        try (PreparedStatement stmt = conn.prepareStatement(checkSubscriptionQuery)) {
            stmt.setInt(1, studentId);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getBoolean("IsSubscribed");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    public  void SubmitBook(int studentId , int bookId ) throws  SQLException {

        String query = "SELECT * FROM Transaction WHERE StudentId = ? AND BookId = ? AND ReservationStatus = 'Issue'";
        String updateQuery = "UPDATE Transaction SET ReservationStatus = ?, FineAmount = ?, ReturnDate = ? WHERE StudentId = ? AND BookId = ?";
        String updateStudentQuery = "UPDATE Student SET TotalBookIssued = TotalBookIssued - 1 WHERE StudentId = ?";
        String updateBookQuery = "UPDATE Book SET AvailableCopies = AvailableCopies + 1 WHERE BookId = ?";


        LocalDate returnDate = LocalDate.now();
        try(Connection conn = dButils.getConnection()){

            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1 , studentId);
            stmt.setInt(2 , bookId);
            ResultSet result = stmt.executeQuery();

            while (result.next()) {

                LocalDate dueDate = result.getDate("DueDate").toLocalDate();
                LocalDate todayDate = LocalDate.now();
                long daysBetween = ChronoUnit.DAYS.between(dueDate , todayDate) - 1;
                long fine = 0;

                if (returnDate.isAfter(dueDate)) {
                    fine = daysBetween * 20;
                    System.out.println("You are out of Date so your penalty comes to: " + fine + " for "+ daysBetween + " (20Rs/Day)");
                } else {
                    System.out.println("The book is returned on time. No penalty.");
                }
                try (PreparedStatement updateStmt = conn.prepareStatement(updateQuery)) {
                    updateStmt.setString(1, "submitted");
                    updateStmt.setLong(2, fine);
                    updateStmt.setDate(3, Date.valueOf(todayDate));
                    updateStmt.setInt(4, studentId);
                    updateStmt.setInt(5, bookId);
                    updateStmt.executeUpdate();
                }
            }

            PreparedStatement stmt1 = conn.prepareStatement(updateStudentQuery);
            PreparedStatement stmt2 = conn.prepareStatement(updateBookQuery);

            stmt1.setInt(1 , studentId);
            stmt2.setInt(1, bookId);

            stmt1.executeUpdate();
            stmt2.executeUpdate();

        }
    }

    public void ViewProfile( int studentId) throws  SQLException {

        String query = "SELECT * FROM Student WHERE StudentId=?";

        try(Connection conn = dButils.getConnection()){
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1 , studentId);
            ResultSet result = stmt.executeQuery();

            while(result.next()){
                System.out.println("------------------------------------------------");
                System.out.println("Name is : " + result.getString("Name"));
                System.out.println("Email is : " + result.getString("Email"));
                System.out.println("Phone no. :" + result.getInt("PhoneNo"));
                System.out.println("Address is :" + result.getString("Address"));
                System.out.println("Total Book Issued : " + result.getInt("TotalBookIssued"));

                boolean prime = result.getBoolean("IsSubscribed");
                if(prime){
                    System.out.println("You Are Our Prime Member ⭐");
                    System.out.println("Your Subsciption Expiry Date is : " + result.getDate("ExpiryDate").toLocalDate());
                    System.out.println("-------------------------------------------");
                }
            }

        }

    }

    public void ViewAllBooks() throws  SQLException{

        String query = "SELECT * FROM Book";

        try(Connection conn = dButils.getConnection()) {

            PreparedStatement stmt = conn.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();

            tableOutput.printInTableForm(rs);

        }
    }
}
