import java.sql.ResultSet;
import java.sql.Statement;

public class StudentModel extends Model {
    int id;
    String name;
    
    public StudentModel getOne(int studId) {
        String sql = "SELECT * FROM film WHERE film_id = " + studId;
        Statement stmt = this.getStmt();
        StudentModel stud = new StudentModel();
        try {
            ResultSet rs = stmt.executeQuery(sql);
            
            if (rs.next()) {
                stud.id = rs.getInt("film_id");
                stud.name = rs.getString("title");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return stud;
    }
    
    public static void main(String[] args) {
        StudentModel stud = new StudentModel().getOne(2);
        System.out.println(stud.name);
    }
}
