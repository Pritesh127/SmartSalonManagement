package com.smartsalon.service;

import java.util.List;

import com.smartsalon.entity.EmployeeEntity;

public interface EmployeeService {
	
	List<EmployeeEntity> getAllEmployee();
	
	EmployeeEntity saveEmployee(EmployeeEntity employeeEntity);
	
	EmployeeEntity deleteEmployeeById(int employeeId);
	
	EmployeeEntity getEmployeeById(int employeeid);
}
