import java.sql.Date;

public class UserInNeed extends UserClass {
	public UserInNeed(int id, String name,String surname,Date birth_date,int phone,String email,String location) {
		super(id,name, surname, birth_date,phone, email,location);
	}
}
