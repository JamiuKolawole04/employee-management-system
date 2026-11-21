package com.jay.employee_management_system_backend_core.service;

import com.jay.employee_management_system_backend_core.dto.CreateEmployeeRequest;
import com.jay.employee_management_system_backend_core.dto.EmployeeDto;

public interface EmployeeService {
    EmployeeDto createEmployee(CreateEmployeeRequest createEmployeeRequest);

    EmployeeDto getEmployeeById(Long employeeId);
}
