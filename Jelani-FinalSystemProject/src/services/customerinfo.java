/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import JDBCConnector.JDBCConnector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import hotel.User;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ACER NITRO 5
 */
public class customerinfo {
    private Connection connection;
    private JDBCConnector jdbccon;
    private PreparedStatement ps;
    private String sql;
    private ResultSet rs;
    private ResultSetMetaData rm;
    
    public customerinfo(){
        this.jdbccon = new JDBCConnector();
        this.connection = new JDBCConnector().getConnection();
        
    }
    public void CustomerInsert(User user) {
    try {
        sql = "INSERT into customer (name, contactno, age, gender, municipality, province, baranggay, street) values(?,?,?,?,?,?,?,?)";
        ps = connection.prepareStatement(sql);
        ps.setString(1, user.getName());
        ps.setInt(2, user.getContactno());
        ps.setInt(3, user.getAge());
        ps.setString(4, user.getGender());
        ps.setString(5, user.getMunicipality());
        ps.setString(6, user.getProvince());
        ps.setString(7, user.getBaranggay());
        ps.setString(8, user.getStreet());
        ps.executeUpdate();
        JOptionPane.showMessageDialog(null, "Customer successfully added");
    } catch (SQLException e) {
        Logger.getLogger(customerinfo.class.getName()).log(Level.SEVERE, null, e);
        JOptionPane.showMessageDialog(null, "Failed to add Customer");
    } 
}

public void updateCustomer(User user) {
    try {
        sql = "UPDATE customer SET name=?, contactno=?, age=?, gender=?, municipality=?, province=?, baranggay=?, street=? WHERE idcustomer=?";
        ps = connection.prepareStatement(sql);
        ps.setString(1, user.getName());
        ps.setInt(2, user.getContactno());
        ps.setInt(3, user.getAge());
        ps.setString(4, user.getGender());
        ps.setString(5, user.getMunicipality());
        ps.setString(6, user.getProvince());
        ps.setString(7, user.getBaranggay());
        ps.setString(8, user.getStreet());
        ps.setInt(9, user.getCustomer_id());
        
        ps.executeUpdate();
        JOptionPane.showMessageDialog(null, "Customer successfully updated");
    } catch (SQLException e) {
        Logger.getLogger(customerinfo.class.getName()).log(Level.SEVERE, null, e);
        JOptionPane.showMessageDialog(null, "Failed to update Customer");
    }
}
public void deleteCustomer(int idcustomer) throws SQLException{
    
        try {
            sql = "DELETE FROM customer WHERE idcustomer=?";
            ps = connection.prepareStatement(sql);
            ps.setInt(1, idcustomer);
            ps.execute();
            JOptionPane.showMessageDialog(null, "User successfully deleted");
        } catch (SQLException e) {
            Logger.getLogger(customerinfo.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Failed to delete User");
        }
}    
    
    public void populateTable(DefaultTableModel model){
        try {
            model.setRowCount(0);
            sql = "SELECT * FROM customer";
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
