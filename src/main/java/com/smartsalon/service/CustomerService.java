package com.smartsalon.service;

import java.util.List;

import com.smartsalon.entity.CustomerEntity;

public interface CustomerService {

	List<CustomerEntity> getAllCustomer();
	
	CustomerEntity saveCustomer(CustomerEntity customerEntity);
//	
	CustomerEntity getCustomerById(int customerId);
//	
	CustomerEntity deleteCustomerById(int customerId);
}
