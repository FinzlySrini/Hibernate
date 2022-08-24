package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClassUpdate {
public static void main(String[] args) {
	Configuration cnfg = new Configuration();
	cnfg.configure();
	cnfg.addAnnotatedClass(Employee.class);
	SessionFactory sf = cnfg.buildSessionFactory();
	Session session = sf.openSession();
	Transaction tr = session.beginTransaction();
	Employee cb = new Employee();
	cb.setId(0);
	cb.setName("anand");
	session.update(cb);
	tr.commit();
	session.close();
	System.out.println("UpdateSuccess!!!");
}
}
