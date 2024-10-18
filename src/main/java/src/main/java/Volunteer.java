import java.sql.Date;
import java.lang.String;

public class Volunteer extends UserClass {
	public Volunteer (int id, String name,String surname,Date birth_date,int phone,String email,String location) {
		super(id,name, surname, birth_date,phone, email,location);
	}
	
}
