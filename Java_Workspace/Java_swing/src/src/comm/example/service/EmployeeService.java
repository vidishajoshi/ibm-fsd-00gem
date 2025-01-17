package src.comm.example.service;

import java.util.List;

import src.comm.example.model.Employee;

public interface EmployeeService {
	public void createEmployee(Employee employee);
	public List<Employee> getAllEmployees();
	public Employee getEmployeeById(int id);
	public void deletebyid(int id);
	public void getMetadata();
}
