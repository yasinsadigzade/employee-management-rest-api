package com.company.employeemanagementrestapi.data.dto.request;

import lombok.Data;

@Data
public class RegisterRequestDto {

    private String username;

    private String password;

    private String email;
}
