package com.smartsalon.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartsalon.entity.EmployeeEntity;
import com.smartsalon.repository.EmployeeRepository;
import com.smartsalon.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	public EmployeeRepository employeeRepository;
	
	@Override
	public List<EmployeeEntity> getAllEmployee() {
		return employeeRepository.findAll();
	}

	@Override
	public EmployeeEntity saveEmployee(EmployeeEntity employeeEntity) {
		employeeRepository.save(employeeEntity);
		return null;
	}

	@Override
	public EmployeeEntity deleteEmployeeById(int employeeId) {
		employeeRepository.deleteById(employeeId);
		return null;
	}

	@Override
	public EmployeeEntity getEmployeeById(int employeeId) {
		
		return employeeRepository.findById(employeeId).get();
	}
	
	
}
