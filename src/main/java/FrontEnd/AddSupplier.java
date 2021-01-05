
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


public class AddSupplier extends javax.swing.JFrame {


    public AddSupplier() {
        initComponents();

        try {
            loadSupplierToCombo();
        } catch (Exception ex) {
            Logger.getLogger(AddSupplier.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        textFieldSupID = new javax.swing.JTextField();
        textFieldSupName = new javax.swing.JTextField();
        buttonDelete = new javax.swing.JButton();
        buttonSave = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        textFieldSupEmail = new javax.swing.JTextField();
        buttonRefresh = new javax.swing.JButton();
        comboBoxSupplier = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonDelete.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        buttonDelete.setText("Delete");
        buttonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteActionPerformed(evt);
            }
        });

        buttonSave.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        buttonSave.setText("Save");
        buttonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSaveActionPerformed(evt);
            }
        });

        backButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        buttonRefresh.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        buttonRefresh.setText("Refresh");
        buttonRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRefreshActionPerformed(evt);
            }
        });

        comboBoxSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxSupplierActionPerformed(evt);
            }
        });
        comboBoxSupplier.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                comboBoxSupplierKeyPressed(evt);
            }
        });

        jLabel1.setText("Search Suppliers : ");

        jLabel2.setText("Supplier ID : ");

        jLabel3.setText("Supplier Name : ");

        jLabel4.setText("Supplier Email : ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(138, 138, 138)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(comboBoxSupplier, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(buttonRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(buttonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(buttonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(48, 48, 48))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textFieldSupName)
                            .addComponent(textFieldSupEmail)
                            .addComponent(textFieldSupID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(comboBoxSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textFieldSupID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(textFieldSupName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(textFieldSupEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonDelete)
                    .addComponent(buttonSave)
                    .addComponent(backButton)
                    .addComponent(buttonRefresh))
                .addGap(81, 81, 81))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void loadSupplierToCombo() {
        try {
            Statement stmt = ConnectionMSSQL.connect().createStatement();
            String query = "select * from SupplierTable order by SupplierID";
            ResultSet rs = stmt.executeQuery(query);

            comboBoxSupplier.removeAllItems();
            comboBoxSupplier.insertItemAt("--Select--", 0);
            int position = 1;
            if (rs.next()) {
                do {
                    comboBoxSupplier.insertItemAt(rs.getString("SupplierName") + "--" + rs.getString("SupplierID") + "--" + rs.getString("SupplierEmail"), position);
                    position++;
                } while (rs.next());
            }
            comboBoxSupplier.setSelectedIndex(0);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", ERROR);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddSupplier.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void buttonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteActionPerformed
        String supID = textFieldSupID.getText();
        String supName = textFieldSupName.getText();
        if (!supID.isEmpty() && !supName.isEmpty()) {
            DeleteSupplier(supID);
        } else {
            JOptionPane.showMessageDialog(this, "Please fill all fields before save.", "Empty fields", JOptionPane.OK_OPTION);
        }
    }//GEN-LAST:event_buttonDeleteActionPerformed

    private void buttonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSaveActionPerformed
        SupplierSave();
    }//GEN-LAST:event_buttonSaveActionPerformed

    private void buttonRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRefreshActionPerformed
        Refresh();
    }//GEN-LAST:event_buttonRefreshActionPerformed

    private void comboBoxSupplierKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_comboBoxSupplierKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String comboData[] = comboBoxSupplier.getSelectedItem().toString().split("--");
            String code = comboData[1];
            String name = comboData[0];
            String email = comboData[2];

            textFieldSupID.setText(code);
            textFieldSupName.setText(name);
            textFieldSupEmail.setText(email);
        }
    }//GEN-LAST:event_comboBoxSupplierKeyPressed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        MainWindow mw = new MainWindow();
        mw.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void comboBoxSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxSupplierActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxSupplierActionPerformed

    private void SupplierSave() {
        String supID = textFieldSupID.getText();
        String supName = textFieldSupName.getText();
        String supEmail = textFieldSupEmail.getText();
        if (!supID.isEmpty() && !supName.isEmpty() && !supEmail.isEmpty()) {
            try {
                Statement stmt = ConnectionMSSQL.connect().createStatement();
                ResultSet rs = stmt.executeQuery("select SupplierID From SupplierTable where SupplierID = '" + supID + "'");

                if (rs.next()) {
                    int x = JOptionPane.showConfirmDialog(this, "Are you sure to change the '" + supID + "' details?", "Update supplier?", JOptionPane.YES_NO_OPTION);
                    if (x == JOptionPane.YES_OPTION) {
                        String UpdateQuery = "update SupplierTable set SupplierName = '" + supName + "', SupplierEmail = '" + supEmail + "' where SupplierID = '" + supID + "'";
                        stmt.execute(UpdateQuery);
                        JOptionPane.showMessageDialog(this, "Supplier details are updated.");
                        Refresh();
                    } else if (x == JOptionPane.NO_OPTION) {
                        textFieldSupID.requestFocus();
                    }

                } else if (!rs.next()) {
                    String UpdateQuery = "insert into SupplierTable (SupplierID, SupplierName, SupplierEmail) values ( '" + supID + "','" + supName + "','" + supEmail + "') ";
                    stmt.execute(UpdateQuery);
                    JOptionPane.showMessageDialog(this, "New Supplier is saved.");
                    Refresh();
                }
                rs.close();
            } catch (SQLException | HeadlessException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                JOptionPane.showMessageDialog(this, "Please contact for support.");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(AddSupplier.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (supID.isEmpty() || supName.isEmpty() || supEmail.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill all fields before save.", "Empty fields", JOptionPane.OK_OPTION);
            textFieldSupID.requestFocus();
        }
    }

    private void DeleteSupplier(String supID) {
        int x = JOptionPane.showConfirmDialog(this, "Are you sure to delete this?", "Delete supplier?", JOptionPane.YES_NO_OPTION);
        if (x == JOptionPane.YES_OPTION) {
            try {
                Statement stmt = ConnectionMSSQL.connect().createStatement();
                ResultSet rs = stmt.executeQuery("select SupplierID From SupplierTable where SupplierID = '" + supID + "'");

                if (rs.next()) {
                    String query = "delete From SupplierTable where SupplierID = '" + supID + "'";
                    stmt.execute(query);
                    JOptionPane.showMessageDialog(this, "Deleted.");
                    Refresh();
                } else {
                    JOptionPane.showMessageDialog(this, "Invalid code. Please insert a valid code.", "Invalid code", JOptionPane.OK_OPTION);
                    textFieldSupID.requestFocus();
                }

            } catch (SQLException | HeadlessException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                JOptionPane.showMessageDialog(this, "Please contact for support.");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(AddSupplier.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if (x == JOptionPane.NO_OPTION) {
            textFieldSupID.requestFocus();
        }
    }

    private void Refresh() {
        textFieldSupID.setText("");
        textFieldSupName.setText("");
        textFieldSupEmail.setText("");
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
            java.util.logging.Logger.getLogger(AddSupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddSupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddSupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddSupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddSupplier().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton buttonDelete;
    private javax.swing.JButton buttonRefresh;
    private javax.swing.JButton buttonSave;
    private javax.swing.JComboBox<String> comboBoxSupplier;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField textFieldSupEmail;
    private javax.swing.JTextField textFieldSupID;
    private javax.swing.JTextField textFieldSupName;
    // End of variables declaration//GEN-END:variables
}
