
import java.sql.*;

public class BDD {
   static final String DB_URL = "jdbc:mysql://srv-bdens.insa-toulouse.fr:3306/projet_gei_009";
   static final String USER = "projet_gei_009";
   static final String PASS = "Hi7ifaix";
   static final String QUERY = "SELECT id, name,surname FROM User";

   public static void main(String[] args) {
      // Open a connection
      try(Connection conn = DriverManager.getConnection(DB_URL,USER, PASS);
         Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery(QUERY);) {
         // Extract data from result set
         while (rs.next()) {
            // Retrieve by column name
            System.out.print("ID: " + rs.getInt("id"));
            System.out.print(", name: " + rs.getString("name"));
            System.out.print(", surname: " + rs.getString("surname"));

         }
      } catch (SQLException e) {
         e.printStackTrace();
      } 
   }
}
