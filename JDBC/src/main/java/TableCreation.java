import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TableCreation {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/springjdbc";
            String username = "root";
            String password = "Simform@123";
            Connection con = DriverManager.getConnection(url, username, password);
            Statement st = con.createStatement();
            String query = "create table ex1(id int(20) primary key auto_increment, name varchar(200) not null, city varchar(200))";
            st.executeUpdate(query);
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
