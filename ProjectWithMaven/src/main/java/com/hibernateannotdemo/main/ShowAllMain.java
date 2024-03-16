package com.hibernateannotdemo.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.hibernate.service.ServiceRegistry;

import com.hibernateannotdemo.pojo.Product;

public class ShowAllMain {

	public static void main(String[] args) {
	
		Configuration config = new Configuration();
		config.configure();
		
		SessionFactory sf = config.buildSessionFactory();
		
		Session s = sf.openSession();
		
		Query q = s.createQuery("FROM Product");
		
		List<Product> lst = q.list();
		
		System.out.println("All products are :- ");
		lst.forEach(System.out::println);
		
		sf.close();
	}
}




