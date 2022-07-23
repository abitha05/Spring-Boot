package com.example.thymeleaf.model;


import javax.persistence.*;
import javax.validation.constraints.NotBlank;

import lombok.*;
@Data
@Entity
@Table(name = "userform")
public class User {
    
    @Id	
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    @NotBlank(message = "Name is mandatory")
    private String name;
    
    @NotBlank(message = "Email is mandatory")
    private String email;

    
}
