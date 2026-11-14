package com.jay.employee_management_system_backend_core.repository;

import com.jay.employee_management_system_backend_core.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
