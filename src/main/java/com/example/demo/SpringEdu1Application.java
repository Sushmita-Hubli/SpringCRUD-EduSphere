package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.Student;
import com.example.demo.repository.Student_Repository;

@SpringBootApplication
public class SpringEdu1Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringEdu1Application.class, args);
	}

	
@Autowired
private Student_Repository studentRepository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
/*
		Student s1=new Student("Sushmita","Hubli","hublisushmita7@gmail.com");
		studentRepository.save(s1);
		
		
		Student s2=new Student("Shravani","Kulkarni","coolkarnishravni@gmail.com");
		studentRepository.save(s2);
		
		Student s3=new Student("Jagruti","Avhad","avhadjagruti8@gmail.com");
		studentRepository.save(s3);
		*/
	}
	}
