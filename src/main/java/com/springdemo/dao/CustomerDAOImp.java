package com.springdemo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springdemo.entity.Customer;


@Repository // it's always applied for DOA imp
public class CustomerDAOImp implements CustomerDAO {

	// need to inject session factory
	@Autowired
	private SessionFactory sessionFactory;
	
	
	
	
	@Override
	 
	public List<Customer> getCustomers() {
		
		// get the current hibernate session
			Session currentSession = sessionFactory.getCurrentSession();
			
		// create the query
			Query<Customer> query = currentSession.createQuery("from Customer order by lastName", Customer.class);
			
		// execute the query and get result set
			List<Customer> customers = query.getResultList();
		
		// return the result
		return customers;
	}




	@Override
	public void saveCustomer(Customer theCustomer) {
		//get current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		//save the customer
		currentSession.save(theCustomer);
	}

	
	
	
	
	
	
	
	
}
