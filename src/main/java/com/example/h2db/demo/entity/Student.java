package com.example.h2db.demo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@ToString
public class Student {
    @Id
    @GeneratedValue
    @Column(columnDefinition = "uuid",updatable = false)
    private UUID id;
    private String name;
    private String passportNumber;
}