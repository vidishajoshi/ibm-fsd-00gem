package bean;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmployeeRowMapper implements RowMapper {

	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee employee=new Employee();
		employee.setFname(rs.getString(1));
		employee.setLname(rs.getString(2));
		employee.setEmail(rs.getString(3));
		return employee;
		
	}

}
