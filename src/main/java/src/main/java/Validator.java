import java.sql.Date;

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

	
	
}
