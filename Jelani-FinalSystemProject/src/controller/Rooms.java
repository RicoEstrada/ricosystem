
package controller;


import hotel.Userdaw;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonModel;
import javax.swing.JOptionPane;
import services.roomServices;
import javax.swing.table.DefaultTableModel;
//import com.example.utils.DbUtils;

public class Rooms extends javax.swing.JFrame {
    roomServices rs = new roomServices();
    Userdaw r = new Userdaw();
    Connection Con = null;
    PreparedStatement Pst = null;
    ResultSet Rs = null;
    Statement St = null;
    
    public Rooms() {
        initComponents();
//        ShowRooms();
        populateTable();
    }
    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel)RoomsTable.getModel();
        rs.populateTable(model);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        RNameTb = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        CategoryCb = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        StatusCb = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        Addbtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        RoomsTable = new javax.swing.JTable();
        Editbtn = new javax.swing.JButton();
        Deletebtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        PriceTb = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        bedcb = new javax.swing.JComboBox<>();
        btn_reset = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 83, 52, 37));

        RNameTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RNameTbActionPerformed(evt);
            }
        });
        getContentPane().add(RNameTb, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 126, 174, 40));

        jLabel2.setText("Categories");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 172, 66, 28));

        CategoryCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "VIP", "Double Bed", "Single Bed", "Family" }));
        CategoryCb.setSelectedIndex(-1);
        CategoryCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoryCbActionPerformed(evt);
            }
        });
        getContentPane().add(CategoryCb, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 206, 101, -1));

        jLabel3.setText("Status");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 320, 71, 24));

        StatusCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Booked", "Free" }));
        StatusCb.setSelectedIndex(-1);
        StatusCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StatusCbActionPerformed(evt);
            }
        });
        getContentPane().add(StatusCb, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 362, 174, -1));

        jLabel4.setText("Price");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 394, 59, -1));

        Addbtn.setText("ADD");
        Addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddbtnActionPerformed(evt);
            }
        });
        getContentPane().add(Addbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 470, -1, 36));

        RoomsTable.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        RoomsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Room No.", "Name", "Categories", "Bed", "Status", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        RoomsTable.setGridColor(new java.awt.Color(0, 0, 0));
        RoomsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RoomsTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(RoomsTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 701, -1));

        Editbtn.setText("EDIT");
        Editbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditbtnActionPerformed(evt);
            }
        });
        getContentPane().add(Editbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 470, -1, 36));

        Deletebtn.setText("DELETE");
        Deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletebtnActionPerformed(evt);
            }
        });
        getContentPane().add(Deletebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 520, 90, 36));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel5.setText("ROOM RESERVATION");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 40));
        getContentPane().add(PriceTb, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 422, 174, 38));

        jLabel6.setText("Bed");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 254, -1, -1));

        bedcb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single", "King", "Queen", "Double Deck", "2 Single Beds" }));
        bedcb.setSelectedIndex(-1);
        getContentPane().add(bedcb, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 282, -1, -1));

        btn_reset.setBackground(new java.awt.Color(204, 204, 255));
        btn_reset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/reset.png"))); // NOI18N
        btn_reset.setToolTipText("Reset everything");
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });
        getContentPane().add(btn_reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 510, 67, 56));

        jLabel10.setFont(new java.awt.Font("Edwardian Script ITC", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 153, 0));
        jLabel10.setText("Hotel Management System");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 220, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/SYSSS.png"))); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 630));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel9.setText("ROOM'S BOOKING");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 350, 80));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RNameTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RNameTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RNameTbActionPerformed

    private void CategoryCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoryCbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CategoryCbActionPerformed

    private void EditbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditbtnActionPerformed
        roomServices rs = new roomServices();
        Userdaw r = new Userdaw();
        int row = RoomsTable.getSelectedRow();
        
        r.setName(RNameTb.getText());
        r.setCategories((String)CategoryCb.getSelectedItem());
        r.setBed((String)bedcb.getSelectedItem());
        r.setStatus((String)StatusCb.getSelectedItem());
        r.setPrice(Integer.parseInt(PriceTb.getText()));
        r.setName(RNameTb.getText());
        
        int idroom = (int) RoomsTable.getValueAt(row, 0);
        
        
        rs.updateroom(r, idroom);
        populateTable();
    }//GEN-LAST:event_EditbtnActionPerformed

    private void StatusCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StatusCbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StatusCbActionPerformed
//private void ShowRooms(){
//    try {
////        Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/room","root","Markjelan200506");
//        St = Con.createStatement();
//        Rs = St.executeQuery("SELECT * from room^");
////        RoomsList.setModel(DbUtils.resultSetToTableModel(Rs));
//        
//    } catch (Exception e) {
//    }
//}
    private void AddbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddbtnActionPerformed
        roomServices rs = new roomServices();
        Userdaw r = new Userdaw();
        
        r.setName(RNameTb.getText());
        r.setCategories((String)CategoryCb.getSelectedItem());
        r.setBed((String)bedcb.getSelectedItem());
        r.setStatus((String)StatusCb.getSelectedItem());
        r.setPrice(Integer.parseInt(PriceTb.getText()));
        
        rs.addroom(r);
        populateTable();
               
    }//GEN-LAST:event_AddbtnActionPerformed

    private void RoomsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RoomsTableMouseClicked
        r = new Userdaw();
        int row = RoomsTable.getSelectedRow();
        displayToTextField(row);
        //ObjectCreation();
        Addbtn.setEnabled(false);
        Editbtn.setEnabled(true);
        Deletebtn.setEnabled(true);
    }//GEN-LAST:event_RoomsTableMouseClicked

    private void DeletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletebtnActionPerformed
        int row  = RoomsTable.getSelectedRow();
        int selectedId = (int) RoomsTable.getModel().getValueAt(row, 0);
        try {
            rs.deleteroom(selectedId);
            
            
        } catch (SQLException ex) {
            Logger.getLogger(roomServices.class.getName()).log(Level.SEVERE, null, ex);
        }
        populateTable();
        emptyField();
       
    }//GEN-LAST:event_DeletebtnActionPerformed

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed

        emptyField();
    }//GEN-LAST:event_btn_resetActionPerformed

    private void displayToTextField(int row){
    
    RNameTb.setText((String)RoomsTable.getModel().getValueAt(row, 1));
    CategoryCb.setSelectedItem((String) RoomsTable.getModel().getValueAt(row, 2));
    bedcb.setSelectedItem((String) RoomsTable.getModel().getValueAt(row, 3));
    StatusCb.setSelectedItem((String) RoomsTable.getModel().getValueAt(row, 4));
    PriceTb.setText((int)RoomsTable.getModel().getValueAt(row, 5)+"");
    
}
    private void emptyField()
    {
         Addbtn.setEnabled(true);
        Editbtn.setEnabled(false);
        Deletebtn.setEnabled(false);
        
        r = new Userdaw();
        
        RNameTb.setText("");
        PriceTb.setText("");
        CategoryCb.setSelectedItem("");
        bedcb.setSelectedItem("");
        StatusCb.setSelectedItem("");
        RoomsTable.clearSelection();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Rooms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Rooms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Rooms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rooms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Rooms().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Addbtn;
    private javax.swing.JComboBox<String> CategoryCb;
    private javax.swing.JButton Deletebtn;
    private javax.swing.JButton Editbtn;
    private javax.swing.JTextField PriceTb;
    private javax.swing.JTextField RNameTb;
    private javax.swing.JTable RoomsTable;
    private javax.swing.JComboBox<String> StatusCb;
    private javax.swing.JComboBox<String> bedcb;
    private javax.swing.JButton btn_reset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
