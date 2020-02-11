/**
 * 
 */
package com.pavnik.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pavnik.employee.entity.Employee;
import com.pavnik.employee.service.EmployeeService;

/**
 * @author pavni
 *
 */
@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/employees")
    public List<Employee> getEmployees() 
    {
        return employeeService.get();
    }
	@GetMapping("/employees/{id}")
    public Employee getEmployee(@PathVariable("id") final String id) 
    {
        return employeeService.get(Long.valueOf(id));
    }
	@PostMapping("/employees")
	public Employee createEmployee(@RequestBody Employee employee) {
		System.out.println(employee);
		return employeeService.save(employee);
	}

}
