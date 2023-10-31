package com.example.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Usuario {
    @Id
    private Long id;
    private String username;
    private String password;
    private String rol;

    // getters y setters
}
