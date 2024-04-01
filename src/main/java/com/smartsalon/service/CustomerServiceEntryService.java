package com.smartsalon.service;

import java.util.List;

import com.smartsalon.entity.CustomerEntryEntity;

public interface CustomerServiceEntryService {

	
	List<CustomerEntryEntity> getAllCustomerEntry();
	
	CustomerEntryEntity deleteEntry(int entryid);
}
