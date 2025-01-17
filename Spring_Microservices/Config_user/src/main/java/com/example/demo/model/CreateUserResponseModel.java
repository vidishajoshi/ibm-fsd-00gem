package com.example.demo.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CreateUserResponseModel {

	private String uId;
	private String fname;
	private String lname;
	private String email;
	public CreateUserResponseModel(String uId, String fname, String lname, String email) {
		super();
		this.uId = uId;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
	}
	public CreateUserResponseModel() {
		super();
	}
	
	
	public String getuId() {
		return uId;
	}
	public void setuId(String uId) {
		this.uId = uId;
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
	
	
	
}
