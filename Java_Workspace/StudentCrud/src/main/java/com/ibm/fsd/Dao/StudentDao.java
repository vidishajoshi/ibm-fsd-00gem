package com.ibm.fsd.Dao;

import java.util.List;

import com.ibm.fsd.Model.Student;



public interface StudentDao {
	
	public void createEmployee(Student student);
	public List<Student> getAllEmployees();
	public Student getEmployeeById(int id);
	public void deleteEmployee(int id);
	

}
