import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


class DatabaseConnecion {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila?trueSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "root123");
	
		//This line will insert into actor
		String sql = "INSERT INTO actor (actor_id, first_name, last_name, last_update) VALUES (?, ?, ?, ?)";
		 
		PreparedStatement statement = connect.prepareStatement(sql);
		statement.setString(1, "00");
		statement.setString(2, "Bill");
		statement.setString(3, "Gates");
		statement.setString(4, "2006-02-15 04:34:33");
		 
		int rowsInserted = statement.executeUpdate();
		if (rowsInserted > 0) {
		    System.out.println("A new user was inserted successfully!");
		
		    
		 //This will delete the Bill first name row form the Actor Table
		    /*String sql = "DELETE FROM actor WHERE first_name=?";
			 
			PreparedStatement statement = connect.prepareStatement(sql);
			statement.setString(1, "bill");
			 
			int rowsDeleted = statement.executeUpdate();
			if (rowsDeleted > 0) {
			    System.out.println("A user was deleted successfully!");*/
		}
	}	
}
