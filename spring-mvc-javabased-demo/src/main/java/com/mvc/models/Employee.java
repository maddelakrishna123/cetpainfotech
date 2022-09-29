package com.mvc.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="emp_mvc_tbl1")
@XmlRootElement
public class Employee {
	@Id
	@SequenceGenerator(name="empSeq",initialValue = 10000,allocationSize = 1,sequenceName = "EMP_SEQ")
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "empSeq")
	private int eid;
	@Pattern(regexp = "^[a-zA-Z0-9]{5,15]$",message = "Not Valid")
	private String ename;
	@Column(unique = true)
	private String email;
	private String mobile;
	@Column(unique = true)
	private String username;
	private String password;
	
	private double salary;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
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
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employee(int eid, String ename, String email, String mobile, String username, String password,
			double salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.email = email;
		this.mobile = mobile;
		this.username = username;
		this.password = password;
		this.salary = salary;
	}
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", email=" + email + ", mobile=" + mobile + ", username="
				+ username + ", password=" + password + ", salary=" + salary + "]";
	}
	
	
	

}
