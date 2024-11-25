package ucu.edu.ua.tasktwo;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class MailSender {
    public void sendMail(MailInfo mailInfo) {
        Properties props = new Properties();
        props.put("mail.smtp.host", "mail.smtp2go.com");
        props.put("mail.smtp.port", "2525");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        Authenticator auth = new Authenticator() {
   protected PasswordAuthentication 
   getPasswordAuthentication() {
    return new PasswordAuthentication("email", "password");
   }
  };
  Session session = Session.getInstance(props, auth);

        try {
            // Create a message with the specified attributes
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("email"));
            message.setRecipients(Message.RecipientType.TO, 
            InternetAddress.parse("dobosevych@gmail.com"));
            message.setSubject("hello");
            message.setText(mailInfo.generateText());

            // Send the message
            Transport.send(message);
            System.out.println("Email sent successfully.");

        } catch (MessagingException e) {
            e.printStackTrace();
            System.out.println("Error sending email: " + e.getMessage());
        }
    }
}
 