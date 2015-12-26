package com.naryck.appmailsender;

import org.springframework.mail.MailException;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;

import com.naryck.dao.*;

public class AppMailSender {
	MailSender sender;
	SimpleMailMessage template;
	
	public AppMailSender(MailSender sender, SimpleMailMessage template) {
		this.sender = sender;
		this.template = template;
	}
	
	public AppMailSender() {}

	public MailSender getSender() {
		return sender;
	}

	public void setSender(MailSender sender) {
		this.sender = sender;
	}

	public SimpleMailMessage getTemplate() {
		return template;
	}

	public void setTemplate(SimpleMailMessage template) {
		this.template = template;
	}
	
	public boolean sendMail(AppMailMessage mailMessage) {
		try {
			template.setTo(mailMessage.getEmail());
			template.setSubject(mailMessage.getSubject());
			template.setText(mailMessage.getMessage());
			sender.send(template);
			return true;
		} catch (MailException e) {
			System.out.println("Exception: " + e);
			return false;
		}
	}
}