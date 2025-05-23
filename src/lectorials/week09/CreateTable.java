package lectorials.week09;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
	public static void main(String[] args) {
		try {
			// Establish a connection.
			Connection connection = DriverManager.getConnection("jdbc:sqlite:demo.db");


			// Create a statement.
			Statement stmt = connection.createStatement();

			// Execute the statement.
			stmt.executeUpdate("create table courses (" +
					"id int not null, name varchar(50))");
			stmt.executeUpdate("insert into courses values(1295,'Advanced Programming')");
			ResultSet rs = stmt.executeQuery("select * from courses");


			// Process the ResultSet object.
			while(rs.next()) {
				System.out.println(rs.getString("id") + " " + rs.getString("name"));
			}


			// Close the connection.
			stmt.close();
			connection.close();
		}catch(SQLException e) {
			System.out.println("Something wrong with database connection");
		}

	}

}
