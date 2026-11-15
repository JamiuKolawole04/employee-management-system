package com.jay.employee_management_system_backend_core.controller;

import com.jay.employee_management_system_backend_core.dto.CreateEmployeeRequest;
import com.jay.employee_management_system_backend_core.dto.EmployeeDto;
import com.jay.employee_management_system_backend_core.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
    private EmployeeService employeeService;

    @PostMapping
    public ResponseEntity<EmployeeDto> createEmployee(@RequestBody CreateEmployeeRequest createEmployeeRequest) {
        EmployeeDto savedEmployee = employeeService.createEmployee(createEmployeeRequest);

        return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
    }
}
