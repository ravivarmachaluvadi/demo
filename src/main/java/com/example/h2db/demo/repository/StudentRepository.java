package com.example.h2db.demo.repository;

import com.example.h2db.demo.entity.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;

@Repository
@Transactional
public interface StudentRepository extends CrudRepository<Student, UUID> {

    Student findById(int id);
    List<Student> findAll();
    Student findByName(String name);
    void deleteById(int id);

    void deleteByName(String name);
}
