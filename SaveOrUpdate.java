//Save and Update operations in Customer table using Hibernate

package com.abc.hiberapp2.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.abc.hiberapp2.Customer;

public class SaveOrUpdate {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("/com/abc/hiberapp2/cfgs/hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		
		Customer cust=new Customer();
		cust.setId(105);
		cust.setName("Kavi");
		cust.setMobile(98554333);
		cust.setEmail("kavi@gmail.com");
		
		Transaction tx=null;
		try {
			tx=session.beginTransaction();
			session.saveOrUpdate(cust);
			tx.commit();
			System.out.println("Details saved or updated successfully");
		}
		catch(Exception e) {
			tx.rollback();
			System.out.println("Failed");
		}
		session.close();
		factory.close();
	}

}
