package dbconnection;

import java.sql.*;
import java.util.Scanner;

public class StatementDemo {
	static Connection connection = null;
	static Statement statement = null;
	static ResultSet resultSet = null;
	static PreparedStatement preparedStatement = null;
	static String query;

	public static void main(String[] args) throws Exception {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "Ambika@5001");
			System.out.println("Connection to Mysql has been established.");
		} catch (SQLException | ClassNotFoundException e) {
			System.out.println("Connection Failed");
		}
		// Insert
		query = "insert into login values(8,'ambika','2345')";
		statement = connection.createStatement();
		statement.executeUpdate(query);

		// Read
		query = "select * from login";
		resultSet = statement.executeQuery(query);

		// Delete
		query = "delete from login where id=1";
		int x = statement.executeUpdate(query);

		// Modify
		query = "update login set name = 'Ambi' where id = 2;";
		x = statement.executeUpdate(query);
	}
}
