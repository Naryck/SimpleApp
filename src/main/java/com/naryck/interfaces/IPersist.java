package com.naryck.interfaces;

import com.naryck.dao.AppMailMessage;

public interface IPersist {
	void addMsgToDb(AppMailMessage mailMessage);
	
}