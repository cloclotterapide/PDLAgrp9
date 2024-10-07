import java.sql.Date;
import java.lang.String;

public class Volunteer extends UserClass {
	private String location;
	public Volunteer (int id, String name,String surname,Date birth_date,int phone,String email,String location) {
		super(id,name, surname, birth_date,phone, email);
		this.location = location;
	}
	
	public String get_location() {
		return location;
	}
	
	public void set_name(String new_location) {
		this.location = new_location;
	}
	
	
	
}
