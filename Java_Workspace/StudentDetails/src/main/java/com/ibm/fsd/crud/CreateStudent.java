package com.ibm.fsd.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ibm.fsd.model.Student;

public class CreateStudent {
	public static void main(String args[]) {
SessionFactory factory = null;
			
			try {

				Session session = factory.openSession();
				Student student = new Student(1,"Paul", "Doe", "paul@luv2code.com");
				session.beginTransaction();
				session.save(student);
				session.getTransaction().commit();
				System.out.println("student added!");
			}
			catch(Exception e) {
				e.printStackTrace();
			}
factory.close();
	}
}









