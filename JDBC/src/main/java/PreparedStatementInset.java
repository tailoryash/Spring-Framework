import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedStatementInset {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/springjdbc";
            String username = "root";
            String password = "Simform@123";
            Connection con = DriverManager.getConnection(url, username, password);
            String query = "insert into ex1(name, city) values (?, ?)";
            PreparedStatement st = con.prepareStatement(query);
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter a name : ");
            String name = bf.readLine();
            System.out.print("Enter a city : ");
            String city = bf.readLine();
            st.setString(1, name);
            st.setString(2, city);
            st.executeUpdate();
            System.out.println("Inserted !!");
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
