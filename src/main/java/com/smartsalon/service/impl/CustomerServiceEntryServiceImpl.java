package com.smartsalon.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.smartsalon.entity.CustomerEntryEntity;
import com.smartsalon.repository.CustomerServiceEntryRepository;
import com.smartsalon.service.CustomerServiceEntryService;

@Service
public class CustomerServiceEntryServiceImpl implements CustomerServiceEntryService{

	@Autowired
	public CustomerServiceEntryRepository customerServiceEntryRepository;
	
	@Override
	public List<CustomerEntryEntity> getAllCustomerEntry() {
		
		return customerServiceEntryRepository.findAll();
	}

	@Override
	public CustomerEntryEntity deleteEntry(int entryid) {
		customerServiceEntryRepository.deleteById(entryid);
		return null;
	}

}
