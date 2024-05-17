package com.abhi.javamail.util;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.stereotype.Component;

@Component
public class MailUtil {

	public Boolean sendMail() {
		
		Boolean result=false;
		String toMail="abhishek.keshari@outllok.in";
		String fromMail="abhishek.keshari.2023@gmail.com";
		String host="localhost";
		
		Properties properties=new Properties();
		properties.setProperty("mail.smtp.host", host);	
		Session session=Session.getDefaultInstance(properties);
		
		try {
			MimeMessage message=new MimeMessage(session);
			message.setFrom(new InternetAddress(fromMail));
			message.addRecipients(Message.RecipientType.TO, toMail);
			message.setSubject("This is Mail Notification Test Subject");
			message.setText("This is body of the mail");
			Transport.send(message);
			System.out.println("Mail Sent Successfully");
			result=true;
		}catch(MessagingException ex) {
			System.out.println("Exception occure in Mail sending");
			ex.printStackTrace();
		}
		return result;
		
	}
}
