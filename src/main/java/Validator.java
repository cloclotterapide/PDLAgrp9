import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Statement;


public class Validator extends UserClass {
	String validatorType;
	public Validator (int id, String name,String surname,Date birth_date,int phone,String email,String location,String validatorType) {
		super(id,name, surname, birth_date,phone, email,location);
		this.validatorType = validatorType;
	}
	
	public static void is_volunteer_accepted() {
		
	}

	public String getValidatorType() {
		return validatorType;
	}

	public void setValidatorType(String validatorType) {
		this.validatorType = validatorType;
	}
	public void validate_mission(Mission m,Connection conn) throws SQLException{
		Mission.Mission_State_Udpate(m,Mission.mission_state.Accepted,conn);
	}
	
	String validatortostring(Validator validator) {
		String vs = "INSERT INTO Validator (idValidator, name, surname, birth_date, phone, email, location, validatorType) VALUES (" +
                "'" + validator.get_id() + "', " +
                "'" + validator.get_name() + "', " +
                "'" + validator.get_surname() + "', " +
                "'" + validator.get_birth_date() + "', " +
                "'" + validator.get_phone() + "', " +
                "'" + validator.get_email() + "', " +
                "'" + validator.getLocation() + "', " +
                "'" + validator.getValidatorType() + "');";
		
		return vs;
	}
	
	public void addValidator(Validator validator, Connection conn) throws SQLException {
        Statement stmt = conn.createStatement();
        //System.out.println(validatortostring(validator));
        
        stmt.executeUpdate (validatortostring(validator));

    }
	
}
