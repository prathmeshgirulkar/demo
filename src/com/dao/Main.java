package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Student;

public class Main {
	public static void main(String[] args) {
		Configuration cf = new Configuration();
		cf.configure();

		cf.addAnnotatedClass(Student.class);
		SessionFactory bs = cf.buildSessionFactory();
		Session os = bs.openSession();// session ha 1 session ahe yechat apan karnar ahe zalyvr close karacha
		Transaction bt = os.beginTransaction();// update delete ani insert sathi lagte, ani kam zalyvrr commmit karacha
		Student s1 = new Student();

		s1.setId(2);
		s1.setName("rahukl");
		s1.setAddress("mumbai");
//	   os.save(s);
		System.out.println("sucess");
		os.update(s1);
		/// os.get(1, id);
		bt.commit();
		os.close();

	}
}
