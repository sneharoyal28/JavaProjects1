package xyz;

import java.sql.*;

public class JDBCtest {
    public static void main(String[] args) {
        // Database connection details
        String jdbcURL = "jdbc:mysql://localhost:3306/customer1";
        String username = "admin";
        String password = "1234";

        // SQL query for inserting data using REPLACE (insert or update)
        String insertSQL = "REPLACE INTO std2 (id, name) VALUES (?, ?)";

        // Sample student data
        Object[][] std2 = {
            {1, "varsha"},
            {2, "thanuja"},
            {3, "geethika"},
            {4, "honey"},
            {5, "lucky"},
            {6, "manasa"}
        };

        try (
            // Establish connection to MySQL
            Connection con = DriverManager.getConnection(jdbcURL, username, password);
            // Prepare insert query
            PreparedStatement pstmt = con.prepareStatement(insertSQL);
            // Create statement for data retrieval
            Statement stmt = con.createStatement()
        ) {
            // Load the JDBC driver (optional for JDBC 4.0+)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Insert each student into the table
            for (Object[] student : std2) {
                pstmt.setInt(1, (int) student[0]);
                pstmt.setString(2, (String) student[1]);
                pstmt.executeUpdate();
            }

            // Retrieve and display all records from std2
            ResultSet rs = stmt.executeQuery("SELECT * FROM std2");

            System.out.println("Student List:");
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " " + rs.getString("name"));
            }

        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Database error occurred.");
            e.printStackTrace();
        }
    }
}
