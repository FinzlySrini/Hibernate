package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.util.List;
public class ClassRead {
public static void main(String[] args) {
	Configuration a = new Configuration();
	a.configure();
	a.addAnnotatedClass(Employee.class);
	SessionFactory sf = a.buildSessionFactory();
	Session s = sf.openSession();
	Transaction ts = s.beginTransaction();
	Employee ee = new Employee();
	Employee e1= s.load(Employee.class,2);
	//List<Employee> emp = s.createQuery("from Employee").list();
	
	//System.out.println(emp);
	System.out.println(e1);
	s.close();
}
}
