
package lk.sliitacademy.rustrepaircenter;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;


public class SendEmail {



    public void SendEmailToSupplier(String sparepartid, String sparepartname, String sparepartquantity, String supplierID, String supplierName, String supplierEmail) {

        final String username = "it20773526dulangi@gmail.com";
        final String password = "it2077vinethma3526";

        Properties props = new Properties();
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(supplierEmail)); //ravindu.spsolutions@gmail.com
            message.setSubject("Notification to order spare parts.");
            message.setText("We are out of stock of the spare part '" + sparepartid + "' -- '" + sparepartname + "'."+ "We require '"+sparepartquantity+"' '"+sparepartname+"'"
                    + " Please send us the stock as soon as possible.");

            Transport.send(message);
            System.out.println("Done");
            JOptionPane.showMessageDialog(null, "Spare parts order email is sent to '" + supplierID + "' -- '" + supplierName + "'");

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
    
    
    public void SendEmailToCustomer(String jobID, String jobFee, String vehicleNo, String cusID, String cusName, String cusEmail){
        
        final String username = "it20773526dulangi@gmail.com";
        final String password = "it2077vinethma3526";
        
                Properties props = new Properties();
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(cusEmail)); //ravindu.spsolutions@gmail.com
            message.setSubject("Notification to order spare parts.");
            message.setText("Thank you for choosing Rust Repair Center. Repairing process of your vehical '" + vehicleNo + "' is completed. Your vehical is currently available now.'" 
                    + "Service Charges : '" + jobFee + "'");

            Transport.send(message);
            System.out.println("Done");
            JOptionPane.showMessageDialog(null, "Email is send to Customer '" + cusID + "' -- '" + cusName + "'");

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    } 
}
