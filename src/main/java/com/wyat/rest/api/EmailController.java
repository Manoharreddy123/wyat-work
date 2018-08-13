package com.wyat.rest.api;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wyat.util.EmailService;

@RestController
public class EmailController {

	static String emailToRecipient, emailSubject, emailMessage;
	static final String emailFromRecipient = "<!-- Source Email Address -->";

	@Autowired
	private EmailService emailService;

	@RequestMapping(value = "sendEmail", method = RequestMethod.POST)
	public String sendEmailToClient( final @RequestParam(value="mailId", required=true) String mailId) {
		// Logging The Email Form Parameters For Debugging Purpose
		System.out.println("Receipient?= " + mailId +  "\n");
		
		if(null != mailId) {

			try {
				emailService.sendEmail(mailId);
			} catch (MessagingException e) {
				e.printStackTrace();
				return new String("Sent Failed::: Please user Valid mail *********");
			}

			System.out.println("\nMessage Send Successfully.... Hurrey!\n");
		return new String("Thank You! Your Email Has Been Sent!");
		}
		return new String("Sent Failed::: Please user Valid mail *********");
	}
}