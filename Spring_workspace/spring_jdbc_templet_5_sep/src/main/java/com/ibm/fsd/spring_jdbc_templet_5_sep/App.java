package com.ibm.fsd.spring_jdbc_templet_5_sep;

import java.sql.SQLException;
import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.Employee;
import bean.EmployeeDao;
import bean.EmployeeService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException
    {
    	 ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
         EmployeeService dao=context.getBean("employeeService",EmployeeService.class);
         Employee emp = context.getBean("employee", Employee.class);
         Scanner sc=new Scanner(System.in);
         System.out.println("Welcome to the Employee Crud with Jdbc Template !!");
         System.out.println("1. Create new Employee");
         System.out.println("2. Get employee by id");
         System.out.println("3. Delete an employee");
         System.out.println("Enter your choice : ");
         int choice = sc.nextInt();
         switch(choice) {
         case 1:{
                  dao.createEmployee(emp);
                  break;
               }
         case 2: {
        	 System.out.println("enter the id :");
        	 int id=sc.nextInt();
             dao.getEmployeeById(id);
             
         }
         case 3:
         {
        	 System.out.println("enter the id :");
        	 int id=sc.nextInt();
             dao.deleteEmployee(id);
             break;
         }
         default:{
        	 System.out.println("Enter correct choice!!");
         }
         }
        
        
         
    }
}
