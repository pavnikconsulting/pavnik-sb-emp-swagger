package com.pavnik.employee.dto;

import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter 
public class LoginDto {
    @NotNull
    private String username;

    @NotNull
    private String password;
    
    /**
     * Default constructor
     */
    public LoginDto() {
    }
}
