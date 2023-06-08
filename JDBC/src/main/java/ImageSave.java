import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ImageSave {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/springjdbc";
            String username = "root";
            String password = "Simform@123";
            Connection con = DriverManager.getConnection(url, username, password);
            String query = "insert into images(pic) values (?)";
            PreparedStatement st = con.prepareStatement(query);
            FileInputStream fis = new FileInputStream("/home/yash/Downloads/yash.jpeg");
            st.setBinaryStream(1, fis, fis.available());
            st.executeUpdate();
            System.out.println("Inserted !!");
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
