import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnexion {
	static final String DB_URL = "jdbc:mysql://srv-bdens.insa-toulouse.fr:3306/projet_gei_009";
	 static final String USER = "projet_gei_009";
	 static final String PASS = "Hi7ifaix";
	 
	 public static Connection get_connection() throws SQLException {
		 return DriverManager.getConnection(DB_URL,USER, PASS);
	 }
	
}
