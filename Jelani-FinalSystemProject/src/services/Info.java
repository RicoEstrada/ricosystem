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
public class Info {
    private Connection connection;
    private JDBCConnector jdbccon;
    private PreparedStatement ps;
    private String sql;
    private ResultSet rs;
    private ResultSetMetaData rm;
    
    public Info(){
        this.jdbccon = new JDBCConnector();
        this.connection = new JDBCConnector().getConnection();
    }
    
    public void allinfo(){
        try {
            sql = "SELECT * FROM room AND bookings JOIN TO  ON room.name, room.categories, room.bed, room.status, room.price,  = table2.column_name";
        } catch (Exception e) {
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
