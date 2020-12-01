package com.example.h2db.demo.service;

import com.example.h2db.demo.entity.Student;
import com.example.h2db.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public void saveStudent(Student student){
        studentRepository.save(student);
    }

    public List<Student> getStudents(){
       return studentRepository.findAll();
    }


    public Student getStudent(String name){

        Student s=studentRepository.findByName(name);
        if(s!=null){
            return s;
        }
        return new Student();
    }


    public void saveOrUpdateStudent(Student student){
        Student s= studentRepository.findByName(student.getName());

        if(s.equals(student)){
            System.out.println("No modifications made to Student "+student.getName());
        }
        else {
            studentRepository.deleteById(student.getId());
            studentRepository.save(student);
        }
    }

    public void deleteStudent(String name) {
        studentRepository.deleteByName(name);
    }

    public void deleteAll(){
        studentRepository.deleteAll();
    }

    public void saveStudents(List<Student> s) {
        studentRepository.saveAll(s);
    }
}
