package vulnerable;

import java.sql.*;

public class VulnerableExample {
    public static void main(String[] args) throws Exception {
        String userInput = "admin' OR '1'='1";
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "user", "pass");
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM users WHERE name = '" + userInput + "'");
        while (rs.next()) {
            System.out.println(rs.getString("name"));
        }
    }
}
