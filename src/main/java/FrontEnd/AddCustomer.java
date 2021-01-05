package FrontEnd;

import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import lk.sliitacademy.rustrepaircenter.ConnectionMSSQL;

public class AddCustomer extends javax.swing.JFrame {

    public AddCustomer() {
        initComponents();
        
                try {
            loadCustomerToCombo();
        } catch (Exception ex) {
            Logger.getLogger(AddSupplier.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        refreshButton = new javax.swing.JButton();
        searchCustomerComboBox = new javax.swing.JComboBox<>();
        cusIDTextField = new javax.swing.JTextField();
        cusNameTextField = new javax.swing.JTextField();
        cusEmailTextField = new javax.swing.JTextField();
        vehIDTextField = new javax.swing.JTextField();
        vehFaultTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Customer ID :");

        jLabel2.setText("Customer Name : ");

        jLabel3.setText("Customer Email : ");

        jLabel4.setText("Search Customer : ");

        jLabel5.setText("Vehicle ID : ");

        jLabel6.setText("Vehicle Fault Part : ");

        backButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        deleteButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        saveButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        refreshButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        refreshButton.setText("Refresh");
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        searchCustomerComboBox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchCustomerComboBoxKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(19, 19, 19)))
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(vehFaultTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                                .addComponent(cusIDTextField)
                                .addComponent(cusNameTextField)
                                .addComponent(cusEmailTextField)
                                .addComponent(vehIDTextField))
                            .addComponent(searchCustomerComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(61, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(307, Short.MAX_VALUE)
                .addComponent(refreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(searchCustomerComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cusIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cusNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cusEmailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(vehIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(vehFaultTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backButton)
                    .addComponent(deleteButton)
                    .addComponent(saveButton)
                    .addComponent(refreshButton))
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        MainWindow mw = new MainWindow();
        mw.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        String CusID = cusIDTextField.getText().toString();
        String CusName = cusNameTextField.getText();
        String CusEmail = cusEmailTextField.getText();
        String vehID = vehIDTextField.getText();
        String vehFault = vehFaultTextField.getText();
        if (!CusID.isEmpty() && !CusName.isEmpty() && !CusEmail.isEmpty() && !vehID.isEmpty() && !vehFault.isEmpty()) {
            DeleteCustomerID(CusID);
        } else {
            JOptionPane.showMessageDialog(this, "Please fill all fields before save.", "Empty fields", JOptionPane.OK_OPTION);
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        CustomerSave();
    }//GEN-LAST:event_saveButtonActionPerformed

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        Refresh();
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void searchCustomerComboBoxKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchCustomerComboBoxKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String comboData[] = searchCustomerComboBox.getSelectedItem().toString().split("--");
            String cusID = comboData[1];
            String cusName = comboData[0];
            String cusEmail = comboData[2];
            String vehID = comboData[3];
            String vehFault = comboData[4];

            cusIDTextField.setText(cusID);
            cusNameTextField.setText(cusName);
            cusEmailTextField.setText(cusEmail);
            vehIDTextField.setText(vehID);
            vehFaultTextField.setText(vehFault);
        }
    }//GEN-LAST:event_searchCustomerComboBoxKeyPressed

    private void loadCustomerToCombo(){
                try {
            Statement stmt = ConnectionMSSQL.connect().createStatement();
            String query = "select * from CustomerTable order by CustomerID";
            ResultSet rs = stmt.executeQuery(query);

            searchCustomerComboBox.removeAllItems();
            searchCustomerComboBox.insertItemAt("--Select--", 0);
            int position = 1;
            if (rs.next()) {
                do {
                    searchCustomerComboBox.insertItemAt(rs.getString("CustomerName") + "--" + rs.getString("CustomerID") + "--" + rs.getString("CustomerEmail") + "--" + rs.getString("VehicleID") + "--" + rs.getString("VehicleFault"), position);
                    position++;
                } while (rs.next());
            }
            searchCustomerComboBox.setSelectedIndex(0);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", ERROR);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddSupplier.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void CustomerSave() {
        String cusID = cusIDTextField.getText();
        String cusName = cusNameTextField.getText();
        String cusEmail = cusEmailTextField.getText();
        String vehID = vehIDTextField.getText();
        String vehFault = vehFaultTextField.getText();

        if (!cusID.isEmpty() && !cusName.isEmpty() && !cusEmail.isEmpty() && !vehID.isEmpty() && !vehFault.isEmpty()) {
            try {
                Statement stmt = ConnectionMSSQL.connect().createStatement();
                ResultSet rs = stmt.executeQuery("select CustomerID from CustomerTable where CustomerID = '" + cusID + "'");

                if (rs.next()) {
                    int x = JOptionPane.showConfirmDialog(this, "Are you sure to change the '" + cusID + "' details?", "Update supplier?", JOptionPane.YES_NO_OPTION);
                    if (x == JOptionPane.YES_OPTION) {
                        String UpdateQuery = "update CustomerTable set CustomerName = '" + cusName + "', CustomerEmail = '" + cusEmail + "', VehicleID = '" + vehID + "', VehicleFault = '" + vehFault + "'";
                        stmt.execute(UpdateQuery);
                        JOptionPane.showMessageDialog(this, "Customer details are updated");
                        Refresh();
                    } else if (!rs.next()) {
                        String UpdateQuery = "insert into CustomerTable (CustomerID, CustomerName, CustomerEmail, VehicleID, VehicleFault) values ('" + cusID + "', '" + cusName + "', '" + cusEmail + "', '" + vehID + "', '" + vehFault + "', )";
                        stmt.execute(UpdateQuery);
                        JOptionPane.showMessageDialog(this, "New Customer is saved.");
                        Refresh();
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(AddCustomer.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(AddCustomer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }     
    
    

    private void DeleteCustomerID(String CusID) {
        int x = JOptionPane.showConfirmDialog(this, "Are you sure to delete this?", "Delete Customer?", JOptionPane.YES_NO_OPTION);
        if (x == JOptionPane.YES_OPTION) {
            try {
                Statement stmt = ConnectionMSSQL.connect().createStatement();
                ResultSet rs = stmt.executeQuery("select CustomerID from CustomerTable where CustomerID = '" + CusID + "'");

                if (rs.next()) {
                    String query = "delete from CustomerTable where CustomerID  = '" + CusID + "'";
                    stmt.execute(query);
                    JOptionPane.showMessageDialog(this, "Deleted");
                    Refresh();
                } else {
                    JOptionPane.showMessageDialog(this, "Invalid code. Please enter a valid code.", "Inavlid code", JOptionPane.OK_OPTION);
                }

            } catch (SQLException | HeadlessException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                JOptionPane.showMessageDialog(this, "Please contact for support.");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(AddSupplier.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (x == JOptionPane.NO_OPTION) {
            cusIDTextField.requestFocus();
        }

    }

    private void Refresh() {
        cusIDTextField.setText("");
        cusNameTextField.setText("");
        cusEmailTextField.setText("");
        vehIDTextField.setText("");
        vehFaultTextField.setText("");
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
            java.util.logging.Logger.getLogger(AddCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddCustomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JTextField cusEmailTextField;
    private javax.swing.JTextField cusIDTextField;
    private javax.swing.JTextField cusNameTextField;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton refreshButton;
    private javax.swing.JButton saveButton;
    private javax.swing.JComboBox<String> searchCustomerComboBox;
    private javax.swing.JTextField vehFaultTextField;
    private javax.swing.JTextField vehIDTextField;
    // End of variables declaration//GEN-END:variables
}
