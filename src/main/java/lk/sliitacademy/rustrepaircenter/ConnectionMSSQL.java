/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.sliitacademy.rustrepaircenter;

import java.sql.*;

/**
 *
 * @author dulan
 */
public class ConnectionMSSQL {
        public static Connection connect() throws ClassNotFoundException {
            Connection conn = null;
            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=RustRepairCenter;user=sa;password=123");
                
            } catch (Exception e) {
                System.out.println(e);
            }
            return conn;
        }
}
