import java.lang.String;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Statement;
public class Main {

	 public static void main(String[] args) {
		
		 try {
			Connection connection= DBConnexion.get_connection();
			Statement stmt = connection.createStatement(); 
			 
         	// Create a mission instance
         	/*UserClass user1 = new UserClass(101, "John", "Doe", Date.valueOf("1990-01-01"), 1234567890, "john.doe@example.com", "Somewhere");
         	UserClass user2 = new UserClass(201, "Pohn", "Doe", Date.valueOf("1990-01-01"), 1234567890, "john.doe@example.com", "Somewhere");
         	UserClass user3 = new UserClass(301, "Cohn", "Doe", Date.valueOf("1990-01-01"), 1234567890, "john.doe@example.com", "Somewhere");
         	user1.Add_User(user1,connection);
         	user2.Add_User(user2,connection);
         	user3.Add_User(user3,connection);*/
            stmt.executeUpdate("DELETE FROM Volunteer "); // Cleanup
            stmt.executeUpdate("DELETE FROM UserInNeed "); // Cleanup
            stmt.executeUpdate("DELETE FROM Validator "); // Cleanup
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	 }  
}

