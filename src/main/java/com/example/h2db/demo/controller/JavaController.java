package com.example.h2db.demo.controller;

import com.example.h2db.demo.entity.Student;
import com.example.h2db.demo.repository.StudentRepository;
import com.example.h2db.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JavaController {

    @Autowired
    StudentService studentService;

    @GetMapping(value = "/student/{name}")
    Student getStu(@PathVariable String name){
        Student s1=studentService.getStudent(name);
        return s1;
    }

    @GetMapping(value = "/student")
    Student getStuRP(@RequestParam String name){
        Student s1=studentService.getStudent(name);
        return s1;
    }

    @GetMapping(value = "/students")
    List<Student> getStuddents(){
        List<Student> s1=studentService.getStudents();
        return s1;
    }

    @PostMapping(value = "/student",produces = "application/json",consumes = "application/json")
    void saveStudent(@RequestBody Student s){
        studentService.saveStudent(s);
    }

    @PostMapping(value = "/students")
    void saveStudent(@RequestBody List<Student> s){
        studentService.saveStudents(s);
    }

    @DeleteMapping(value = "/student/{name}")
    void deleteStudent(@PathVariable String name){
        studentService.deleteStudent(name);
    }

    @DeleteMapping(value = "/students")
    void deleteStudents(){
        studentService.deleteAll();
    }

}
