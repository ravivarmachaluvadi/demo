package com.example.h2db.demo;

import com.example.h2db.demo.entity.Student;
import com.example.h2db.demo.repository.StudentRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
@Configuration
@ActiveProfiles("test")
class DemoApplicationTests {

	@Autowired
	@InjectMocks
	StudentRepository studentRepository;

	@SpyBean
	String s;

	@Test
	void contextLoads() throws InterruptedException {

		Student s1=new Student();

		s1.setName("Varma");
		s1.setPhoneNumber("8096210403");

		studentRepository.save(s1);

		//studentRepository.findAll().stream().forEach(student -> System.out.println(student));

		Student s2 =new Student();

		s2.setName("Chaluvadi");
		s2.setPhoneNumber("7780208242");

		studentRepository.save(s2);

		Thread.sleep(1000);

		Student s=studentRepository.findByName("Chaluvadi");
		s.setPhoneNumber("8096210403");
		studentRepository.save(s);
	}

}
