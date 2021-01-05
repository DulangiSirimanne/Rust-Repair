
package FrontEnd;

import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import lk.sliitacademy.rustrepaircenter.ConnectionMSSQL;


public class IncomeExpense extends javax.swing.JFrame {


    public IncomeExpense() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        textStartDate = new javax.swing.JTextField();
        textEndDate = new javax.swing.JTextField();
        textCalculateIncome = new javax.swing.JTextField();
        textCalculateExpense = new javax.swing.JTextField();
        textCalculateProfit = new javax.swing.JTextField();
        buttonCalculateIncome = new javax.swing.JButton();
        buttonCalculateExpense = new javax.swing.JButton();
        buttonCalculateProfit = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        RefreshButton = new javax.swing.JButton();
        calendarButtonStartDate = new org.sourceforge.jcalendarbutton.JCalendarButton();
        calendarButtonEndDate = new org.sourceforge.jcalendarbutton.JCalendarButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonCalculateIncome.setText("Calcualte Income");
        buttonCalculateIncome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCalculateIncomeActionPerformed(evt);
            }
        });

        buttonCalculateExpense.setText("Calcualte Expense");
        buttonCalculateExpense.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCalculateExpenseActionPerformed(evt);
            }
        });

        buttonCalculateProfit.setText("Calculate Profit");
        buttonCalculateProfit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCalculateProfitActionPerformed(evt);
            }
        });

        backButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        RefreshButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        RefreshButton.setText("Refresh");
        RefreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshButtonActionPerformed(evt);
            }
        });

        calendarButtonStartDate.setText("Start Date");
        calendarButtonStartDate.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                calendarButtonStartDatePropertyChange(evt);
            }
        });

        calendarButtonEndDate.setText("End Date");
        calendarButtonEndDate.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                calendarButtonEndDatePropertyChange(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textCalculateProfit, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                            .addComponent(textCalculateExpense)
                            .addComponent(textCalculateIncome)
                            .addComponent(textStartDate))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(buttonCalculateIncome, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                                    .addComponent(calendarButtonStartDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(62, 62, 62)
                                .addComponent(textEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(buttonCalculateProfit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buttonCalculateExpense, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(RefreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(calendarButtonEndDate, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                    .addComponent(backButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(39, 39, 39))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calendarButtonStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calendarButtonEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(121, 121, 121)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textCalculateIncome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonCalculateIncome))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textCalculateExpense, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonCalculateExpense))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textCalculateProfit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonCalculateProfit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backButton)
                    .addComponent(RefreshButton))
                .addGap(32, 32, 32))
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

    private void calendarButtonStartDatePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_calendarButtonStartDatePropertyChange
        if (evt.getNewValue() instanceof Date) {
            Date RecievedDate = (Date) evt.getNewValue();
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            textStartDate.setText(format.format(RecievedDate));
        }
    }//GEN-LAST:event_calendarButtonStartDatePropertyChange

    private void calendarButtonEndDatePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_calendarButtonEndDatePropertyChange
        if (evt.getNewValue() instanceof Date) {
            Date RecievedDate = (Date) evt.getNewValue();
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            textEndDate.setText(format.format(RecievedDate));
        }
    }//GEN-LAST:event_calendarButtonEndDatePropertyChange

    private void buttonCalculateIncomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCalculateIncomeActionPerformed
        String StartDate = textStartDate.getText();
        String EndDate = textEndDate.getText();

        try {
            Statement stmt = ConnectionMSSQL.connect().createStatement();
            ResultSet rs = stmt.executeQuery("select SUM(JobFee) AS totalIncome from JobTable where JobStatus = 'Complete' AND (IssueDate >= '" + StartDate + "' AND IssueDate <= '" + EndDate + "')");

            if (rs.next()) {
                float totalIncome = rs.getFloat("totalIncome");
                textCalculateIncome.setText(String.valueOf(totalIncome));
            } else if (!rs.next()){
                JOptionPane.showMessageDialog(this, "Please select a different date range.", "Not Available", JOptionPane.OK_OPTION);
            }

        } catch (SQLException | HeadlessException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(this, "Please contact for support.");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddSupplier.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonCalculateIncomeActionPerformed

    private void buttonCalculateExpenseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCalculateExpenseActionPerformed
        String StartDate = textStartDate.getText();
        String EndDate = textEndDate.getText();

        try {
            Statement stmt = ConnectionMSSQL.connect().createStatement();
            ResultSet rs = stmt.executeQuery("select SUM(SparepartCost) AS totalExpense from JobTable where JobStatus = 'Complete' AND (IssueDate >= '" + StartDate + "' AND IssueDate <= '" + EndDate + "')");

            if (rs.next()) {
                float totalExpenses = rs.getFloat("totalExpense");
                textCalculateExpense.setText(String.valueOf(totalExpenses));
            } else {
                JOptionPane.showMessageDialog(this, "Please select a different date range.", "Not Available", JOptionPane.OK_OPTION);
            }

        } catch (SQLException | HeadlessException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(this, "Please contact for support.");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddSupplier.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonCalculateExpenseActionPerformed

    private void buttonCalculateProfitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCalculateProfitActionPerformed
        float totalIncome = Float.parseFloat(textCalculateIncome.getText());
        float totalExpense = Float.parseFloat(textCalculateExpense.getText());
        
        float totalProfit = totalIncome - totalExpense;
        textCalculateProfit.setText(String.valueOf(totalProfit));
        
        
    }//GEN-LAST:event_buttonCalculateProfitActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        MainWindow mw = new MainWindow();
        mw.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void RefreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshButtonActionPerformed
        Refresh();
    }//GEN-LAST:event_RefreshButtonActionPerformed

    private void Refresh(){
        textStartDate.setText("");
        textEndDate.setText("");
        textCalculateIncome.setText("");
        textCalculateExpense.setText("");
        textCalculateProfit.setText("");
                
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
            java.util.logging.Logger.getLogger(IncomeExpense.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IncomeExpense.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IncomeExpense.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IncomeExpense.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IncomeExpense().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton RefreshButton;
    private javax.swing.JButton backButton;
    private javax.swing.JButton buttonCalculateExpense;
    private javax.swing.JButton buttonCalculateIncome;
    private javax.swing.JButton buttonCalculateProfit;
    private org.sourceforge.jcalendarbutton.JCalendarButton calendarButtonEndDate;
    private org.sourceforge.jcalendarbutton.JCalendarButton calendarButtonStartDate;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField textCalculateExpense;
    private javax.swing.JTextField textCalculateIncome;
    private javax.swing.JTextField textCalculateProfit;
    private javax.swing.JTextField textEndDate;
    private javax.swing.JTextField textStartDate;
    // End of variables declaration//GEN-END:variables
}
