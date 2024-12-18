import java.lang.String;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Statement;


public class Review {
	private int review_id;
	private int user_id;
	
	private int grade;
	private String comments;
	
	public Review(int review_id, int user_id, int grade, String comments) {
		this.review_id = review_id;
		this.user_id = user_id;
		this.grade = grade; 
		this.comments = comments;
	}
	
	
	public int getReview_id() {
		return review_id;
	}
	public void setReview_id(int review_id) {
		this.review_id = review_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getComment() {
		return comments;
	}
	public void setComment(String comments) {
		this.comments = comments;
	}
	
    public String ReviewToString() {
        return "('" + review_id + "', '" + user_id + "', '" + grade + "', '" + comments.replace("'", "''") + "')";
    }

  
    public void Add_Review(Review r) throws SQLException {
        Connection conn = DBConnexion.get_connection();
        Statement stmt = conn.createStatement();
        
        stmt.executeUpdate("INSERT INTO Review VALUES " + r.ReviewToString());
    }
    
	
	

}
