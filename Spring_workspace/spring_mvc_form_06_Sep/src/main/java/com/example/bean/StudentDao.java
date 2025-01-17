package com.example.bean;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.bean.*;
import com.example.bean.connection.*;


@Component(value="studentDao")
public class StudentDao {
	

		@Autowired
		private MyJdbcTemplate jdbc1;
		
		private String query;
		
		
		public MyJdbcTemplate getJdbc1() {
			return jdbc1;
		}
		public void setJdbc1(MyJdbcTemplate jdbc1) {
			this.jdbc1 = jdbc1;
		}
		public void createStudent(Student emp) {
			query="insert into student(fname,lname,email,country,lang,os) values(?,?,?,?,?,?)";
			Object[] obj= {emp.getFname(),emp.getLname(),emp.getEmail(),emp.getCountry(),emp.getLang(),emp.getOs()};
			jdbc1.update(query,obj);
			System.out.println("student added!!");
			
		}
		public List<Student> getAllStudent() {
			
		 return jdbc1.query("select * from student", new StudentRowMapper());
		}
		public void deleteEmployee(int id) {
			query="delete from employee where id=?";
			Object[] obj= {id};
			jdbc1.update(query,obj);
			System.out.println("Employee deleted!!");
		}
		
		public List<Student> searchStudent(String text,String type1){
			List<Student> li=new ArrayList<Student>();
			if(type1.equals("email")) {
				li = jdbc1.query("select * from student where email='"+text+"'",new StudentRowMapper());
			}else {
				li = jdbc1.query("select * from student where fname like '%"+text+"%'",new StudentRowMapper());
			}
			return li;
		}
	}	
		

