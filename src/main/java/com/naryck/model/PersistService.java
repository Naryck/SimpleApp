package com.naryck.model;

import javax.persistence.*;

import org.springframework.transaction.annotation.Transactional;

import com.naryck.dao.AppMailMessage;
import com.naryck.interfaces.*;

public class PersistService implements IPersist {
	
	@PersistenceContext(unitName = "springHibernate")
	public EntityManager em;

	@Transactional
	public void addMsgToDb(AppMailMessage mailMessage) {
		em.persist(mailMessage);
	}
	
}