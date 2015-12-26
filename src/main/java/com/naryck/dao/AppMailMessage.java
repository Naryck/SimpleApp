package com.naryck.dao;

import java.util.*;

import javax.persistence.*;

@Entity
public class AppMailMessage {
	
	@Override
	public String toString() {
		return "MailMessage [date: " + date + ", mail to: " + email + ", subject: " + subject + ", message: " + message + "]";
	}

	@Id
	@GeneratedValue
	int id;
	
	@Temporal(TemporalType.TIMESTAMP)
	Date date;
	
	String email;
	String subject;
	String message;
	String status;
	
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public AppMailMessage(String email, String subject, String message) {
		super();
		this.email = email;
		this.subject = subject;
		this.message = message;
	}
	
	public AppMailMessage() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getBeginning() {
		return date;
	}

	public void setBeginning(Date beginning) {
		this.date = beginning;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}