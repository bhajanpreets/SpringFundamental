package com.bhajan.service;

import java.util.List;

import com.bhajan.model.Employee;
import com.bhajan.repositoty.EmployeeRepositoryStub;
import com.bhajan.repositoty.EmployeeRepositoryStubImpl;

public class EmployeeServiceImpl implements EmployeeService {
	
	private EmployeeRepositoryStub employeeRepository = new EmployeeRepositoryStubImpl();
	/* (non-Javadoc)
	 * @see com.bhajan.service.EmployeeService#findAll()
	 */
	@Override
	public List<Employee> findAll() {
		return employeeRepository.findAll();
	}

}
