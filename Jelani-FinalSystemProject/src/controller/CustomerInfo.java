/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package controller;

import hotel.User;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import services.customerinfo;



/**
 *
 * @author ACER NITRO 5
 */
public class CustomerInfo extends javax.swing.JFrame {

    User user = new User();
    customerinfo ci = new customerinfo();
    ResultSet rs = null;
    
    public CustomerInfo() {
        initComponents();
        ci = new customerinfo();
        populateTable();
    }
    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel)table_customer.getModel();
        ci.populateTable(model);
    }
//    private void ObjectCreation()
//    {
//        user = new User();
//        
//        user = new User();
//    user.setName(tf_name.getText());
//    user.setContactno(Integer.parseInt(tf_contact.getText()));
//    user.setAge(Integer.parseInt(tf_age.getText()));
//    user.setGender(Gender.getSelected()); 
//    user.setMunicipality((String) mcb.getSelectedItem());
//    user.setProvince((String) pcb.getSelectedItem());
//    user.setBaranggay((String) bcb.getSelectedItem());
//    user.setStreet(tf_street.getText()); 
//        
//        try{
//            user.setCustomer_id(Integer.parseInt(tf_id.getText()));
//        }
//        catch(Exception e)
//        {
//            user.setCustomer_id(0);
//        }
//        
//    }
    private void emptyField()
    {
         btn_addCustomer.setEnabled(true);
        btn_editCustomer.setEnabled(false);
        btn_deleteCustomer.setEnabled(false);
        
        user = new User();
        
        tf_age.setText("");
        tf_id.setText("");
        tf_name.setText("");
        tf_contact.setText("");
        mcb.setSelectedItem("");
        pcb.setSelectedItem("");
        bcb.setSelectedItem("");
        tf_street.setText("");
        table_customer.clearSelection();
    }
    private void displayToTextField(int row)
{
    
    tf_id.setText(table_customer.getModel().getValueAt(row, 0)+"");
    tf_name.setText((String) table_customer.getModel().getValueAt(row, 1));
    tf_contact.setText(table_customer.getModel().getValueAt(row, 2)+"");
    tf_age.setText(table_customer.getModel().getValueAt(row, 3)+"");
    if (table_customer.getModel().getValueAt(row, 4) instanceof ButtonModel) {
    // Set the selected property of the Gender ButtonGroup based on the value
    Gender.setSelected((ButtonModel) table_customer.getModel().getValueAt(row, 4), true);
}
    mcb.setSelectedItem((String) table_customer.getModel().getValueAt(row, 5));
    pcb.setSelectedItem((String) table_customer.getModel().getValueAt(row, 6));
    bcb.setSelectedItem((String) table_customer.getModel().getValueAt(row, 7));
    tf_street.setText((String) table_customer.getModel().getValueAt(row, 8));
    
    
}

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Gender = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tf_name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tf_contact = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tf_age = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        mcb = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pcb = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        bcb = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        btn_addCustomer = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_customer = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        tf_street = new javax.swing.JTextField();
        btn_editCustomer = new javax.swing.JButton();
        btn_deleteCustomer = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        tf_id = new javax.swing.JTextField();
        btn_reset = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Name:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 53, 43, 25));
        jPanel1.add(tf_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 49, 178, 33));

        jLabel3.setText("Contact no:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 106, 64, 25));

        tf_contact.setText("63");
        tf_contact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_contactActionPerformed(evt);
            }
        });
        jPanel1.add(tf_contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 102, 178, 33));

        jLabel4.setText("Age:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 155, 43, 25));

        tf_age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_ageActionPerformed(evt);
            }
        });
        jPanel1.add(tf_age, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 151, 178, 33));

        jLabel5.setText("Gender:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 202, 43, 25));

        mcb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Abra", "Agusan del Norte", "Agusan del Sur", "Aklan", "Albay", "Antique", "Apayao", "Aurora", "Basilan", "Bataan", "Batanes", "Batangas", "Benguet", "Biliran", "Bohol", "Bukidnon", "Bulacan", "Cagayan", "Camarines Norte", "Camarines Sur", "Camiguin", "Capiz", "Catanduanes", "Cavite", "Cebu", "Cotabato", "Davao de Oro", "Davao del Norte", "Davao del Sur", "Davao Occidental", "Davao Oriental", "Dinagat Islands", "Eastern Samar", "Guimaras", "Ifugao", "Ilocos Norte", "Ilocos Sur", "Iloilo", "Isabela", "Kalinga", "La Union", "Laguna", "Lanao del Norte", "Lanao del Sur", "Leyte", "Maguindanao del Norte", "Maguindanao del Sur", "Marinduque", "Masbate", "Metro Manila", "Misamis Occidental", "Misamis Oriental", "Mountain Province", "Negros Occidental", "Negros Oriental", "Northern Samar", "Nueva Ecija", "Nueva Vizcaya", "Occidental Mindoro", "Oriental Mindoro", "Palawan", "Pampanga", "Pangasinan", "Quezon", "QuirinoRizal", "Romblon", "Samar", "Sarangani", "Siquijor", "Sorsogon", "South Cotabato", "Southern Leyte", "Sultan Kudarat", "SuluSurigao del Norte", "Surigao del Sur", "Tarlac", "Tawi-Tawi", "Zambales", "Zamboanga del Norte", "Zamboanga del Sur", "Zamboanga Sibugay" }));
        mcb.setSelectedIndex(-1);
        mcb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mcbActionPerformed(evt);
            }
        });
        jPanel1.add(mcb, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 290, 174, -1));

        jLabel2.setText("Municipality:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 295, -1, -1));

        jLabel6.setText("Province:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 337, 62, -1));

        pcb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "City of Digos ", "Bansalan ", "Don Marcelino ", "Hagonoy", "Kiblawan ", "Magsaysay", "Malalag", "Malita", "Matanao", "Padada", "San Isidro", "Santa Cruz", " ", " " }));
        pcb.setSelectedIndex(-1);
        jPanel1.add(pcb, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 332, 174, -1));

        jLabel7.setText("Baranggay:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 379, 62, -1));

        bcb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aplaya", "Balutakay", "Binaton", "Cogon", "Colorado", "Dawis", "Dulangan", "Goma", "Igpit", "Kiagot", "Lungag", "Mahayahay", "Matti", "Kapatagan (Rizal)", "Ruparan", "San Agustin", "San Miguel (Odaca)", "San Roque", "Sinawilan", "Soong", "Tiguman", "Tres De Mayo", "Zone 1 (Pob.)", "Zone 2 (Pob.)", "Zone 3 (Pob.)" }));
        bcb.setSelectedIndex(-1);
        jPanel1.add(bcb, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 374, 174, -1));

        jLabel8.setText("Address");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 257, -1, -1));

        Gender.add(jRadioButton1);
        jRadioButton1.setText("Male");
        jPanel1.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 203, 98, -1));

        Gender.add(jRadioButton2);
        jRadioButton2.setText("Female");
        jPanel1.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 203, 98, -1));

        btn_addCustomer.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_addCustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/DefaultButton.png"))); // NOI18N
        btn_addCustomer.setBorder(null);
        btn_addCustomer.setBorderPainted(false);
        btn_addCustomer.setFocusPainted(false);
        btn_addCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addCustomerActionPerformed(evt);
            }
        });
        jPanel1.add(btn_addCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 484, 207, 30));

        table_customer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Contact No.", "Age", "Gender", "Municipality", "Province", "Baranggay", "Street"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, true, true, true, true, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_customer.getTableHeader().setReorderingAllowed(false);
        table_customer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_customerMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table_customer);
        if (table_customer.getColumnModel().getColumnCount() > 0) {
            table_customer.getColumnModel().getColumn(0).setResizable(false);
        }

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, 863, 458));

        jLabel9.setText("Street:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 424, 67, -1));

        tf_street.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_streetActionPerformed(evt);
            }
        });
        jPanel1.add(tf_street, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 416, 174, 31));

        btn_editCustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/EditButton.png"))); // NOI18N
        btn_editCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editCustomerActionPerformed(evt);
            }
        });
        jPanel1.add(btn_editCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 532, 207, 31));

        btn_deleteCustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/DeleteButton.png"))); // NOI18N
        btn_deleteCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteCustomerActionPerformed(evt);
            }
        });
        jPanel1.add(btn_deleteCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 580, 207, 32));

        jLabel10.setText("ID Customer");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 14, 70, -1));
        jPanel1.add(tf_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 12, 178, -1));

        btn_reset.setBackground(new java.awt.Color(204, 204, 255));
        btn_reset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/reset.png"))); // NOI18N
        btn_reset.setToolTipText("Reset everything");
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });
        jPanel1.add(btn_reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 540, 70, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/CUSTOMER INFOOOOOO.png"))); // NOI18N
        jLabel11.setText("jLabel11");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 620));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_addCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addCustomerActionPerformed
