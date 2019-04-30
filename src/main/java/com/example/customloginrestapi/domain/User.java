package com.example.customloginrestapi.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name = "users")
@Table(name = "tbl_users")
public class User {

    @Column(name = "user_pk", unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;
    @Column(name = "user_name")
    private String username;
    @Column(name = "user_password")
    private String password;
    @Column(name = "user_enabled")
    private boolean enabled;
}
