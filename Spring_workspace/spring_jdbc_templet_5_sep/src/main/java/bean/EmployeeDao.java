package bean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value = "employeeDao")
public class EmployeeDao {
@Autowired
  private DataSource dataSource;
  
  
  public DataSource getDatasource() {
	return dataSource;
	  
  }
  
  public void setDataSource(DataSource dataSource) {
	  this.dataSource=dataSource;
	  
  }

  public void createEmployee(Employee employee) throws SQLException {
	  Connection connection = dataSource.getConnection();
	  PreparedStatement ps=connection.prepareStatement("insert into employee(fname,lname,email) values(?,?,?)");
	  ps.setString(1,employee.getFname());
	  ps.setString(2, employee.getLname());
	  ps.setString(3, employee.getEmail());
	  ps.executeUpdate();  
  }

  public void getEmployeeById(int id) throws SQLException {
	  Employee emp=null;
	  Connection connection=dataSource.getConnection();
	  PreparedStatement ps=connection.prepareStatement("select * from employee where id=?");
	  ps.setInt(1, id);
	 ResultSet rs = ps.executeQuery();
	 while(rs.next()) {
	 System.out.println("first name :" +rs.getString(1)+" last name : "+rs.getString(2)+ " email : "+rs.getString(3));
	 }
	  
  }
}


