package assignment1;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Employee> list = new ArrayList<Employee>();
	  	Scanner sc = new Scanner(System.in);
	  	System.out.println("Enter the number of Employees : ");
	  	int numb= sc.nextInt();
	  	for(int i=1;i<=numb;i++) {
	  		System.out.println("Enter employee "+i+" details : ");
	  		String name= sc.next();
	  	     String dept= sc.next();
	  		
	  	}
	  	
	
		
		
	}

}
