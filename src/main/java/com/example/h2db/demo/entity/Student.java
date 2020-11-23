package com.example.h2db.demo.entity;

import com.sun.istack.Nullable;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;
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
    private String phoneNumber;
    @CreationTimestamp
    private Date creationDate;
    @UpdateTimestamp
    private Date modifiedDate;

}