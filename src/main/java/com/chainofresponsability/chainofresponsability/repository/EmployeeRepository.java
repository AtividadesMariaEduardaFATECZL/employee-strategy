package com.chainofresponsability.chainofresponsability.repository;

import com.chainofresponsability.chainofresponsability.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface EmployeeRepository  extends JpaRepository<Employee,Long> {
    Optional<Employee> findById(Long id);
    List<Employee> findAll();
}
