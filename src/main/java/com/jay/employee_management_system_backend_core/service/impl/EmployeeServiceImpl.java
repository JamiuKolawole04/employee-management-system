package com.jay.employee_management_system_backend_core.service.impl;

import com.jay.employee_management_system_backend_core.dto.CreateEmployeeRequest;
import com.jay.employee_management_system_backend_core.dto.EmployeeDto;
import com.jay.employee_management_system_backend_core.entity.Employee;
import com.jay.employee_management_system_backend_core.mapper.EmployeeMapper;
import com.jay.employee_management_system_backend_core.repository.EmployeeRepository;
import com.jay.employee_management_system_backend_core.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeRepository employeeRepository;

    @Override
    public EmployeeDto createEmployee(CreateEmployeeRequest createEmployeeRequest) {
        Employee employee = EmployeeMapper.mapToEmployee(createEmployeeRequest);
        Employee savedEmployee = employeeRepository.save(employee);

        return EmployeeMapper.mapToEmployeeDto(savedEmployee);
    }
}
