package com.jay.employee_management_system_backend_core.mapper;

import com.jay.employee_management_system_backend_core.dto.CreateEmployeeRequest;
import com.jay.employee_management_system_backend_core.dto.EmployeeDto;
import com.jay.employee_management_system_backend_core.entity.Employee;

public class EmployeeMapper {
    public static EmployeeDto mapToEmployeeDto(Employee employee) {
        return new EmployeeDto(
                employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmail()
        );
    }

    public  static  Employee mapToEmployee(CreateEmployeeRequest createEmployeeRequest) {

        Employee employee = new Employee();
        employee.setFirstName(createEmployeeRequest.getFirstName());
        employee.setLastName(createEmployeeRequest.getLastName());
        employee.setEmail(createEmployeeRequest.getEmail());

        return  employee;
    }
}
