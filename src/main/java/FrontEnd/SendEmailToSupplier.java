
package FrontEnd;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import lk.sliitacademy.rustrepaircenter.ConnectionMSSQL;
import lk.sliitacademy.rustrepaircenter.SendEmail;


public class SendEmailToSupplier extends javax.swing.JFrame {

    private final DefaultTableModel model_TableSupplierEmail;


    public SendEmailToSupplier() {
        initComponents();

        model_TableSupplierEmail = (DefaultTableModel) tableSupplierEmail.getModel();

        loadDetailsToTable();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableSupplierEmail = new javax.swing.JTable();
        textSPid = new javax.swing.JTextField();
        textSPname = new javax.swing.JTextField();
        textSPquantity = new javax.swing.JTextField();
        textSupplierID = new javax.swing.JTextField();
        textSupplierName = new javax.swing.JTextField();
        textSupplierEmail = new javax.swing.JTextField();
        buttonSendEmail = new javax.swing.JButton();
        buttonBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        refreshButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tableSupplierEmail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Spare part id", "Spare part name", "Quantity", "Supplier id", "Supplier name", "Supplier email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableSupplierEmail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableSupplierEmailMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableSupplierEmail);

        textSPid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textSPidActionPerformed(evt);
            }
        });

        buttonSendEmail.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        buttonSendEmail.setText("Send Email");
        buttonSendEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSendEmailActionPerformed(evt);
            }
        });

        buttonBack.setText("Back");
        buttonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBackActionPerformed(evt);
            }
        });

        jLabel1.setText("Spare Part ID : ");

        jLabel2.setText("Spare Part Name : ");

        jLabel3.setText("Quantity : ");

        jLabel4.setText("Supplier ID : ");

        jLabel5.setText("Supplier Name : ");

        jLabel6.setText("Supplier Email : ");

        refreshButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        refreshButton.setText("Refresh");
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(36, 36, 36)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textSPid)
                                    .addComponent(textSPname, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                                    .addComponent(textSPquantity))
                                .addGap(137, 137, 137)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(51, 51, 51)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textSupplierID)
                                    .addComponent(textSupplierName, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                    .addComponent(textSupplierEmail))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(refreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(buttonSendEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(buttonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 857, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textSPid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textSupplierID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textSPname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textSupplierName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textSPquantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textSupplierEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonSendEmail)
                    .addComponent(buttonBack)
                    .addComponent(refreshButton))
                .addContainerGap(31, Short.MAX_VALUE))
        );

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tableSupplierEmailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableSupplierEmailMouseClicked
        int i = tableSupplierEmail.getSelectedRow();
        String sparepartID = tableSupplierEmail.getValueAt(i, 0).toString();
        String sparepartName = tableSupplierEmail.getValueAt(i, 1).toString();
        String sparepartquantity = tableSupplierEmail.getValueAt(i, 2).toString();
        String supplierID = tableSupplierEmail.getValueAt(i, 3).toString();
        String supplierName = tableSupplierEmail.getValueAt(i, 4).toString();
        String supplierEmail = tableSupplierEmail.getValueAt(i, 5).toString();

        textSPid.setText(sparepartID);
        textSPname.setText(sparepartName);
        textSPquantity.setText(sparepartquantity);

        textSupplierID.setText(supplierID);
        textSupplierName.setText(supplierName);
        textSupplierEmail.setText(supplierEmail);
    }//GEN-LAST:event_tableSupplierEmailMouseClicked

    private void buttonSendEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSendEmailActionPerformed
        sendSupplierNotificationEmail();
    }//GEN-LAST:event_buttonSendEmailActionPerformed

    private void textSPidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textSPidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textSPidActionPerformed

    private void buttonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBackActionPerformed
        MainWindow mw = new MainWindow();
        mw.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonBackActionPerformed

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        Refresh();
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void Refresh(){
        textSPid.setText("");
        textSPname.setText("");
        textSPquantity.setText("");
        textSupplierID.setText("");
        textSupplierName.setText("");
        textSupplierEmail.setText("");
    }
    
    private void sendSupplierNotificationEmail() {

        String sparepartid = textSPid.getText();
        String sparepartname = textSPname.getText();
        String sparepartquantity = textSPquantity.getText();
        String supplierID = textSupplierID.getText();
        String supplierName = textSupplierName.getText();
        String supplierEmail = textSupplierEmail.getText();

        SendEmail sm = new SendEmail();
        sm.SendEmailToSupplier(sparepartid, sparepartname, sparepartquantity, supplierID, supplierName, supplierEmail);

    }

    private void loadDetailsToTable() {
        try {
            int rowCount = 0;
//            RefreshTable();
            Statement stmt = ConnectionMSSQL.connect().createStatement();
//            String query = "select * from SupplierTable order by SupplierID";
            String query = "select SparePartTable.SpartPartID AS SparePartTableSpartPartID,\n"
                    + " SparePartTable.SparePartName AS SparePartTableSparePartName, \n"
                    + " SparePartTable.StockQuantity AS SparePartTableStockQuantity,\n"
                    + " SupplierTable.SupplierID AS SupplierTableSupplierID,\n"
                    + " SupplierTable.SupplierName AS SupplierTableSupplierName,\n"
                    + " SupplierTable.SupplierEmail AS SupplierTableSupplierEmail\n"
                    + "FROM SparePartTable INNER JOIN SupplierTable ON SparePartTable.SupplierID = SupplierTable.SupplierID ";
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                model_TableSupplierEmail.addRow(new Object[model_TableSupplierEmail.getColumnCount()]);
                tableSupplierEmail.setValueAt(rs.getString("SparePartTableSpartPartID"), rowCount, 0);
                tableSupplierEmail.setValueAt(rs.getString("SparePartTableSparePartName"), rowCount, 1);
                tableSupplierEmail.setValueAt(rs.getString("SparePartTableStockQuantity"), rowCount, 2);
                tableSupplierEmail.setValueAt(rs.getString("SupplierTableSupplierID"), rowCount, 3);
                tableSupplierEmail.setValueAt(rs.getString("SupplierTableSupplierName"), rowCount, 4);
                tableSupplierEmail.setValueAt(rs.getString("SupplierTableSupplierEmail"), rowCount, 5);
                rowCount++;
            }
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(this, "Please contact for support.");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SendEmailToSupplier.class.getName()).log(Level.SEVERE, null, ex);
        }
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
            java.util.logging.Logger.getLogger(SendEmailToSupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SendEmailToSupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SendEmailToSupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SendEmailToSupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SendEmailToSupplier().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBack;
    private javax.swing.JButton buttonSendEmail;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refreshButton;
    private javax.swing.JTable tableSupplierEmail;
    private javax.swing.JTextField textSPid;
    private javax.swing.JTextField textSPname;
    private javax.swing.JTextField textSPquantity;
    private javax.swing.JTextField textSupplierEmail;
    private javax.swing.JTextField textSupplierID;
    private javax.swing.JTextField textSupplierName;
    // End of variables declaration//GEN-END:variables
}
