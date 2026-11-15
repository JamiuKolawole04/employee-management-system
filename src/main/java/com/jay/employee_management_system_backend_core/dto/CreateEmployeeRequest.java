package com.jay.employee_management_system_backend_core.dto;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateEmployeeRequest {

    @NotBlank(message = "First name is required.")
    @Size(max = 50 , message = "First name must not be more than 50 characters.")
    private String firstName;

    @NotBlank(message = "Last name is required.")
    @Size(max = 50 , message = "Last name must not be more than 50 characters.")
    private String lastName;

    @NotBlank(message = "Email is required.")
    @Email(message = "Invalid email")
    @Size(max = 255, message = "Email must not be more than 255 characters.")
    private String email;
}
