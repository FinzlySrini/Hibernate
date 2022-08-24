package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClassDelete {
public static void main(String[] args) {
	
	Configuration snf = new Configuration();
	snf.configure();
	snf.addAnnotatedClass(Employee.class);
	SessionFactory sf = snf.buildSessionFactory();
	Session session = sf.openSession();
	
	Transaction ts = session.beginTransaction();
	Employee ee = new Employee();
	
	ee.setId(1);
	ee.setName("anand");
	session.delete(ee);
	
	ts.commit();
	session.close();
	System.out.println("DeleteSuccess!!!");
}
}
