import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Statement;
import java.lang.String;

public class Volunteer extends UserClass {
	public Volunteer (int id, String name,String surname,Date birth_date,int phone,String email,String location) {
		super(id,name, surname, birth_date,phone, email,location);
	}
	
	
	public void Volunteer_Select_Mission(Volunteer v, Mission m) {
		
		
	}
	
	
	public String volunteerToString(Volunteer volunteer) {
        return "INSERT INTO Volunteer (idVolunteer, name, surname, birth_date, phone, email, location) VALUES (" +
               "'" + volunteer.get_id() + "', " +
               "'" + volunteer.get_name() + "', " +
               "'" + volunteer.get_surname() + "', " +
               "'" + volunteer.get_birth_date() + "', " +
               "'" + volunteer.get_phone() + "', " +
               "'" + volunteer.get_email() + "', " +
               "'" + volunteer.getLocation() + "')";
    }

    // Method to add a Volunteer to the database
    public void addVolunteer(Volunteer volunteer, Connection conn) throws SQLException {
        Statement stmt = conn.createStatement();

        // Execute the SQL statement generated by volunteerToString
        stmt.executeUpdate(volunteerToString(volunteer));
        
    }
}
