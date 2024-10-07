

public class Volunteer extends UserClass {
	private String location;
	public Volunteer (String name,String surname,String birth_date,int phone,String email,String location) {
		super(name, surname, birth_date,phone, email);
		this.location = location;
	}
	
	public String get_location() {
		return location;
	}
	
	public void set_name(String new_location) {
		this.location = new_location;
	}
	
	
	
}
