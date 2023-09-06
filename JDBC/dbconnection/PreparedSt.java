package dbconnection;

import java.sql.*;
import java.util.Scanner;

public class PreparedSt {
    static Connection connection=null;
    static Statement statement=null;
    static ResultSet resultSet=null;
    static PreparedStatement preparedStatement=null;
    static String query;
    public static void main(String[] args)throws Exception
    {
       
        try{
        	Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","Ambika@5001");
            System.out.println("Connection to Mysql has been established.");
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Connection Failed");
        }
        // Insert
        String query = "insert into login values (?,?,?)";
        preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1,7);
        preparedStatement.setString(2,"Ambi");
        preparedStatement.setString(3,"2000");
        preparedStatement.executeUpdate();
        
        // Read
        query = "select * from login";
        preparedStatement = connection.prepareStatement(query);
        resultSet = preparedStatement.executeQuery();
        
      //Delete
        query = "delete from login where id=?";
        preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1,5);
        int x = preparedStatement.executeUpdate();

        //Modify
        query = "update login set name = 'Ambika R' where id = 1;";
        preparedStatement = connection.prepareStatement(query);
        int  y = preparedStatement.executeUpdate();
    }
                              
}