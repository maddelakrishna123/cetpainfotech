package com.trangile.hb.spring_dao_jdbc_demo;


public class Employee {
	
	private int eid;
	private String ename;
	private String email;
	private String mobile;
	private String username;
	private String password;
	private double salary;
	
	private int age;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
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
