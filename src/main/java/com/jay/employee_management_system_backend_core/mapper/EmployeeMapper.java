package com.jay.employee_management_system_backend_core.mapper;

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

    public  static  Employee mapToEmployee(EmployeeDto employeeDto) {
        return  new Employee(
                employeeDto.getId(),
                employeeDto.getFirstName(),
                employeeDto.getLastName(),
                employeeDto.getEmail()
        );
    }
}
