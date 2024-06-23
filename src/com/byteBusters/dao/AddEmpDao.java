package com.byteBusters.dao;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.byteBusters.model.AddEmp;


public class AddEmpDao 
{

	HibernateTemplate hibernateTemplate;
	
	/*========================================================================*/
	@Transactional
	public Long addEmp(AddEmp emp)
	{
		Long i = (Long) hibernateTemplate.save(emp);
		return i;
	}
	
	/*========================================================================*/

	
	/*========================================================================*/
	
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public AddEmpDao(HibernateTemplate hibernateTemplate) {
		super();
		this.hibernateTemplate = hibernateTemplate;
	}

	public AddEmpDao() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "AddEmpDao [hibernateTemplate=" + hibernateTemplate + "]";
	}
		
	
	/*========================================================================*/
}
