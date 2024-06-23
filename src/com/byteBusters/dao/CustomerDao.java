package com.byteBusters.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.byteBusters.model.Customer;

public class CustomerDao 
{
	HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public CustomerDao(HibernateTemplate hibernateTemplate) {
		super();
		this.hibernateTemplate = hibernateTemplate;
	}

	public CustomerDao() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "CustomerDao [hibernateTemplate=" + hibernateTemplate + "]";
	}
	
	/*====================================================================*/
	@Transactional
	public long addCust(Customer cust)
	{
		long i = (Long) hibernateTemplate.save(cust);
		return i;
	}
	
	public Customer getOneCust(long cont)
	{
		return hibernateTemplate.get(Customer.class,cont);
	}
	
	public List<Customer> getAllCust()
	{
		return hibernateTemplate.loadAll(Customer.class);
	}
	/*====================================================================*/
}
