package com.byteBusters.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
@Component
public class Owner 
{
	@Id
	private long ownerCont;
	private String ownerName;
	private String ownerPass;
	private String ownerStatus;
	private String ownerAge;
	private double lat;
	private double lng;
	public long getOwnerCont() {
		return ownerCont;
	}
	public void setOwnerCont(long ownerCont) {
		this.ownerCont = ownerCont;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getOwnerPass() {
		return ownerPass;
	}
	public void setOwnerPass(String ownerPass) {
		this.ownerPass = ownerPass;
	}
	
	public String getOwnerStatus() {
		return ownerStatus;
	}
	public void setOwnerStatus(String ownerStatus) {
		this.ownerStatus = ownerStatus;
	}
	public String getOwnerAge() {
		return ownerAge;
	}
	public void setOwnerAge(String ownerAge) {
		this.ownerAge = ownerAge;
	}
	public double getLat() {
		return lat;
	}
	public void setLat(double lat) {
		this.lat = lat;
	}
	public double getLng() {
		return lng;
	}
	public void setLng(double lng) {
		this.lng = lng;
	}
	public Owner(long ownerCont, String ownerName, String ownerPass,  String ownerStatus,
			String ownerAge, double lat, double lng) {
		super();
		this.ownerCont = ownerCont;
		this.ownerName = ownerName;
		this.ownerPass = ownerPass;
		this.ownerStatus = ownerStatus;
		this.ownerAge = ownerAge;
		this.lat = lat;
		this.lng = lng;
	}
	public Owner() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Owner [ownerCont=" + ownerCont + ", ownerName=" + ownerName + ", ownerPass=" + ownerPass +", ownerStatus=" + ownerStatus + ", ownerAge=" + ownerAge + ", lat=" + lat + ", lng=" + lng
				+ "]";
	}
	
	
	
	
	
}
