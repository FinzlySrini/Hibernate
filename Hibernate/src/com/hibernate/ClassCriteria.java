package com.hibernate;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class ClassCriteria {
public static void main(String[] args) {
	Configuration cf = new Configuration();
	cf.configure();
	cf.addAnnotatedClass(Trp.class);
	
	SessionFactory sf= cf.buildSessionFactory();
	Session s = sf.openSession();
	
	Transaction tr = s.beginTransaction();
	Criteria cr = s.createCriteria(Trp.class);
	cr.add(Restrictions.gt("experience", 3));
	List<Trp> ls = cr.list();
	System.out.println(ls);
	for(Trp t:ls) {
		System.out.println(t);
	}
	tr.commit();
	s.close();
}
}
