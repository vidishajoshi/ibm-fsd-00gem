package assignment1;
import java.sql.Date;

public class Employee implements Comparable{
	
	private static int id=0;
	private String name;
	private String department;
	private Date dateOfJoin;
	private int age;
	private int salary;
	
	
	public Employee(String name,String department,int age,int salary) {
		super();
		
		this.id=++id;
		this.name=name;
		this.department=department;
		//this.dateOfJoin=dateOfJoin;
		this.age=age;
		this.salary=salary;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int idcount) {
		//idcount+=1;
		this.id=idcount;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Date getDateOfJoin() {
		return dateOfJoin;
	}
	public void setDateOfJoin(Date dateOfJoin) {
		this.dateOfJoin = dateOfJoin;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public int compareTo(Object ar){
		// TODO Auto-generated method stub
		Employee e=(Employee)ar;
		if(this.getSalary()==e.getSalary()) {
			return 0;
		}
		else if(this.getSalary() > e.getSalary()) {
			return 1;
		}else {
			return -1;
		}
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", dateOfJoin=" + dateOfJoin
				+ ", age=" + age + ", salary=" + salary + "]";
	}
	
	
	
	
	
}
