import java.lang.String;

public class UserClass {
	private String name ;
	private String surname;
	private String birth_date ;
	private int phone;
	private String email;
	
	// Constructor
	public UserClass (String name,String surname,String birth_date,int phone,String email) {
		this.name = name;
		this.surname = surname;
		this.birth_date = birth_date;
		this.phone = phone;
		this.email = email;
	}
	
	//gets
	public String get_name() {
		return name;
	}
	
	public String get_surname() {
		return surname;
	}
	
	public String get_birth_date() {
		return birth_date;
	}
	
	public int get_phone() {
		return phone;
	}
	
	public String get_email() {
		return email;
	}
	
	//sets
	public void set_name(String new_name) {
		this.name = new_name;
	}
	
	public void set_surname(String new_surname) {
		this.surname = new_surname;
	}
	
	public void set_birthdate(String new_birth_date) {
		this.birth_date= new_birth_date;
	}
	
	public void set_phone(int new_phone) {
		this.phone= new_phone;
	}
	
	public void get_email(String new_email) {
		this.email = new_email;
	}
	
	
	
}
