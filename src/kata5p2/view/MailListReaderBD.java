package kata5p2.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import kata5p2.model.Mail;

public class MailListReaderBD {
    
    
    public static Connection connect() {
        String url = "jdbc:sqlite:mail.db"; 
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) { 
            System.out.println(e.getMessage());
        }
        return conn;
    }
    
    public static List<String> read() {
        ArrayList<String> emails = new ArrayList<>();
        String sql = "SELECT * FROM EMAIL";
        
        try (Connection conn = MailListReaderBD.connect();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                emails.add(rs.getString("Mail"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return emails;
    }
    
}