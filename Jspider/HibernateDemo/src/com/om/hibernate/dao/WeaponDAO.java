package com.om.hibernate.dao;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.om.hibernate.dto.WeaponDTO;

public class WeaponDAO {
	
	public void save(WeaponDTO weaponDTO){
		
		Configuration configuration = new Configuration();
		
		configuration.configure();
		configuration.addAnnotatedClass(WeaponDTO.class);
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		
 org.hibernate.Transaction transaction = session.beginTransaction();
 
 session.save(weaponDTO);
 transaction.commit();
 
 session.close();
 factory.close();
 

	}

}
