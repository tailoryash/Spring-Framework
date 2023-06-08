import javax.swing.plaf.nimbus.State;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchData {
    public static void main(String[] args) {
        try{
            Connection c = ConnectionProvider.getConnection();
            String query = "select * from ex1 ";
            Statement st = c.createStatement();
            ResultSet rs =  st.executeQuery(query);

            while(rs.next()){
                int id = rs.getInt(1);
                String name = rs.getString(2);
                String city = rs.getString(3);
                System.out.println(name + "," + id + "," + city);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
