package com.byteBusters.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
@Component
public class AddEmp
{
	@Id
	private long empCont;
	private String empName;
	private String empStatus;
	
	public long getEmpCont() {
		return empCont;
	}
	public void setEmpCont(long empCont) {
		this.empCont = empCont;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpStatus() {
		return empStatus;
	}
	public void setEmpStatus(String empStatus) {
		this.empStatus = empStatus;
	}
	public AddEmp(long empCont, String empName, String empStatus) {
		super();
		this.empCont = empCont;
		this.empName = empName;
		this.empStatus = empStatus;
	}
	public AddEmp() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "AddEmp [empCont=" + empCont + ", empName=" + empName + ", empStatus=" + empStatus + "]";
	}
	
	
}
