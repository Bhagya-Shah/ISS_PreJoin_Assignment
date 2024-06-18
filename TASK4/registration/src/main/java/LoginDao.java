import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDao {
    private String dburl = "jdbc:mysql://localhost:3306/infodb";
    private String dbuname = "root";
    private String dbpassword = "@ISSBhagya2024";
    private String dbdriver = "com.mysql.jdbc.Driver";

    public Connection getConnection() {
        try {
            Class.forName(dbdriver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Connection con = null;
        try {
            con = DriverManager.getConnection(dburl, dbuname, dbpassword);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }

    public boolean validate(String uname, String password) {
        Connection con = getConnection();
        String sql = "SELECT * FROM member WHERE uname = ? AND password = ?";
        boolean status = false;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, uname);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            status = rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return status;
    }
}
