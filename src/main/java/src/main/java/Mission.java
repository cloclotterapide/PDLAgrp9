import java.lang.String;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Statement;

public class Mission {
	
	private int validator_id;
	private int userInNeed_id;
	private int volunteer_id;
	
	private int mission_id;
	private String location;
	private Date mission_Date;
	private String title;
	private String description;
	public enum mission_state {waiting_Volunteer,Accepted,Started,Finished};
	private mission_state state;
	
	public Mission(int mission_id,int volunteer_id, int validator_id, int userInNeed_id, String location, Date mission_Date, String title, String description,mission_state state) {
		this.mission_id = mission_id;
		this.volunteer_id = volunteer_id;
		this.validator_id = validator_id; 
		this.userInNeed_id = userInNeed_id;
		this.location = location;
		this.mission_Date = mission_Date;
		this.title = title;
		this.description = description;
		this.state = state;
	}
	
	public int get_mission_id() {
		return mission_id;
	}

	public void set_mission_id(int mission_id) {
		this.mission_id = mission_id;
	}
	
	public int get_volunteer_id() {
		return volunteer_id;
	}

	public void set_volunteer_id(int volunteer_id) {
		this.volunteer_id = volunteer_id;
	}

	public int get_Validator_id() {
		return validator_id;
	}

	public void set_Validator_id(int validator_id) {
		this.validator_id = validator_id;
	}

	public int get_UserInNeed_id() {
		return userInNeed_id;
	}

	public void set_UserInNeed_id(int userInNeed_id) {
		this.userInNeed_id = userInNeed_id;
	}

	public String get_Location() {
		return location;
	}

	public void set_Location(String location) {
		this.location = location;
	}

	public Date get_Mission_Date() {
		return mission_Date;
	}

	public void set_Mission_Date(Date mission_Date) {
		this.mission_Date = mission_Date;
	}

	public String get_Title() {
		return title;
	}

	public void set_Title(String title) {
		this.title = title;
	}

	public String get_Description() {
		return description;
	}

	public void set_Description(String description) {
		this.description = description;
	}

	public mission_state get_State() {
		return state;
	}

	public void set_State(mission_state state) {
		this.state = state;
	}
	
	public String MissionToString(Mission m) {
        return "('" + mission_id +"', '"+ location + "', '" + mission_Date +"' , '" + title + "' ,'" + description + "', '" + state + "', '" +volunteer_id + "', '" + validator_id + "', '" + userInNeed_id +  "')" ;
	}

    public void Add_Mission(Mission m,Connection conn) throws SQLException {
        Statement stmt = conn.createStatement();
        
        stmt.executeUpdate("INSERT INTO Mission VALUES " + MissionToString(m));
        System.out.println("add mission");
    }
	
    public static void Mission_State_Udpate(Mission m, mission_state ms,Connection conn)throws SQLException  {
    	m.set_State(ms);
        Statement stmt = conn.createStatement();
        
        stmt.executeUpdate("UPDATE Mission SET state =" + ms +" WHERE mission_id="+ m.mission_id );
    }
    
}
