//Perform Delete operation in Customer table using Hibernate

package com.abc.hiberapp2.main;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.abc.hiberapp2.Customer;

public class Delete {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("/com/abc/hiberapp2/cfgs/hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		
		Customer cust=new Customer();
		cust.setId(101);
		
		Transaction tx=null;
		try {
			tx=session.beginTransaction();
			session.delete(cust);
			tx.commit();
			System.out.println("The data was deleted");
		}
		catch(Exception e) {
			tx.rollback();
			System.out.println("Failed");
		}
		session.close();
		factory.close();
	}

}
