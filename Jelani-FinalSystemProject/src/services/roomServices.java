
package services;
import JDBCConnector.JDBCConnector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
//import services.roomServices;
import hotel.Userdaw;
import java.sql.SQLException;


public class roomServices {
    
    private Connection connection;
    private JDBCConnector jdbccon;
    private PreparedStatement ps;
    private String sql;
    private ResultSet rs;
    private ResultSetMetaData rm;
    
     public roomServices () {
        this.jdbccon = new JDBCConnector ();
        this.connection = (Connection) new JDBCConnector().getConnection();
    }
    
    
    public void addroom(Userdaw userdaw) {
       try {
             sql = "INSERT into room (name, categories, bed, status, price) values (?,?,?,?,?);";
             ps = connection.prepareStatement(sql);
             ps.setString(1, userdaw.getName());
             ps.setString(2, userdaw.getCategories());
             ps.setString(3, userdaw.getBed());
             ps.setString(4, userdaw.getStatus());
             ps.setInt(5, userdaw.getPrice());
            
             
             int result = ps.executeUpdate();
             if (result > 0){
                 JOptionPane.showMessageDialog(null, " Data Added ");
             }else{
                 JOptionPane.showMessageDialog(null, " Data wala na add do ");
             }
            } catch (Exception e) {
               Logger.getLogger(roomServices.class.getName()).log(Level.SEVERE, null,e);
        
            }
       
    }
    public void updateroom(Userdaw userdaw, int idroom){
        try {
            sql = "UPDATE room SET  name=?, categories=?, bed=?, status=?, price=? WHERE idroom=?";
            ps = connection.prepareStatement(sql);
            ps.setString(1, userdaw.getName());
            ps.setString(2, userdaw.getCategories());
            ps.setString(3, userdaw.getBed());
            ps.setString(4, userdaw.getStatus());
            ps.setInt(5, userdaw.getPrice());
            ps.setInt(6, idroom);
            
            ps.executeUpdate();
        JOptionPane.showMessageDialog(null, "Room successfully updated");
        } catch (Exception e) {
            Logger.getLogger(roomServices.class.getName()).log(Level.SEVERE, null, e);
        JOptionPane.showMessageDialog(null, "Failed to update room");
        }
    }
    public void deleteroom(int idroom) throws SQLException{
    
        try {
            sql = "DELETE FROM room WHERE idroom=?";
            ps = connection.prepareStatement(sql);
            ps.setInt(1, idroom);
            ps.execute();
            JOptionPane.showMessageDialog(null, "User successfully deleted");
        } catch (SQLException e) {
            Logger.getLogger(roomServices.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Failed to delete User");
        }
} 
    
    public void populateTable(DefaultTableModel model){
        try {
            model.setRowCount(0);
            sql = "SELECT * FROM room";
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            rm = rs.getMetaData();
            int columnCount = rm.getColumnCount();
            while (rs.next()){
                Object[] row = new Object[columnCount];
                for(int i = 1; i < columnCount; i++){
                    row[i - 1] = rs.getObject(i);
                }
                model.addRow(row);
            }
                    
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
