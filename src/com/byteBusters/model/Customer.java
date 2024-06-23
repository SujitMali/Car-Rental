package com.byteBusters.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Customer 
{
	@Id
	private long custCont;
	private String custName;
	private String custPass;
	private String custLoc;
	private String custAge;
	public long getCustCont() {
		return custCont;
	}
	public void setCustCont(long custCont) {
		this.custCont = custCont;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustPass() {
		return custPass;
	}
	public void setCustPass(String custPass) {
		this.custPass = custPass;
	}
	public String getCustLoc() {
		return custLoc;
	}
	public void setCustLoc(String custLoc) {
		this.custLoc = custLoc;
	}
	public String getCustAge() {
		return custAge;
	}
	public void setCustAge(String custAge) {
		this.custAge = custAge;
	}
	public Customer(long custCont, String custName, String custPass, String custLoc, String custAge) {
		super();
		this.custCont = custCont;
		this.custName = custName;
		this.custPass = custPass;
		this.custLoc = custLoc;
		this.custAge = custAge;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Customer [custCont=" + custCont + ", custName=" + custName + ", custPass=" + custPass + ", custLoc="
				+ custLoc + ", custAge=" + custAge + "]";
	}
	
	
}
