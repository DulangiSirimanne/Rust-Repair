/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FrontEnd;

import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import lk.sliitacademy.rustrepaircenter.ConnectionMSSQL;

public class AddJob extends javax.swing.JFrame {

    public AddJob() {
        initComponents();

        try {
            loadJobToCombo();
            loadCustomerToCombo();
            loadEmployeeToCombo();
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
        comboBoxEmpID = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        backbutton = new javax.swing.JButton();
        deletebutton = new javax.swing.JButton();
        savebutton = new javax.swing.JButton();
        refreshbutton = new javax.swing.JButton();
        jobIDTextField = new javax.swing.JTextField();
        jobDateTextField = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        searchJobIDComboBox = new javax.swing.JComboBox<>();
        cusIDComboBox = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        sparePartCostTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jobFeeTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Job ID: ");

        jLabel2.setText("Issue Date : ");

        jLabel3.setText("Search Job ID : ");

        jLabel4.setText("Customer ID : ");

        comboBoxEmpID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxEmpIDActionPerformed(evt);
            }
        });

        jLabel6.setText("Search Employee ID : ");

        backbutton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        backbutton.setText("Back");
        backbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbuttonActionPerformed(evt);
            }
        });

        deletebutton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        deletebutton.setText("Delete");
        deletebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebuttonActionPerformed(evt);
            }
        });

        savebutton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        savebutton.setText("Save");
        savebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebuttonActionPerformed(evt);
            }
        });

        refreshbutton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        refreshbutton.setText("Refresh");
        refreshbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshbuttonActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ONGOING", "Complete", "Cancel" }));

        searchJobIDComboBox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchJobIDComboBoxKeyPressed(evt);
            }
        });

        jLabel7.setText("Spare Part Cost : ");

        jLabel8.setText("Job Status : ");

        jLabel9.setText("Job Fee : ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(refreshbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(savebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(deletebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(backbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(23, 23, 23))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1)
                                .addComponent(jLabel8))
                            .addGap(29, 29, 29)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(comboBoxEmpID, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(searchJobIDComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cusIDComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBox1, 0, 361, Short.MAX_VALUE)
                                .addComponent(sparePartCostTextField)
                                .addComponent(jobDateTextField)
                                .addComponent(jobIDTextField)
                                .addComponent(jobFeeTextField))
                            .addGap(242, 242, 242)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel7))
                        .addGap(105, 105, 105))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(searchJobIDComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jobIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jobDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(sparePartCostTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cusIDComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(comboBoxEmpID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jobFeeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backbutton)
                    .addComponent(deletebutton)
                    .addComponent(savebutton)
                    .addComponent(refreshbutton))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void comboBoxEmpIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxEmpIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxEmpIDActionPerformed

    private void backbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbuttonActionPerformed
        MainWindow mw = new MainWindow();
        mw.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backbuttonActionPerformed

    private void deletebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebuttonActionPerformed
        String Job_Id = jobIDTextField.getText();
        if (!Job_Id.isEmpty()) {
            DeleteJobID(Job_Id);
        } else {
            JOptionPane.showMessageDialog(this, "Please fill all fields before save.", "Empty fields", JOptionPane.OK_OPTION);
        }
    }//GEN-LAST:event_deletebuttonActionPerformed

    private void searchJobIDComboBoxKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchJobIDComboBoxKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String comboData[] = searchJobIDComboBox.getSelectedItem().toString().split("--");
            String job_ID = comboData[0];
            String issue_date = comboData[1];
            String spare_cost = comboData[2];
            String cus_ID = comboData[3];
            String emp_ID = comboData[4];
            String job_Fee = comboData[5];
            String job_Status = comboData[6];

            jobIDTextField.setText(job_ID);
            jobFeeTextField.setText(job_Fee);
            jobDateTextField.setText(issue_date);
            sparePartCostTextField.setText(spare_cost);
            cusIDComboBox.setSelectedItem(cus_ID);
            comboBoxEmpID.setSelectedItem(emp_ID);

        }
    }//GEN-LAST:event_searchJobIDComboBoxKeyPressed

    private void refreshbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshbuttonActionPerformed
        Refresh();
    }//GEN-LAST:event_refreshbuttonActionPerformed

    private void savebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebuttonActionPerformed
        JobSave();
    }//GEN-LAST:event_savebuttonActionPerformed

    private void JobSave() {
        String Job_ID = jobIDTextField.getText();
        String Issue_Date = jobDateTextField.getText();
        float SparePart_Cost = Float.parseFloat(sparePartCostTextField.getText());
        String CustomerArray[] = cusIDComboBox.getSelectedItem().toString().split("--");
        String Customer_ID = CustomerArray[1].toString();
        String EmployeeArray[] = comboBoxEmpID.getSelectedItem().toString().split("--");
        String Employee_ID = EmployeeArray[1].toString();
        float Job_Fee = Float.parseFloat(jobFeeTextField.getText());

        if (!Job_ID.isEmpty() && !Issue_Date.isEmpty()) {
            try {
                Statement stmt = ConnectionMSSQL.connect().createStatement();
                ResultSet rs = stmt.executeQuery("select JobID from JobTable where JobID = '" + Job_ID + "'");

                if (rs.next()) {
                    int x = JOptionPane.showConfirmDialog(this, "Are you sure to change '" + Job_ID + "' details?", "Update Job?", JOptionPane.YES_OPTION);
                    if (x == JOptionPane.YES_OPTION) {
                        String UpdateQuery = "update JobTable set IssueDate = '" + Issue_Date + "'"
                                + ",SparepartCost = '" + SparePart_Cost + "', CustomerID = '" + Customer_ID + "', EmployeeID = '" + Employee_ID + "', JobFee = '"+ Job_Fee +"' where JobID = '" + Job_ID + "'";
                        stmt.execute(UpdateQuery);
                        JOptionPane.showMessageDialog(this, "Job details are updated.");
                        Refresh();
                    } else if (x == JOptionPane.NO_OPTION) {
                        jobIDTextField.requestFocus();
                    }
                } else if (!rs.next()) {
                    String InsertQuery = "insert into JobTable (JobID, IssueDate,"
                            + " SparepartCost, CustomerID, EmployeeID, JobFee) values ( '" + Job_ID + "','" + Issue_Date + "','" + SparePart_Cost + "','" + Customer_ID + "','" + Employee_ID + "', '"+ Job_Fee +"') ";
                    stmt.execute(InsertQuery);
                    JOptionPane.showMessageDialog(this, "New Job Details are saved.");
                    Refresh();
                }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(AddSpareParts.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(AddSpareParts.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (Job_ID.isEmpty() || Issue_Date.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill all the fields before save.", "Empty feilds", JOptionPane.OK_OPTION);
            jobIDTextField.requestFocus();
        }
    }

    private void DeleteJobID(String Job_Id) {
        int x = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this?", "Delete Job?", JOptionPane.YES_OPTION);
        if (x == JOptionPane.YES_OPTION) {
            try {
                Statement stmt = ConnectionMSSQL.connect().createStatement();
                ResultSet rs = stmt.executeQuery("select JobID from JobTable where JobID = '" + Job_Id + "'");

                if (rs.next()) {
                    String query = "delete from JobTable where JobID = '" + Job_Id + "'";
                    stmt.execute(query);
                    JOptionPane.showMessageDialog(this, "Deleted");
                    Refresh();
                }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(AddJob.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(AddJob.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private void Refresh() {
        jobIDTextField.setText("");
        jobFeeTextField.setText("");
        jobDateTextField.setText("");
        sparePartCostTextField.setText("");
        loadJobToCombo();
        loadCustomerToCombo();
        loadEmployeeToCombo();
    }

    private void loadJobToCombo() {
        try {
            Statement stmt = ConnectionMSSQL.connect().createStatement();
            String query = "select JobTable.JobID AS JobTableJobID,\n"
                    + "JobTable.IssueDate AS JobTableIssueDate,\n"
                    + "JobTable.JobFee AS JobTableJobFee,\n"
                    + "JobTable.SparepartCost AS JobTableSparepartCost,\n"
                    + "EmployeeTable.EmployeeID AS EmployeeTableEmployeeID,\n"
                    + "EmployeeTable.EmployeeName AS EmployeeTableEmployeeName,\n"
                    + "CustomerTable.CustomerID AS CustomerTableCustomerID,\n"
                    + "CustomerTable.CustomerName AS CustomerTableCustomerName\n"
                    + "FROM JobTable INNER JOIN EmployeeTable ON JobTable.EmployeeID=EmployeeTable.EmployeeID\n"
                    + "INNER JOIN CustomerTable ON CustomerTable.CustomerID=JobTable.CustomerID ";
            ResultSet rs = stmt.executeQuery(query);

            searchJobIDComboBox.removeAllItems();
            searchJobIDComboBox.insertItemAt("--Select--", 0);
            int position = 1;
            if (rs.next()) {
                do {
                    searchJobIDComboBox.insertItemAt(rs.getString("JobTableJobID") + "--" + rs.getString("JobTableIssueDate") + "--" + rs.getString("JobTableSparepartCost") + "--" + rs.getString("CustomerTableCustomerID") + "--" + rs.getString("CustomerTableCustomerName") + "--" + rs.getString("EmployeeTableEmployeeID") + "--" + rs.getString("EmployeeTableEmployeeName") + "--" + rs.getString("JobTableJobFee"), position);
                    position++;
                } while (rs.next());
            }
            searchJobIDComboBox.setSelectedIndex(0);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", ERROR);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddSupplier.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void loadEmployeeToCombo() {
        try {
            Statement stmt = ConnectionMSSQL.connect().createStatement();
            String query = "select * from EmployeeTable order by EmployeeID";
            ResultSet rs = stmt.executeQuery(query);

            comboBoxEmpID.removeAllItems();
            comboBoxEmpID.insertItemAt("--Select--", 0);
            int position = 1;
            if (rs.next()) {
                do {
                    cusIDComboBox.insertItemAt(rs.getString("EmployeeName") + "--" + rs.getString("EmployeeID"), position);
                    position++;
                } while (rs.next());
            }
            cusIDComboBox.setSelectedIndex(0);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", ERROR);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddSupplier.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void loadCustomerToCombo() {
        try {
            Statement stmt = ConnectionMSSQL.connect().createStatement();
            String query = "select * from CustomerTable order by CustomerID";
            ResultSet rs = stmt.executeQuery(query);

            cusIDComboBox.removeAllItems();
            cusIDComboBox.insertItemAt("--Select--", 0);
            int position = 1;
            if (rs.next()) {
                do {
                    cusIDComboBox.insertItemAt(rs.getString("CustomerName") + "--" + rs.getString("CustomerID"), position);
                    position++;
                } while (rs.next());
            }
            cusIDComboBox.setSelectedIndex(0);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", ERROR);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddSupplier.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(AddJob.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddJob.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddJob.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddJob.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddJob().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbutton;
    private javax.swing.JComboBox<String> comboBoxEmpID;
    private javax.swing.JComboBox<String> cusIDComboBox;
    private javax.swing.JButton deletebutton;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jobDateTextField;
    private javax.swing.JTextField jobFeeTextField;
    private javax.swing.JTextField jobIDTextField;
    private javax.swing.JButton refreshbutton;
    private javax.swing.JButton savebutton;
    private javax.swing.JComboBox<String> searchJobIDComboBox;
    private javax.swing.JTextField sparePartCostTextField;
    // End of variables declaration//GEN-END:variables

}
