package com.cg.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.dao.EmployeeRepository;
import com.cg.dao.EmployeeRepositoryImpl;
import com.cg.entities.Employee;


@Transactional
@Service

public class EmployeeServiceImpl implements EmployeeService {
	EmployeeRepository dao= new EmployeeRepositoryImpl();

	@Override
	public Employee save(Employee employee) {
		
		return dao.save(employee);
	}

	@Override
	public List<Employee> loadAll() {
		// TODO Auto-generated method stub
		return dao.loadAll();
	}

}
