package com.greatlearning;

public class Employee {
	private int empid;
	private String empname;
	private String empadddress;	
	
	public Employee() 
	{

	}
	public Employee(int empid, String empname, String empadddress) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empadddress = empadddress;
	}
	
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmpadddress() {
		return empadddress;
	}
	public void setEmpadddress(String empadddress) {
		this.empadddress = empadddress;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", empadddress=" + empadddress + "]";
	}
	
	

}
