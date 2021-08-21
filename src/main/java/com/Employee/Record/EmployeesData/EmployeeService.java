package com.Employee.Record.EmployeesData;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	public Employee saveEmployee(Employee employee) {
		 return employeeRepository.save(employee);
		
	}
	public Optional<Employee> getEmployee(int id){
		return employeeRepository.findById(id);
	}
}
