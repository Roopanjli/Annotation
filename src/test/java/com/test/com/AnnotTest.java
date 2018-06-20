package com.test.com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import org.hibernate.cfg.Configuration;

import com.main.com.Annot;

public class AnnotTest {

	public static void main(String[] args) {
		Configuration ac = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory fac = ac.buildSessionFactory();
		Session s = fac.openSession();
		Transaction tx = s.beginTransaction();
		Annot a = new Annot();
		a.setAge(23);
		a.setFname("Raju");
		a.setLname("Singh");
		s.save(a);
		tx.commit();
		s.close();
	}

}
