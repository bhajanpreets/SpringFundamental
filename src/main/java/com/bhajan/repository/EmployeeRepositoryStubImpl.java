package com.bhajan.repository;

import java.util.ArrayList;
import java.util.List;

import com.bhajan.model.Employee;

public class EmployeeRepositoryStubImpl implements EmployeeRepositoryStub {

	@Override
	public List<Employee> findAll() {
		List<Employee> employees = new ArrayList<>();
		Employee e = new Employee();
		e.setFirstName("Bhajanpreet");
		e.setLastName("Singh");
		employees.add(e);
		return employees;
	}

}
