
package services;

import JDBCConnector.JDBCConnector;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import hotel.UserDao;
import services.roomServices;


public class addCustomer {
  private Connection connection;
    private JDBCConnector jdbccon;
    private PreparedStatement ps;
    private String sql;
    private ResultSet rs;
    private ResultSetMetaData rm;
   
    public addCustomer(){
        this.jdbccon = new JDBCConnector();
        this.connection = new JDBCConnector().getConnection();
    }
    
    public void BookingFrame(UserDao userdao){
        try {
            sql = "INSERT into bookings (Room, Customer, Date, Days, Cost) values(?,?,?,?,?)";
            ps = connection.prepareStatement(sql);
            ps.setObject(1, userdao.getRoom());
            ps.setInt(2, userdao.getCustomer());
            ps.setDate(3, (Date) userdao.getDate());
            ps.setObject(4, userdao.getDays());
            ps.setInt(5, userdao.getCost());
            
            
            int result = ps.executeUpdate();
            if (result > 0){
                JOptionPane.showMessageDialog(null, "Customer succesfully added");
                
            } else {
              JOptionPane.showMessageDialog(null, "Failed to add Customer");
            } 
            
            
        }catch (Exception e){  
             Logger.getLogger( addCustomer.class.getName()).log(Level.SEVERE,null,e);
        }
    }
    
 public void updateBooking(UserDao userdao, int idBooking) {
    try {
        // Prepare the SQL statement to update the booking in the database
        sql = "UPDATE bookings SET Room=?, Customer=?, Date=?, Days=?, Cost=? WHERE idbookings=?";
        ps = connection.prepareStatement(sql);

        // Set the values of the parameters in the SQL statement
        ps.setObject(1, userdao.getRoom());
        ps.setInt(2, userdao.getCustomer());
        ps.setDate(3, new java.sql.Date(userdao.getDate().getTime()));
        ps.setObject(4, userdao.getDays());
        ps.setInt(5, userdao.getCost());
        ps.setInt(6, idBooking);

        // Execute the SQL statement and update the booking in the database
        ps.executeUpdate();
        JOptionPane.showMessageDialog(null, "Booking successfully updated");
    } catch (Exception e) {
        // Log the exception and display an error message to the user
        Logger.getLogger(addCustomer.class.getName()).log(Level.SEVERE, null, e);
        JOptionPane.showMessageDialog(null, "Failed to update booking");
    }
}
 public void deleteroom(int idbookings) throws SQLException{
    
        try {
            sql = "DELETE FROM bookings WHERE idbookings=?";
            ps = connection.prepareStatement(sql);
            ps.setInt(1, idbookings);
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "User successfully deleted");
        } catch (SQLException e) {
            Logger.getLogger(roomServices.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Failed to delete User");
        }
} 
 
 
 
    
      public void populateTable(DefaultTableModel model){
          try {
              model.setRowCount(0);
              sql = "SELECT * FROM bookings";
              ps = connection.prepareStatement(sql);
              rs = ps.executeQuery();
              rm = rs.getMetaData();
              int columnCount = rm.getColumnCount();
            
            while(rs.next()){
                Object[] row = new Object[columnCount];
                for(int i = 1; i <= columnCount; i++){
                    row[i-1] = rs.getObject(i);
                }
                model.addRow(row);
            }
              
          } catch (Exception e){
              e.printStackTrace();
          }
      }
    }
    
