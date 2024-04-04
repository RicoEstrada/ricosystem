package JDBCConnector;


import java.sql.Connection;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnector {
    public Connection getConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelmanagementsystem", "root", "Ricorico098");
        } catch (ClassNotFoundException |SQLException e) {
            //Logger.getLogger(JDBCConnector.class.getName()).log(Level.SEVERE, null, e);
        }
        return null;
        
    }
    public void closeConnection(Connection connection){
        try {
            if (connection != null && !connection.isClosed()) {
               connection.close();
            }
            
        } catch (Exception e) {
            //Logger.getLogger(JDBCConnector.class.getName()).log(Level.SEVERE, null, e
        }
    }
}
