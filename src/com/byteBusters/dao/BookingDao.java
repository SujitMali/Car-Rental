package com.byteBusters.dao;

import java.io.Serializable;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.byteBusters.model.Booking;

public class BookingDao
{
	  private  HibernateTemplate hibernateTemplate;
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	public BookingDao(HibernateTemplate hibernateTemplate) {
		super();
		this.hibernateTemplate = hibernateTemplate;
	}
	
	public BookingDao() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "BookingDao [hibernateTemplate=" + hibernateTemplate + "]";
	}
	
	/*==============================================================================*/
	
	@Transactional
	public Long addBooking(Booking b)
	{
		return (Long) hibernateTemplate.save(b);
	}
	
	public List<Booking> getAllBooking()
	{
		return hibernateTemplate.loadAll(Booking.class);
	}
	
	public Booking getOneBooking(long id)
	{
		return hibernateTemplate.get(Booking.class, id);
	}
  
	@Transactional
	public void updateBooking(Booking b)
	{
		hibernateTemplate.update(b);
	}
	
	@Transactional
	public void deleteBooking(Booking b)
	{
		hibernateTemplate.delete(b);
	}
}
