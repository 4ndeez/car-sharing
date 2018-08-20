package com.example.CarSharing.model;

import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;

@Entity
public class Cars {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String text;

}
