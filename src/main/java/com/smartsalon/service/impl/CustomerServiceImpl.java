package com.smartsalon.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartsalon.entity.CustomerEntity;
import com.smartsalon.repository.CustomerRepository;
import com.smartsalon.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	public CustomerRepository customerRepository;

	@Override
	public List<CustomerEntity> getAllCustomer() {
		
		return customerRepository.findAll();
	}

	@Override
	public CustomerEntity saveCustomer(CustomerEntity customerEntity) {
		
		return customerRepository.save(customerEntity);
	}

	@Override
	public CustomerEntity deleteCustomerById(int customerId) {
		customerRepository.deleteById(customerId);
		return null;
	}

	@Override
	public CustomerEntity getCustomerById(int customerId) {
		
		return customerRepository.findById(customerId).get();
	}

}
