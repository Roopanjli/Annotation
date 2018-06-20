package com.test.annot;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import org.hibernate.cfg.Configuration;

import com.main.com.AnnotAssign;

public class AnnotAssignTest {

	public static void main(String[] args) {
Configuration conf= new Configuration().configure("hibernate.cfg.xml");
SessionFactory fact=conf.buildSessionFactory();
Session s =fact.openSession();
Transaction tx= s.beginTransaction();
AnnotAssign a=new AnnotAssign();

/*a.setName("Raju");
a.setPlace("hyd");
s.save(a);
AnnotAssign a1=new AnnotAssign();
a1.setId(1);
a1.setName("heena");
a1.setPlace("del");
s.save(a1); **/

a.setName("Vaibhav");
a.setPlace("US");
s.save(a);
tx.commit();
s.close();
fact.close();
	}

}
