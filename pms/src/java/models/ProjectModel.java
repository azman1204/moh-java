package models;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class ProjectModel extends Model {
    private int id;
    private String title ;
    private String description;
    
    public ArrayList getAll() {
        
        ArrayList arr = new ArrayList();
        String sql = "SELECT * FROM project";
        try {
            Statement stmt = this.getStmt();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()) {
                ProjectModel pro = new ProjectModel();
                pro.id = rs.getInt("id");
                pro.title = rs.getString("title");
                arr.add(pro);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return arr;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public static void main(String[] args) {
        ProjectModel p = new ProjectModel();
        ArrayList list = p.getAll();
        for(int i=0; i<list.size(); i++) {
            ProjectModel pro = (ProjectModel) list.get(i);
            System.out.println(pro.title);
        }
    }
}
