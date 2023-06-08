import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SaveLargeImg {
    public static void main(String[] args) {
        Connection c = ConnectionProvider.getConnection();
        String query = "insert into images(pic) values(?)";
        try {
            PreparedStatement pt = c.prepareStatement(query);
            JFileChooser jfc = new JFileChooser();
            jfc.showOpenDialog(null);
            File file = jfc.getSelectedFile();
            FileInputStream fis = new FileInputStream(file);
            pt.setBinaryStream(1, fis, fis.available());
            pt.executeUpdate();
            JOptionPane.showMessageDialog(null, "success");
        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }

    }
}
