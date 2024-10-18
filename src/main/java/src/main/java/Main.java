import java.lang.String;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Statement;
public class Main {

	 public static void main(String[] args) {
		 UserClass person = new UserClass(3, "Jane", "Doe", Date.valueOf("1990-01-01"), 1234567890, "jane.doe@example.com", "Los Angeles");
		 try {
	            person.Add_User(person);  // Call Add_User on the person instance
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	 }  
}

