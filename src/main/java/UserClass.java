import java.lang.String;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Statement;

public class UserClass {
	private int id;
	private String name ;
	private String surname;
	private Date birth_date ;
	private int phone;
	private String email;
	private String location;
	
	// Constructor
	public UserClass (int id,String name,String surname,Date birth_date,int phone,String email,String location) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.birth_date = birth_date;
		this.phone = phone;
		this.email = email;
		this.location=location;
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
	
	
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
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
	public String UserToString(UserClass User) {
		return "('" + id +"', '"+name+ "', '"+ surname +"' , '"+ birth_date + "' ,'"+ phone + "' ,'"+ email + "' ,'"+location +"')" ;
	}
	
	public void Add_User(UserClass User,Connection conn) throws SQLException {
		Statement stmt = conn.createStatement();
		
		stmt.executeUpdate("INSERT INTO User VALUES " + UserToString(User));
	}
	 
	
}
