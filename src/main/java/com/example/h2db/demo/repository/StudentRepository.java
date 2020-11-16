package com.example.h2db.demo.repository;

import com.example.h2db.demo.entity.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface StudentRepository extends CrudRepository<Student, UUID> {

    Student findById(int id);
    List<Student> findAll();
    void deleteById(int id);

}
