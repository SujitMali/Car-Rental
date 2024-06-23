package com.byteBusters.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Booking
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private long custCont;
	private long ownerCont;
	private String custName;
	private double custlat;
	private double custlng;
	private long vehNo;
	private String vehName;
	private String vehType;
	private String date;
	private long empCont;
	private String bookStatus;
	private String status;
	private String rating;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getCustCont() {
		return custCont;
	}
	public void setCustCont(long custCont) {
		this.custCont = custCont;
	}
	public long getOwnerCont() {
		return ownerCont;
	}
	public void setOwnerCont(long ownerCont) {
		this.ownerCont = ownerCont;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public double getCustlat() {
		return custlat;
	}
	public void setCustlat(double custlat) {
		this.custlat = custlat;
	}
	public double getCustlng() {
		return custlng;
	}
	public void setCustlng(double custlng) {
		this.custlng = custlng;
	}
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
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public long getEmpCont() {
		return empCont;
	}
	public void setEmpCont(long empCont) {
		this.empCont = empCont;
	}
	public String getBookStatus() {
		return bookStatus;
	}
	public void setBookStatus(String bookStatus) {
		this.bookStatus = bookStatus;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public Booking(long id, long custCont, long ownerCont, String custName, double custlat, double custlng, long vehNo,
			String vehName, String vehType, String date, long empCont, String bookStatus, String status,
			String rating) {
		super();
		this.id = id;
		this.custCont = custCont;
		this.ownerCont = ownerCont;
		this.custName = custName;
		this.custlat = custlat;
		this.custlng = custlng;
		this.vehNo = vehNo;
		this.vehName = vehName;
		this.vehType = vehType;
		this.date = date;
		this.empCont = empCont;
		this.bookStatus = bookStatus;
		this.status = status;
		this.rating = rating;
	}
	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Booking [id=" + id + ", custCont=" + custCont + ", ownerCont=" + ownerCont + ", custName=" + custName
				+ ", custlat=" + custlat + ", custlng=" + custlng + ", vehNo=" + vehNo + ", vehName=" + vehName
				+ ", vehType=" + vehType + ", date=" + date + ", empCont=" + empCont + ", bookStatus=" + bookStatus
				+ ", status=" + status + ", rating=" + rating + "]";
	}
	
	
	
	
	
	
}
