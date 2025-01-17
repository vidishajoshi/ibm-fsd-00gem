package comm.example.dao;

import java.util.List;

import comm.example.model.Employee;

public interface EmployeeDao {
	public void createEmployee(Employee employee);
	public List<Employee> getAllEmployees();
	public void deleteEmployee(int id);
	public void editEmployee(Employee employee);
	public List<Employee> getEmployeeById(int id);
}

