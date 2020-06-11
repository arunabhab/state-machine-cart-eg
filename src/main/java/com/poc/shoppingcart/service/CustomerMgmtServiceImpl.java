package com.poc.shoppingcart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.poc.shoppingcart.entity.Customer;
import com.poc.shoppingcart.repository.CustomerRepository;


/**
 * @author ArunabhaB
 *
 */
@Component
@Service
public class CustomerMgmtServiceImpl implements CustomerMgmtService{

	@Autowired
	CustomerRepository custRepo;
	
	@Override
	public List<Customer> retrieveData() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void putData(Customer cust) {
		custRepo.save(cust);
		
	}

	

}
