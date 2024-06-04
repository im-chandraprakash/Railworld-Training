package Dao;

import DButils.DButils;
import Models.Category;
import Models.Users;
import Output.TableOutput;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AdminDao {

    DButils dButils;
    TableOutput tableOutput;

    public  AdminDao(){
        dButils = new DButils();
        tableOutput = new TableOutput();
    }

    public void CreateCategoryDao(String categoryName , String categoryDescription) throws SQLException {

        String sql = "INSERT INTO Category (CategoryName , CategoryDescription) VALUES (? , ?)";

        try(Connection conn = dButils.getConnection()){
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString( 1 , categoryName);
            stmt.setString(2 , categoryDescription);
            stmt.executeUpdate();
        }
    }

    public void CreateLibrariansDao(Users users) throws SQLException {

        String query = "INSERT INTO Users (UserName , Password , Email , PhoneNumber) VALUES (? , ? , ? , ?)";

        try(Connection conn = dButils.getConnection()){
            PreparedStatement stmt = conn.prepareStatement(query);

            stmt.setString(1 , users.getUserName());
            stmt.setString(2 , users.getPassword());
            stmt.setString(3 , users.getEmail());
            stmt.setInt(4 , users.getPhoneNumber());
            stmt.executeUpdate();
        }
    }

    public void ViewAllStudents() throws  SQLException {
        String query = "SELECT * from Student";

        try(Connection conn = dButils.getConnection()){

            PreparedStatement stmt = conn.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            tableOutput.printInTableForm(rs);
        }
    }
    public void ViewAllCategories() throws  SQLException {
        String query = "SELECT * from Category";

        try(Connection conn = dButils.getConnection()){
            PreparedStatement stmt = conn.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            tableOutput.printInTableForm(rs);
        }
    }
    public  void ViewAllLibrarians() throws  SQLException{
        String query = "SELECT * from Users";

        try(Connection conn = dButils.getConnection()){
            PreparedStatement stmt = conn.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            tableOutput.printInTableForm(rs);
        }
    }


}
