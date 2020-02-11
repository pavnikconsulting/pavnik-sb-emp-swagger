/**
 * 
 */
package com.pavnik.employee.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pavnik.employee.entity.User;

/**
 * @author pavni
 *
 */
public interface UserRepository extends JpaRepository<User, Integer>{
	Optional<User> findByUsername(String userName);
}