//        ObjectCreation();
//        ci.CustomerInsert(user);
//        populateTable();
//        emptyField();
        String gender = "";
        if (jRadioButton1.isSelected()){
            gender = "Male";
        }else if (jRadioButton2.isSelected()){
            gender = "Female";
        }

          customerinfo ci = new customerinfo();
          User user = new User();
          
        user.setName(tf_name.getText());
        user.setContactno(Integer.parseInt(tf_contact.getText()));
        user.setAge(Integer.parseInt(tf_age.getText()));
        user.setGender(gender);
        user.setMunicipality(mcb.getSelectedItem().toString());
        user.setProvince(pcb.getSelectedItem().toString());
        user.setBaranggay(bcb.getSelectedItem().toString());
        user.setStreet(tf_street.getText());
        
        ci.CustomerInsert(user);
        populateTable();

    }//GEN-LAST:event_btn_addCustomerActionPerformed

    private void tf_ageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_ageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_ageActionPerformed

    private void tf_contactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_contactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_contactActionPerformed

    private void btn_deleteCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteCustomerActionPerformed
        int row  = table_customer.getSelectedRow();
        int selectedUserId = (int) table_customer.getModel().getValueAt(row, 0);
        try {
            ci.deleteCustomer(selectedUserId);
            
            
        } catch (SQLException ex) {
            Logger.getLogger(CustomerInfo.class.getName()).log(Level.SEVERE, null, ex);
        }
        populateTable();
        emptyField();
    }//GEN-LAST:event_btn_deleteCustomerActionPerformed

    private void btn_editCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editCustomerActionPerformed
         
         String gender = "";
        if (jRadioButton1.isSelected()){
            gender = "Male";
        }else if (jRadioButton2.isSelected()){
            gender = "Female";
        }

          customerinfo ci = new customerinfo();
          User user = new User();
          
        user.setName(tf_name.getText());
        user.setContactno(Integer.parseInt(tf_contact.getText()));
        user.setAge(Integer.parseInt(tf_age.getText()));
        user.setGender(gender);
        user.setMunicipality(mcb.getSelectedItem().toString());
        user.setProvince(pcb.getSelectedItem().toString());
        user.setBaranggay(bcb.getSelectedItem().toString());
        user.setStreet(tf_street.getText());
        user.setCustomer_id(Integer.parseInt(tf_id.getText()));
        
        ci.updateCustomer(user);
       populateTable();
