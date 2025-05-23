package lectorials.week09;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStmtDemo {
	public static void main(String[] args) {
		try {
			
			int[] studentNumbers = {20, 30, 40};
			String[] studentNames = {"John", "Jack", "Julie"};
		
			Connection connection = DriverManager.getConnection("jdbc:sqlite:demo.db");
			PreparedStatement pst = connection.prepareStatement("insert into students values (?, ?)");
			
			for(int i=0; i < studentNames.length; i++) {						
				pst.setInt(1, studentNumbers[i]);
				pst.setString(2, studentNames[i]);
				pst.execute();
			}
			
			
			
				
		}catch (SQLException e) {
			System.err.println(e.getMessage());
		}
	}
}
