package com.naryck.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.naryck.appmailsender.AppMailSender;
import com.naryck.dao.AppMailMessage;
import com.naryck.interfaces.*;

@Controller
public class WebAppController {

	@Autowired
	IPersist persistenceServices;
	@Autowired
	public AppMailSender appMailSender;
	
	@RequestMapping({ "/", "home" })
	String home() {
		return "home";
	}
	
	@RequestMapping("sendMessage")
	String randomAdding() {
		return "sendMessageForm";
	}
	
	@RequestMapping("sendMessageAction")
	String sendMessageAction(String email, String topic, String messageText) {
		if (email.equalsIgnoreCase("") || email == null) {
			return "fail";
		}
		AppMailMessage mailMessage = new AppMailMessage(email, topic, messageText);
		Calendar calendar = new GregorianCalendar();
		Date timeNow = calendar.getTime();
		mailMessage.setBeginning(timeNow);
		if (appMailSender.sendMail(mailMessage)) { 
			mailMessage.setStatus(Const.STATUS_OK);
			persistenceServices.addMsgToDb(mailMessage);
			return "success";
		}
		else {
			mailMessage.setStatus(Const.STATUS_FAIL);
			persistenceServices.addMsgToDb(mailMessage);
			return "fail";
		}
	}
	
	@RequestMapping("doNothing")
	String doNothing() {
		return "doNothing";
	}

}
