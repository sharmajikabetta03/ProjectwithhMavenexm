package com.hibernateannotdemo.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.hibernateannotdemo.pojo.Product;

public class InsertMain {

	public static void main(String[] args) {
	
		Configuration config = new Configuration();
		config.configure();
		
		SessionFactory sf = config.buildSessionFactory();
		
		Session s = sf.openSession();
		
		Transaction tr = s.beginTransaction();
		
		Product p1 = new Product();
		p1.setPname("usb");
		p1.setPrice(230);		
		
		s.save(p1);
		
		tr.commit();
		System.out.println("product saved");
		
		sf.close();
	}
}




