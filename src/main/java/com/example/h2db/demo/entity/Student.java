package com.example.h2db.demo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
public class Student {
    @Id
    @GeneratedValue

    private UUID id;
    private String name;
    private String passportNumber;
}