
package FrontEnd;

import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import lk.sliitacademy.rustrepaircenter.ConnectionMSSQL;


public class AddSpareParts extends javax.swing.JFrame {

 
    public AddSpareParts() {
        initComponents();

        try {
            loadSpartPartToCombo();
            loadSupplierToCombo();
        } catch (Exception ex) {
            Logger.getLogger(AddSupplier.class.getName()).log(Level.SEVERE, null, ex);
        }

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        sp_idComboBox = new javax.swing.JComboBox<>();
        sp_idTextField = new javax.swing.JTextField();
        sp_priceTextField = new javax.swing.JTextField();
        sp_stockQtyTextField = new javax.swing.JTextField();
        sp_nameTextField = new javax.swing.JTextField();
        sup_IDComboBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        refreshButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sp_idComboBox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                sp_idComboBoxKeyPressed(evt);
            }
        });

        jLabel1.setText("Search Spare Parts : ");

        jLabel2.setText("Spare Part ID : ");

        jLabel3.setText("Spare Part Name : ");

        jLabel4.setText("Spare Part Price : ");

        jLabel5.setText("Stock Quantity : ");

        jLabel6.setText("Supplier ID : ");

        refreshButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        refreshButton.setText("Refresh");
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        saveButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        deleteButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addComponent(refreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(sp_stockQtyTextField)
                                    .addComponent(sp_priceTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(sp_nameTextField)
                                    .addComponent(sup_IDComboBox, 0, 384, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(16, 16, 16)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sp_idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sp_idComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sp_idComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sp_idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sp_nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sp_priceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sp_stockQtyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sup_IDComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(refreshButton)
                    .addComponent(saveButton)
                    .addComponent(deleteButton)
                    .addComponent(jButton3))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loadSupplierToCombo() {
        try {
            Statement stmt = ConnectionMSSQL.connect().createStatement();
            String query = "select * from SupplierTable order by SupplierID";
            ResultSet rs = stmt.executeQuery(query);

            sup_IDComboBox.removeAllItems();
            sup_IDComboBox.insertItemAt("--Select--", 0);
            int position = 1;
            if (rs.next()) {
                do {
//                    sup_IDComboBox.insertItemAt(rs.getString("SupplierName") + "--" + rs.getString("SupplierID") + "--" + rs.getString("SupplierEmail"), position);
                    sup_IDComboBox.insertItemAt(rs.getString("SupplierName") + "--" + rs.getString("SupplierID"), position);
                    position++;
                } while (rs.next());
            }
            sup_IDComboBox.setSelectedIndex(0);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", ERROR);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddSupplier.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void loadSpartPartToCombo() {
        try {
            Statement stmt = ConnectionMSSQL.connect().createStatement();
            String query = "select SparePartTable.SpartPartID AS SparePartTableSpartPartID,\n"
                    + " SparePartTable.SparePartName AS SparePartTableSparePartName, \n"
                    + " SparePartTable.StockQuantity AS SparePartTableStockQuantity,\n"
                    + " SparePartTable.PerUnitPrice AS SparePartTablePerUnitPrice,\n"
                    + " SupplierTable.SupplierID AS SupplierTableSupplierID,\n"
                    + " SupplierTable.SupplierName AS SupplierTableSupplierName\n"
                    + "FROM SparePartTable INNER JOIN SupplierTable ON SparePartTable.SupplierID = SupplierTable.SupplierID";
            ResultSet rs = stmt.executeQuery(query);

            sp_idComboBox.removeAllItems();
            sp_idComboBox.insertItemAt("--Select--", 0);
            int position = 1;
            if (rs.next()) {
                do {
                    sp_idComboBox.insertItemAt(rs.getString("SparePartTableSparePartName") + "--" + rs.getString("SparePartTableSpartPartID") + "--" + rs.getString("SparePartTablePerUnitPrice") + "--" + rs.getString("SparePartTableStockQuantity") + "--" + rs.getString("SupplierTableSupplierID") + "--" + rs.getString("SupplierTableSupplierName"), position);
                    position++;
                } while (rs.next());
            }
            sp_idComboBox.setSelectedIndex(0);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", ERROR);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddSupplier.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        MainWindow mw = new MainWindow();
        mw.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        String Sp_ID = sp_idTextField.getText();
        if (!Sp_ID.isEmpty()) {
            DeleteSparePart(Sp_ID);
        } else {
            JOptionPane.showMessageDialog(this, "Please fill all fields before save.", "Empty fields", JOptionPane.OK_OPTION);
        }

    }//GEN-LAST:event_deleteButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        SparePartSave();
    }//GEN-LAST:event_saveButtonActionPerformed

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        Refresh();
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void sp_idComboBoxKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sp_idComboBoxKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String comboData[] = sp_idComboBox.getSelectedItem().toString().split("--");
            String Sp_ID = comboData[1];
            String Sp_Name = comboData[0];
            String Sp_Price = comboData[2];
            String Sp_StockQty = comboData[3];
            String Supplier_Code = comboData[4];
            String Supplier_Name = comboData[5];

            sp_idTextField.setText(Sp_ID);
            sp_nameTextField.setText(Sp_Name);
            sp_priceTextField.setText(Sp_Price);
            sp_stockQtyTextField.setText(Sp_StockQty);
            sup_IDComboBox.setSelectedItem(Supplier_Name + "--" + Supplier_Code);

        }

    }//GEN-LAST:event_sp_idComboBoxKeyPressed

    private void SparePartSave() {
        String Sp_ID = sp_idTextField.getText();
        String Sp_Name = sp_nameTextField.getText();
        float Sp_Price = Float.parseFloat(sp_priceTextField.getText());
        int Sp_StockQty = Integer.parseInt(sp_stockQtyTextField.getText());
        String supplierArray[] = sup_IDComboBox.getSelectedItem().toString().split("--");
        String supplierID = supplierArray[1].toString();

        if (!Sp_ID.isEmpty() && !Sp_Name.isEmpty()) {
            try {
                Statement stmt = ConnectionMSSQL.connect().createStatement();
                ResultSet rs = stmt.executeQuery("select SpartPartID from SparePartTable where SpartPartID = '" + Sp_ID + "'");

                if (rs.next()) {
                    int x = JOptionPane.showConfirmDialog(this, "Are you sure to change '" + Sp_ID + "' details?", "Update Spare Part?", JOptionPane.YES_OPTION);
                    if (x == JOptionPane.YES_OPTION) {
                        String UpdateQuery = "update SparePartTable set SparePartName = '" + Sp_Name + "'"
                                + ",PerUnitPrice = '" + Sp_Price + "', StockQuantity = '" + Sp_StockQty + "', SupplierID = '" + supplierID + "' where SpartPartID = '" + Sp_ID + "'";
                        stmt.execute(UpdateQuery);
                        JOptionPane.showMessageDialog(this, "Spare Part details are updated.");
                        Refresh();
                    } else if (x == JOptionPane.NO_OPTION) {
                        sp_idTextField.requestFocus();
                    }
                } else if (!rs.next()) {
                    String InsertQuery = "insert into SparePartTable (SpartPartID, SparePartName,"
                            + " PerUnitPrice, StockQuantity, SupplierID) values ( '" + Sp_ID + "','" + Sp_Name + "','" + Sp_Price + "','" + Sp_StockQty + "','" + supplierID + "') ";
                    stmt.execute(InsertQuery);
                    JOptionPane.showMessageDialog(this, "New Spare part is saved.");
                    Refresh();
                }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(AddSpareParts.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(AddSpareParts.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (Sp_ID.isEmpty() || Sp_Name.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill all the fields before save.", "Empty feilds", JOptionPane.OK_OPTION);
            sp_idTextField.requestFocus();
        }
    }

    private void DeleteSparePart(String Sp_ID) {
        int x = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this?", "Delete spare part?", JOptionPane.YES_OPTION);
        if (x == JOptionPane.YES_OPTION) {
            try {
                Statement stmt = ConnectionMSSQL.connect().createStatement();
                ResultSet rs = stmt.executeQuery("select SpartPartID from SparePartTable where SpartPartID = '" + Sp_ID + "'");

                if (rs.next()) {
                    String query = "delete from SparePartTable where SpartPartID = '" + Sp_ID + "'";
                    stmt.execute(query);
                    JOptionPane.showMessageDialog(this, "Deleted");
                    Refresh();
                } else {
                    JOptionPane.showMessageDialog(this, "Invalid code. Please insert a valid code.", "Invalid code", JOptionPane.OK_OPTION);
                    sp_idTextField.requestFocus();
                }
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(AddSpareParts.class.getName()).log(Level.SEVERE, null, ex);
            } catch (HeadlessException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                JOptionPane.showMessageDialog(this, "Please contact for support.");
            }

        } else if (x == JOptionPane.NO_OPTION) {
            sp_idTextField.requestFocus();
        }
    }

    private void Refresh() {
        sp_idTextField.setText("");
        sp_nameTextField.setText("");
        sp_priceTextField.setText("");
        sp_stockQtyTextField.setText("");
        loadSpartPartToCombo();
        loadSupplierToCombo();
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
            java.util.logging.Logger.getLogger(AddSpareParts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddSpareParts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddSpareParts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddSpareParts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddSpareParts().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton refreshButton;
    private javax.swing.JButton saveButton;
    private javax.swing.JComboBox<String> sp_idComboBox;
    private javax.swing.JTextField sp_idTextField;
    private javax.swing.JTextField sp_nameTextField;
    private javax.swing.JTextField sp_priceTextField;
    private javax.swing.JTextField sp_stockQtyTextField;
    private javax.swing.JComboBox<String> sup_IDComboBox;
    // End of variables declaration//GEN-END:variables

}
