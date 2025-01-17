package crud_operation;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entity.Instructor;
import entity.InstructorDetail;

public class GetDetails {
public static void main(String args[]) {
	SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class)
            .addAnnotatedClass(InstructorDetail.class).buildSessionFactory();

Session session=factory.openSession();

Scanner si=new Scanner(System.in);
System.out.println("Enter the id : ");
int id=si.nextInt();
session.getTransaction().begin();
Instructor ind=session.get(Instructor.class, id);

session.getTransaction().commit();
System.out.println(ind.getInstructor_detail().toString());

System.out.println("Get Details done!!");
}
}
