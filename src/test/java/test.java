import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import org.junit.jupiter.api.*;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;

public class test {
    
    @Test
    void testAddUser() {
        try {
        	Connection connection= DBConnexion.get_connection();
        	 System.out.println("Starting test User");
            // Create a user instance
        	int id = 1;
            UserClass user = new UserClass(id, "John", "Doe", Date.valueOf("1990-01-01"), 1234567890, "john.doe@example.com", "Somewhere");
            // Add the user to the database
            user.Add_User(user,connection);

            // Verify the user exists in the database   
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM User WHERE id =" + id);
            assertTrue(rs.next(), "User should be present in the database");
            assertEquals("John", rs.getString("name"), "Name should match");
            //System.out.println("test2");
            assertEquals("Doe", rs.getString("surname"), "Surname should match");
            stmt.executeUpdate("DELETE FROM User WHERE id = "+ id); // Cleanup
            System.out.println("Successful user test");
        } catch (Exception e) {
            fail("Exception occurred during testAddUser: " + e.getMessage());
        }
    }
    
       @Test
        void testAddMission() {
            try {
            	Connection connection = DBConnexion.get_connection();
                System.out.println("Starting test mission");

                // Step 1: Add Volunteer
                int idvo = 1001;
                Volunteer volunteer = new Volunteer(idvo, "Jane", "Doe", java.sql.Date.valueOf("1990-04-20"), 987654321, "jane.doe@email.com", "Location B");
                volunteer.addVolunteer(volunteer, connection);
                
                // Step 2: Add UserInNeed
                int idne = 2001;
                UserInNeed userInNeed = new UserInNeed(idne, "Alice", "Smith", java.sql.Date.valueOf("1975-08-10"), 1122334455, "alice.smith@email.com", "Location C");
                userInNeed.addUserInNeed(userInNeed, connection);

                // Step 3: Add Validator
                int idva = 3001;
                Validator validator = new Validator(idva, "John", "Doe", java.sql.Date.valueOf("1985-05-15"), 1234567890, "john.doe@email.com", "Location A", "Type A");
                validator.addValidator(validator, connection);

                // Step 4: Create Mission
                int missionId = 101; // Example mission ID
                Mission mission = new Mission(missionId, idvo, idva, idne, "Location A", Date.valueOf("2024-01-01"), "Mission Title", "Mission Description", Mission.mission_state.waiting_Volunteer);
                
                // Step 5: Add Mission to the database
                //System.out.println(mission.MissionToString(mission));
                mission.Add_Mission(mission, connection);
                
                // Step 6: Verify the Mission exists in the database
                Statement stmt = connection.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM Mission WHERE id = " + missionId);

                assertTrue(rs.next(), "Mission should be present in the database");
                assertEquals("Location A", rs.getString("location"), "Location should match");
                assertEquals("Mission Title", rs.getString("title"), "Title should match");
                assertEquals("waiting_Volunteer", rs.getString("state"), "State should match");

                // Step 7: Cleanup after test
                stmt.executeUpdate("DELETE FROM Mission WHERE id = " + missionId);  // Correct delete statement syntax
                stmt.executeUpdate("DELETE FROM Validator WHERE idValidator = " + idva);    // Cleanup Validator
                stmt.executeUpdate("DELETE FROM Volunteer WHERE idVolunteer = " + idvo);    // Cleanup Volunteer
                stmt.executeUpdate("DELETE FROM UserInNeed WHERE idUserInNeed = " + idne); // Cleanup UserInNeed

                System.out.println("Successful Adding Mission test");

            } catch (Exception e) {
                fail("Exception occurred during testAddMission: " + e.getMessage());
            }
    }
       

	@Test
       void changeMissionState() {
    	   try {
	    	   Connection connection = DBConnexion.get_connection();
	           System.out.println("Starting test Changement mission");
	           
	           int idva = 3000;
	           int idvo = 1000;
	           int idne = 2000;
	           int missionId = 100; 
	           
	           
	           Volunteer volunteer = new Volunteer(idvo, "Jane", "Doe", java.sql.Date.valueOf("1990-04-20"), 987654321, "jane.doe@email.com", "Location B");
	           volunteer.addVolunteer(volunteer, connection);
	           
	           UserInNeed userInNeed = new UserInNeed(idne, "Alice", "Smith", java.sql.Date.valueOf("1975-08-10"), 1122334455, "alice.smith@email.com", "Location C");
	           userInNeed.addUserInNeed(userInNeed, connection);

	           
	           Validator validator = new Validator(idva, "John", "Doe", java.sql.Date.valueOf("1985-05-15"), 1234567890, "john.doe@email.com", "Location A", "Type A");
	           validator.addValidator(validator, connection);
	           
	           Mission mission = new Mission(missionId, idvo, idva, idne, "Location A", Date.valueOf("2024-01-01"), "Mission Title", "Mission Description", Mission.mission_state.waiting_Volunteer);
	           
	           mission.Add_Mission(mission, connection);
	           
	           
	           mission.Mission_State_Udpate(mission,Mission.mission_state.Accepted,connection);
	           
	           
	           Statement stmt = connection.createStatement();
               ResultSet rs = stmt.executeQuery("SELECT * FROM Mission WHERE id = " + missionId);
	           
	           assertTrue(rs.next(), "Mission should be present in the database");
	           assertEquals("Accepted", rs.getString("state"), "State should match");
	           
	           //clean up
	          
	           stmt.executeUpdate("DELETE FROM Mission WHERE id = " + missionId);  // Correct delete statement syntax
               stmt.executeUpdate("DELETE FROM Validator WHERE idValidator = " + idva);    // Cleanup Validator
               stmt.executeUpdate("DELETE FROM Volunteer WHERE idVolunteer = " + idvo);    // Cleanup Volunteer
               stmt.executeUpdate("DELETE FROM UserInNeed WHERE idUserInNeed = " + idne); // Cleanup UserInNeed
	           
               System.out.println("Successful Changing Mission state test");
    	   } catch (Exception e) {
               fail("Exception occurred during testAddMission: " + e.getMessage());
           }
    	   
       }
       
}


	
