package src.comm.example.service;

import java.sql.SQLException;
import java.util.List;

import src.comm.example.dao.EmployeeDao;
import src.comm.example.dao.EmployeeDaoImpl;
import src.comm.example.model.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDao dao = null;

	public EmployeeServiceImpl() throws SQLException {
		super();
		dao = new EmployeeDaoImpl();
	}

	@Override
	public void createEmployee(Employee employee) {

		dao.createEmployee(employee);
	}

	@Override
	public List<Employee> getAllEmployees() {

		return dao.getAllEmployees();
	}

	@Override
	public Employee getEmployeeById(int id) {

		return null;
	}
	public void deletebyid(int id) {
		dao.deletebyid(id);
	}
	
	public void getMetadata()
	{
		dao.getConnectionInfo();
	}

}
