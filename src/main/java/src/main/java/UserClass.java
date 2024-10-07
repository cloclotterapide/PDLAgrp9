import java.lang.String;
import java.sql.Date;

public class UserClass {
	private int id;
	private String name ;
	private String surname;
	private Date birth_date ;
	private int phone;
	private String email;
	
	// Constructor
	public UserClass (int id,String name,String surname,Date birth_date,int phone,String email) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.birth_date = birth_date;
		this.phone = phone;
		this.email = email;
	}
	
	//gets
	public int get_id () {
		return id;
	}
	public String get_name() {
		return name;
	}
	
	public String get_surname() {
		return surname;
	}
	
	public Date get_birth_date() {
		return birth_date;
	}
	
	public int get_phone() {
		return phone;
	}
	
	public String get_email() {
		return email;
	}
	
	//sets
	public void set_id (int id) {
		this.id = id;
	}
	
	public void set_name(String new_name) {
		this.name = new_name;
	}
	
	public void set_surname(String new_surname) {
		this.surname = new_surname;
	}
	
	public void set_birthdate(Date new_birth_date) {
		this.birth_date= new_birth_date;
	}
	
	public void set_phone(int new_phone) {
		this.phone= new_phone;
	}
	
	public void get_email(String new_email) {
		this.email = new_email;
	}
	
}
