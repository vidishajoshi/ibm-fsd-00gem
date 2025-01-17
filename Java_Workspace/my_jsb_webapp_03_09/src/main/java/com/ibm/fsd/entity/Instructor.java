package com.ibm.fsd.entity;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.ibm.fsd.entity.InstructorDetails;

import lombok.Data;

@Entity
@Table(name="instructor")
@Data
public class Instructor {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="id")
private int id;
@Column(name="fname")
private String firstName;
@Column(name="lname")
private String lastName;
@Column(name="email")
private String email;
@OneToOne(cascade=CascadeType.ALL)
@JoinColumn(name="detail_id")
private InstructorDetails detail_id;
public Instructor() {
	super();
}
public Instructor(String firstName, String lastName, String email) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.email = email;
	
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}



}
