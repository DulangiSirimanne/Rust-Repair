
package lk.sliitacademy.rustrepaircenter;

import FrontEnd.MainWindow;
import java.sql.SQLException;
import static lk.sliitacademy.rustrepaircenter.ConnectionMSSQL.connect;


public class RustMainClass {

    public static void main(String[] args) throws ClassNotFoundException {
        connect();
        System.out.println("ok");

        MainWindow mw = new MainWindow();
        mw.setVisible(true);
    }
}
