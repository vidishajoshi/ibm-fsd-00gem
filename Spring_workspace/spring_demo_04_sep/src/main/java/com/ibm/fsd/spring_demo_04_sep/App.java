package com.ibm.fsd.spring_demo_04_sep;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Badminton;
import beans.BasketballCoach;
import beans.Coach;
import beans.CricketCoach;
import beans.Employee;
import beans.Student;
import beans.SwimCoach;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
     try {
    	 ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("componentContext.xml");
    	 //Coach c=context.getBean("Thebad",Badminton.class);
    	 //System.out.println(c.getDailyWorlkout());
    	 //Coach myCoach=context.getBean("theC",CricketCoach.class);
    	//System.out.println(myCoach.toString());
    	// Coach mycoach1=context.getBean("bCoach",BasketballCoach.class);
    	// System.out.println(mycoach1.getDailyWorlkout());
    	//Student emp =context.getBean("theEmp",Student.class);
    	 //System.out.println(emp.toString());
    	 Coach c1=(Coach) context.getBean("SwimCoach",SwimCoach.class);
    	 System.out.println(c1.getDailyWorlkout()+"\n"+c1.getDailyFortune());
    	 context.close();
     }catch(Exception e) {
    	 
     }
    }
}
