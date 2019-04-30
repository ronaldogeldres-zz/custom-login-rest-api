package com.example.customloginrestapi.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name = "cars")
@Table(name = "tbl_cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "car_pk", unique = true)
    private Long id;
    @Column(name = "car_descrption", nullable = false)
    private String description;
}
