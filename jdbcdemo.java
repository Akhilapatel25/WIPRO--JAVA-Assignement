package javaassignment;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class jdbcdemo {
    public static void main(String[] args) {
        String jdbcURL = "jdbc:mysql://localhost:3306/wipro"; // replace with your DB name
        String username = "root"; // replace with your username
        String password = "akhilapatel25"; // replace with your password

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(jdbcURL, username, password);

            Statement stmt = conn.createStatement();
            String sql = "SELECT id, name, age, course, marks FROM Student";
            ResultSet rs = stmt.executeQuery(sql);

            System.out.println("Student Records:");
            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + " | " +
                    rs.getString("name") + " | " +
                    rs.getInt("age") + " | " +
                    rs.getString("course") + " | " +
                    rs.getDouble("marks")
                );
            }

            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

/*
 * 
 * Student Records:
1 | Akhila patel | 22 | CSE | 90.0
2 | Anjali patel | 25 | ECE | 95.0
3 | Haritha Reddy | 22 | CSE | 99.0

//*/
