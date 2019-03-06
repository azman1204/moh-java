import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Model {
    public Statement getStmt() {
        Connection con = null;
        Statement stmt = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila", "root", "");
            stmt = con.createStatement();
        } catch (Exception e) {
            System.out.println("Berlaku Error");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return stmt;
    }
}
