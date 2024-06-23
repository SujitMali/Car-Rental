package com.byteBusters.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.byteBusters.model.Owner;


public class OwnerDao 
{

	HibernateTemplate hibernateTemplate;
	
	/*========================================================================*/
	
	@Transactional
	public Long addOwner(Owner owner)
	{
		long i = (Long) hibernateTemplate.save(owner);
		return i;
	}
	
	public Owner getOneOwner(long cont)
	{
		return hibernateTemplate.get(Owner.class, cont);
	}
	
	public List<Owner> getAllOwner()
	{
		List<Owner> owners = hibernateTemplate.loadAll(Owner.class);
		return owners;
	}
	
	@Transactional
	public void deleteOwner(Owner owner)
	{
		hibernateTemplate.delete(owner);
	}
	
	@Transactional
	public void updateOwner(Owner owner)
	{
		hibernateTemplate.update(owner);
	}
	/*========================================================================*/

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public OwnerDao(HibernateTemplate hibernateTemplate) {
		super();
		this.hibernateTemplate = hibernateTemplate;
	}

	public OwnerDao() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "OwnerDao [hibernateTemplate=" + hibernateTemplate + "]";
	}
	/*========================================================================*/
}
