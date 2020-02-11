package com.pavnik.employee.dto;

import java.util.List;

import javax.validation.constraints.NotNull;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @EqualsAndHashCode
public class UserDto {

    @NotNull
    private String name;

    @NotNull
    private Long id;
    
    @NotNull
    private List<String> roles;

    @NotNull
    private String token;

}

