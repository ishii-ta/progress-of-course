package org.gal.issuetracking.repository;

import org.gal.issuetracking.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}