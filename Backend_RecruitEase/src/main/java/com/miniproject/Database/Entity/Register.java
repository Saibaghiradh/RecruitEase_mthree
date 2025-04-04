package com.miniproject.Database.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Register {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "fullname")
	private String fullname;
	@Column(name = "uname")
	private String uname;
	@Column(name = "email")
	private String email;
	@Column(name = "mobile")
	private String mobile;
	@Column(name = "password")
	private String password;
	@Column(name = "gender")
	private String gender;
	
	  public Register() {}
	  
	public Register(long id, String fullname, String uname, String email, String mobile, String password,
			String gender) {
		super();
		this.id = id;
		this.fullname = fullname;
		this.uname = uname;
		this.email = email;
		this.mobile = mobile;
		this.password = password;
		this.gender = gender;
	}
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}


	@Override
	public String toString() {
		return "Registration [id=" + id + ", fullname=" + fullname + ", uname=" + uname + ", email=" + email
				+ ", mobile=" + mobile + ", password=" + password + ", gender=" + gender + "]";
	}
	

}
