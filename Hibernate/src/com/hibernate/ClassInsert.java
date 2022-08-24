package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClassInsert {
public static void main(String[] args) {
	Configuration a = new Configuration();
	a.configure();
	a.addAnnotatedClass(Employee.class);
	SessionFactory sf = a.buildSessionFactory();
	Session s = sf.openSession();
	Transaction ts = s.beginTransaction();
	Employee e = new Employee();
	e.setId(7);
	e.setName("akash");
	s.save(e);
	ts.commit();
	s.close();
	System.out.println("InsertSuccess!!!");
}
}
