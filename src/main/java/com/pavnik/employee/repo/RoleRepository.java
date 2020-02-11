package com.pavnik.employee.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pavnik.employee.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByRoleName(String name);
}
