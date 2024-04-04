/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import JDBCConnector.JDBCConnector;
import services.addCustomer;
import hotel.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ACER NITRO 5
 */
public class Forgot {
    private Connection connection;
    private JDBCConnector jdbccon;
    private PreparedStatement ps;
    private String sql;
    private ResultSet rs;
    private ResultSetMetaData rm;
    
    public Forgot(){
        this.jdbccon = new JDBCConnector();
        this.connection = new JDBCConnector().getConnection();
    }
    
    public void forgot(User user){
        try {
            sql = "UPDATE login SET  password=? WHERE email=?";
            ps = connection.prepareStatement(sql);
            ps.setString(1, user.getPassword());
            ps.setString(2, user.getEmail());
            ps.executeUpdate();
        JOptionPane.showMessageDialog(null, "Successfully Change Password");
        } catch (Exception e) {
            Logger.getLogger(addCustomer.class.getName()).log(Level.SEVERE, null, e);
        JOptionPane.showMessageDialog(null, "Failed to Cahnge Password");
        }
    }
}