//        emptyField();
    }//GEN-LAST:event_btn_editCustomerActionPerformed

    private void table_customerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_customerMouseClicked
        user = new User();
        int row = table_customer.getSelectedRow();
        displayToTextField(row);
        //ObjectCreation();
        btn_editCustomer.setEnabled(true);
        btn_deleteCustomer.setEnabled(true);
        btn_addCustomer.setEnabled(false);
    }//GEN-LAST:event_table_customerMouseClicked

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed

        emptyField();

    }//GEN-LAST:event_btn_resetActionPerformed

    private void tf_streetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_streetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_streetActionPerformed

    private void mcbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mcbActionPerformed
        
    }//GEN-LAST:event_mcbActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Gender;
    private javax.swing.JComboBox<String> bcb;
    private javax.swing.JButton btn_addCustomer;
    private javax.swing.JButton btn_deleteCustomer;
    private javax.swing.JButton btn_editCustomer;
    private javax.swing.JButton btn_reset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> mcb;
    private javax.swing.JComboBox<String> pcb;
    private javax.swing.JTable table_customer;
    private javax.swing.JTextField tf_age;
    private javax.swing.JTextField tf_contact;
    private javax.swing.JTextField tf_id;
    private javax.swing.JTextField tf_name;
    private javax.swing.JTextField tf_street;
    // End of variables declaration//GEN-END:variables
}
