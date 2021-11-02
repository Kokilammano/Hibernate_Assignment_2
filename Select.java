//Get data from Customer table in Hibernate

package com.abc.hiberapp2.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.abc.hiberapp2.Customer;

public class Select {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("/com/abc/hiberapp2/cfgs/hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		
		int id=102;
		
		Object obj=session.get(Customer.class, id);
		Customer cust=(Customer)obj;
		System.out.println(cust);
		
		session.close();
		factory.close();
	}

}
