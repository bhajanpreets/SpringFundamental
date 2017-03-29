package com.bhajan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhajan.model.Employee;
import com.bhajan.repository.EmployeeRepositoryStub;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {

	//@Autowired
	private EmployeeRepositoryStub employeeRepository;

	//@Autowired
	public EmployeeServiceImpl(EmployeeRepositoryStub employeeRepository){
		this.employeeRepository = employeeRepository;
	}
	
	//@Autowired
	public void setEmployeeRepository(EmployeeRepositoryStub employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	@Override
	public List<Employee> findAll() {
		return employeeRepository.findAll();
	}
	// public EmployeeRepositoryStub getEmployeeRepository() {
	// return employeeRepository;
	// }
	// public void setEmployeeRepository(EmployeeRepositoryStub
	// employeeRepository) {
	// this.employeeRepository = employeeRepository;
	// }

}
