package com.example.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.Student_Repository;
import com.example.demo.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	private Student_Repository studentRepository;
	public StudentServiceImpl(Student_Repository s)
	{
		super();
		this.studentRepository=s;
	}
	
	@Override
	public List<Student> getAllStudents()
	{
		return studentRepository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		
		return studentRepository.save(student);
	}

	@Override
	public Student getStudentById(Long id) {
		// TODO Auto-generated method stub
		return studentRepository.findById(id).get();
	}

	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}

	@Override
	public void deleteStudentById(Long id) {
		// TODO Auto-generated method stub
		studentRepository.deleteById(id);
		
	}
	
}