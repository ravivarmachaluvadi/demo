package com.example.h2db.demo;

import com.example.h2db.demo.entity.Student;
import com.example.h2db.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	StudentRepository studentRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Student s1=new Student();

		s1.setName("Varma");
		s1.setPassportNumber("221");

		studentRepository.save(s1);



	}
}
