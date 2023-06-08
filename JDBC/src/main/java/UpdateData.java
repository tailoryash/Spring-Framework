import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class UpdateData {
    public static void main(String[] args) {
        try{
            Connection con = ConnectionProvider.getConnection();
            String query = "update ex1 set name=?, city=? where id=?";
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter name : ");
            String name = br.readLine();

            System.out.print("Enter city name : ");
            String city = br.readLine();
            System.out.print("Enter id : ");
            int id = Integer.parseInt(br.readLine());

            PreparedStatement pt = con.prepareStatement(query);
            pt.setString(1, name);
            pt.setString(2, city);
            pt.setInt(3, id);
            pt.executeUpdate();
            System.out.println("Done....");


        }catch (Exception e){

        }
    }
}
