package com.example.customloginrestapi.domain;

import com.example.customloginrestapi.domain.User;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name = "roles")
@Table(name = "tbl_roles")
public class Role {

    @Column(name = "role_pk", unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;
    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "user_pk", nullable = false)
    private User user;
    @Column(name = "role_description", nullable = false)
    private String description;
}
