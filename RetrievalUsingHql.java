//Get data from the Customer table using HQL in Hibernate

package com.abc.hiberapp2.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.abc.hiberapp2.Customer;

public class RetrievalUsingHql {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("/com/abc/hiberapp2/cfgs/hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		
		String hql="from Customer";
		Query query=session.createQuery(hql);
		List<Customer> list=query.list();
		
		for(Customer cust:list) {
			System.out.println(cust);
		}
		session.close();
		factory.close();
	}

}
