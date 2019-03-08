package models;

import java.sql.ResultSet;
import java.sql.Statement;

public class UserModel extends Model {
    // return true jika staffid dan pwd matched
    public boolean isExist(String staffId, String pwd) {
        String sql = "SELECT * FROM users "
                   + "WHERE staff_id ='" + staffId + "' "
                   + "AND pwd = '" + pwd + "'";
        try {
            Statement stmt = this.getStmt();
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                return true; // user wujud
            } else {
                return false; // user tidak wujud
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }
    
    public static void main(String[] args) {
        UserModel model = new UserModel();
        if (model.isExist("11111", "12345")) {
            System.out.println("ok");
        } else {
            System.out.println("ko");
        }
    }
}
