package com.ninad.project.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee_Info")
public class EmployeeEntity {
@Id
@Column(name="Emp_Id")
	private int empid;
@Column(name="Emp_Name")
	private String empname;
@Column(name="Emp_Password")
	private String password;
@Column(name="is_Active")
	private boolean isAvtive;
	public EmployeeEntity(int empid, String empname, String password, boolean isAvtive) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.password = password;
		this.isAvtive = isAvtive;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isAvtive() {
		return isAvtive;
	}
	public void setAvtive(boolean isAvtive) {
		this.isAvtive = isAvtive;
	}
	public EmployeeEntity() {
		super();
	}
	@Override
	public String toString() {
		return "EmployeeEntity [empid=" + empid + ", empname=" + empname + ", password=" + password + ", isAvtive="
				+ isAvtive + "]";
	}
	
	

}
