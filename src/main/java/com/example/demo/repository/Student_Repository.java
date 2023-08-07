package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Student;

public interface Student_Repository extends JpaRepository<Student, Long>{

}
