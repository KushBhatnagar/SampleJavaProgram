package myPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

/**
 * @author Kush This class will send an email from different clients with
 *         attachment , all required values can defined in Email.properties
 *         Note: 1)Before running this program Access for less secure apps
 *         should be turned on in GMAIL
 *          2)From the code you can figure out that
 *         objects are  constructed in a bottom-up approach—from MimeBodyPart,
 *         to MimeMultiPart, to MimeMessage. There are two MimeBodyPart objects,
 *         one for the text of the email and one for the attachment of the email
 * 
 */
public class SendEmail {
	public static void main(String[] args) throws Exception {

		Properties prop = new Properties();
		String Filepath = "Email.Properties";
		FileInputStream propFile = new FileInputStream(Filepath);
		prop.load(propFile);
		String timeStamp = new SimpleDateFormat("M/dd @ HH:mm:ss").format(Calendar.getInstance().getTime());

		// Fetching values from property file
		String sender = prop.getProperty("sender");
		String recevier = prop.getProperty("recevier");
		String password = prop.getProperty("password");
		String proxyHost = prop.getProperty("proxyHost");
		String proxyPort = prop.getProperty("proxyPort");
		String smtpHost = prop.getProperty("smtpHost");
		String smtpPort = prop.getProperty("smtpPort");
		String attachFilePath = prop.getProperty("attachFilePath");
		String mailSubject = prop.getProperty("mailSubject") + " " + timeStamp;
		String mailBody = prop.getProperty("mailBody");

		Properties sys_prop = System.getProperties();

		// Setting values for sending Email
		sys_prop.put("mail.smtp.starttls.enable", "true");
		sys_prop.put("mail.transport.protocol", "SMTP");
		sys_prop.put("mail.smtp.host", smtpHost);
		sys_prop.put("mail.smtp.auth", "true");
		sys_prop.put("mail.smtp.port", smtpPort);
		sys_prop.put("mail.smtp.debug", "true");
		sys_prop.put("mail.smtp.socketFactory.port", smtpPort);
		sys_prop.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		sys_prop.put("mail.smtp.socketFactory.fallback", "false");
		sys_prop.put("proxySet", "true");
		sys_prop.put("proxyPort", proxyPort);
		sys_prop.put("socksProxyHost", proxyHost);
		sys_prop.put("proxyHost", proxyHost);

		Session session = Session.getDefaultInstance(sys_prop, null);

		try {
			// Adding Sender/Receiver address and Subject Line
			MimeMessage msg = new MimeMessage(session);
			msg.setFrom(new InternetAddress(sender));
			msg.addRecipient(Message.RecipientType.TO, new InternetAddress(recevier));
			msg.setSubject(mailSubject);

			// Adding content to body/multi part objects
			MimeBodyPart messageBodyPartContent = new MimeBodyPart();
			messageBodyPartContent.setContent(mailBody, "text/html");
			Multipart multipart = new MimeMultipart();
			multipart.addBodyPart(messageBodyPartContent);

			// Adding attachment to body/multi part object
			DataSource source = new FileDataSource(attachFilePath);
			MimeBodyPart messageBodyPartAttchmnt = new MimeBodyPart();
			messageBodyPartAttchmnt.setDataHandler(new DataHandler(source));
			messageBodyPartAttchmnt.setFileName("Test");
			multipart.addBodyPart(messageBodyPartAttchmnt);

			// Adding attachment and Body content to MIME msg object
			msg.setContent(multipart);

			// Sending the message
			Transport transport = session.getTransport("smtp");
			transport.connect(smtpHost, sender, password);
			transport.sendMessage(msg, msg.getAllRecipients());
			transport.close();

			System.out.println("Mail sent succesfully!");

		} catch (MessagingException e) {
			throw new RuntimeException(e);
		} finally {
			sys_prop.remove("proxySet");
			sys_prop.remove("proxyHost");
			sys_prop.remove("proxyPort");
			sys_prop.remove("socksProxyHost");
			sys_prop.remove("mail.smtp.socketFactory.class");
			sys_prop.remove("mail.smtp.socketFactory.fallback");
			sys_prop.remove("mail.smtp.socketFactory.port");

		}

	}

}
