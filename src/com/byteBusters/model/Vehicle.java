package com.byteBusters.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Vehicle 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long vehNo;
	private String vehName;
	private String vehType;
	private String vehModelYear;
	private String vehStartDate;
	private String vehEndDate;
	private long vehRenPrice;
	private String vehStatus;
	private long vehOwnerCont;
	
	public long getVehNo() {
		return vehNo;
	}
	public void setVehNo(long vehNo) {
		this.vehNo = vehNo;
	}
	public String getVehName() {
		return vehName;
	}
	public void setVehName(String vehName) {
		this.vehName = vehName;
	}
	public String getVehType() {
		return vehType;
	}
	public void setVehType(String vehType) {
		this.vehType = vehType;
	}
	public String getVehModelYear() {
		return vehModelYear;
	}
	public void setVehModelYear(String vehModelYear) {
		this.vehModelYear = vehModelYear;
	}
	public String getVehStartDate() {
		return vehStartDate;
	}
	public void setVehStartDate(String vehStartDate) {
		this.vehStartDate = vehStartDate;
	}
	public String getVehEndDate() {
		return vehEndDate;
	}
	public void setVehEndDate(String vehEndDate) {
		this.vehEndDate = vehEndDate;
	}
	public long getVehRenPrice() {
		return vehRenPrice;
	}
	public void setVehRenPrice(long vehRenPrice) {
		this.vehRenPrice = vehRenPrice;
	}
	public String getVehStatus() {
		return vehStatus;
	}
	public void setVehStatus(String vehStatus) {
		this.vehStatus = vehStatus;
	}
	public long getVehOwnerCont() {
		return vehOwnerCont;
	}
	public void setVehOwnerCont(long vehOwnerCont) {
		this.vehOwnerCont = vehOwnerCont;
	}
	public Vehicle(long vehNo, String vehName, String vehType, String vehModelYear, String vehStartDate,
			String vehEndDate, long vehRenPrice, String vehStatus, long vehOwnerCont) {
		super();
		this.vehNo = vehNo;
		this.vehName = vehName;
		this.vehType = vehType;
		this.vehModelYear = vehModelYear;
		this.vehStartDate = vehStartDate;
		this.vehEndDate = vehEndDate;
		this.vehRenPrice = vehRenPrice;
		this.vehStatus = vehStatus;
		this.vehOwnerCont = vehOwnerCont;
	}
	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Vehicle [vehNo=" + vehNo + ", vehName=" + vehName + ", vehType=" + vehType + ", vehModelYear="
				+ vehModelYear + ", vehStartDate=" + vehStartDate + ", vehEndDate=" + vehEndDate + ", vehRenPrice="
				+ vehRenPrice + ", vehStatus=" + vehStatus + ", vehOwnerCont=" + vehOwnerCont + "]";
	}
	
	
}