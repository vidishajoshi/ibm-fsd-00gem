package entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="instructor")
@Data
public class Instructor {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String fname;
	private String lname;
	private String email;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="detail_id")
	private InstructorDetail instructordetail;
	
	
	
	public Instructor() {
		super();
	}



	public Instructor(String fname, String lname, String email) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.email = email;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getFname() {
		return fname;
	}



	public void setFname(String fname) {
		this.fname = fname;
	}



	public String getLname() {
		return lname;
	}



	public void setLname(String lname) {
		this.lname = lname;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}






	public InstructorDetail getInstructor_detail() {
		return instructordetail;
	}



	public void setInstructor_detail(InstructorDetail instructor_detail) {
		this.instructordetail = instructor_detail;
	}



	@Override
	public String toString() {
		return "Instructor [id=" + id + ", fname=" + fname + ", lname=" + lname + ", email=" + email
				+ ", instructor_detail=" + instructordetail + "]";
	}




	
	
}
