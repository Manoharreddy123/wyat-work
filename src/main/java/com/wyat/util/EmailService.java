package com.wyat.util;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service("emailService")
public class EmailService {

	private JavaMailSender mailSender;
	
	@Autowired
	public EmailService(JavaMailSender mailSender) {
		this.mailSender = mailSender;
	}
	
	@Async
	public void sendEmail(String email) throws AddressException, MessagingException {
		

		MimeMessage messageEmail = mailSender.createMimeMessage();
		
		
		messageEmail.setFrom(new InternetAddress(email));
		messageEmail.setRecipients(Message.RecipientType.TO,
				InternetAddress.parse(email));
		messageEmail.setSubject("Registration Confirmation");
		String bodyMsg = MessageBody.messageBody(email);
		messageEmail.setText(bodyMsg);
		messageEmail.setContent(bodyMsg, "text/html");
		mailSender.send(messageEmail);
		
		
/*		registrationEmail.
		registrationEmail.setSubject("Registration Confirmation");
		registrationEmail.setText(MessageBody.messageBody(mailId));
		registrationEmail.setFrom("confirm@wya.com");
		mailSender.send(email);*/
	}
}
