/**
 * 
 */
package com.pavnik.employee.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pavnik.employee.entity.Employee;
import com.pavnik.employee.repo.EmployeeRepository;

/**
 * @author pavni
 *
 */
@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	public EmployeeService( EmployeeRepository employeeRepository ) {
		this.employeeRepository = employeeRepository;
	}
	
	public List<Employee> get(){
		List<Employee> employees = new ArrayList<Employee>();
		employeeRepository.findAll().forEach(employees::add);
		return employees;
	}
	
	public Employee get(long id) {
		return employeeRepository.findById(id).orElse(new Employee());
	}
	
	public Employee save( Employee employee ) {
		return employeeRepository.save(employee);
	}
}
