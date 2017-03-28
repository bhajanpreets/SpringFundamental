package com.bhajan.service;

import java.util.List;

import com.bhajan.model.Employee;
import com.bhajan.repository.EmployeeRepositoryStub;
import com.bhajan.repository.EmployeeRepositoryStubImpl;

public class EmployeeServiceImpl implements EmployeeService {
	
	private EmployeeRepositoryStub employeeRepository;
	/* (non-Javadoc)
	 * @see com.bhajan.service.EmployeeService#findAll()
	 */
	@Override
	public List<Employee> findAll() {
		return employeeRepository.findAll();
	}
	public EmployeeRepositoryStub getEmployeeRepository() {
		return employeeRepository;
	}
	public void setEmployeeRepository(EmployeeRepositoryStub employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

}
