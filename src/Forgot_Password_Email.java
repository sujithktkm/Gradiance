import java.util.Properties;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
 
public class Forgot_Password_Email {
 String sendermailID ="";
 String SenderMailPassword ="";
        public Forgot_Password_Email(String sendermail , String senderpassword)
        {
         this.sendermailID=sendermail;
         this.SenderMailPassword=senderpassword;
         sendmail();
        }

    private void sendmail() {
        final String username = "shashank.vy187@gmail.com";
		final String password = "pulimamidi1990";
 
		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");
 
		Session session = Session.getInstance(props,
		  new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		  });
 
		try {
 
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("from-email@gmail.com"));
			message.setRecipients(Message.RecipientType.TO,
				InternetAddress.parse(sendermailID));
			message.setSubject("Testing Subject");
			message.setText("Your Password is "
				+ SenderMailPassword);
 
			Transport.send(message);
 
			System.out.println("Done");
 
		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
    }
}
 
