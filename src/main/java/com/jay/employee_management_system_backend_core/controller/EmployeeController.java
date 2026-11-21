package com.jay.employee_management_system_backend_core.controller;

import com.jay.employee_management_system_backend_core.dto.CreateEmployeeRequest;
import com.jay.employee_management_system_backend_core.dto.EmployeeDto;
import com.jay.employee_management_system_backend_core.service.EmployeeService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
    private EmployeeService employeeService;

    @PostMapping
    public ResponseEntity<EmployeeDto> createEmployee(@Valid @RequestBody CreateEmployeeRequest createEmployeeRequest) {
        EmployeeDto savedEmployee = employeeService.createEmployee(createEmployeeRequest);

        return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<EmployeeDto> getEmployeeById(@PathVariable("id") Long employeeId) {
       EmployeeDto employee =  employeeService.getEmployeeById(employeeId);

       return ResponseEntity.ok(employee);
    }

    @GetMapping
    public ResponseEntity<List<EmployeeDto>> getAllEmployees() {
        List<EmployeeDto> employees = employeeService.getAllEmployees();

        return  ResponseEntity.ok(employees);
    }

    @PutMapping("{id}")
    public ResponseEntity<EmployeeDto> updateEmployee(@PathVariable("id") Long employeeId,
                                                      @RequestBody EmployeeDto request) {
        EmployeeDto employee = employeeService.updateEmployee(employeeId, request);
        return  ResponseEntity.ok(employee);
    }
}
