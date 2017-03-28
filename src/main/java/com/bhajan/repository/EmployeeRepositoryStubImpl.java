package com.bhajan.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.bhajan.model.Employee;

@Repository("employeeRepository")
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
