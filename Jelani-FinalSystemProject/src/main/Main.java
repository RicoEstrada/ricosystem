
package main;

import JDBCConnector.JDBCConnector;
import java.sql.Connection;

public class Main {
    public static void JDBCConnect(){
        JDBCConnector ct = new JDBCConnector();
        try {
            Connection papop = ct.getConnection();
            if (papop != null){
                System.out.println("Connected");
            }else{
                System.out.println("walay na Connect choy!!!!");
            }
        } catch (Exception e) {
        }
        
    }
    public static void main(String[] args) {
        JDBCConnect();
        
    }
}
