package com.byteBusters.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.byteBusters.model.Vehicle;

public class VehicleDao
{
	private HibernateTemplate hibernateTemplate;

	/*=========================================================================*/
	
	@Transactional
	public long addVeh(Vehicle veh)
	{
		long i = (Long) hibernateTemplate.save(veh);
		return i;
	}
	
	public Vehicle getOneVeh(long id)
	{
		return hibernateTemplate.get(Vehicle.class, id);
	}
	
	public List<Vehicle> getAllVeh()
	{
		return hibernateTemplate.loadAll(Vehicle.class);
	}
	
	@Transactional
	public void updateVeh(Vehicle veh)
	{
		hibernateTemplate.update(veh);
	}
	
	@Transactional
	public void deleteVeh(Vehicle veh)
	{
		hibernateTemplate.delete(veh);
	}
	/*=========================================================================*/
	/*=========================================================================*/
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public VehicleDao(HibernateTemplate hibernateTemplate) {
		super();
		this.hibernateTemplate = hibernateTemplate;
	}

	public VehicleDao() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "VehicleDao [hibernateTemplate=" + hibernateTemplate + "]";
	}
	
	/*=========================================================================*/
	
}
