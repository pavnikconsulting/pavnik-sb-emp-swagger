/**
 * 
 */
package com.pavnik.employee.repo;

import org.springframework.data.repository.CrudRepository;

import com.pavnik.employee.entity.Employee;

/**
 * @author pavni
 *
 */
public interface EmployeeRepository extends CrudRepository<Employee, Long>{

}
