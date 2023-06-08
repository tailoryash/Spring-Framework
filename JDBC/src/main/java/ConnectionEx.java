import java.sql.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ConnectionEx {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/springjdbc";
            String username = "root";
            String password = "Simform@123";
            Connection con = DriverManager.getConnection(url, username, password);
            if(con.isClosed()){
                System.out.println("Connection Closed");
            }else{
                System.out.println("Connection is Open");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}