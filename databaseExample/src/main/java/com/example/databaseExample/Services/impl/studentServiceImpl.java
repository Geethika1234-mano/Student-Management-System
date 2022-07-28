package com.example.databaseExample.Services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.databaseExample.Services.StudentService;
import com.example.databaseExample.entity.Student;
import com.example.databaseExample.repository.StudentRepository;

@Service
public class studentServiceImpl implements StudentService{

	private StudentRepository studentRepository;
	
	public studentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		
		return studentRepository.save(student);
	}

	@Override
	public Student getStudentById(Integer id) {
		
		return studentRepository.findById(id).get();
	}

	@Override
	public Student updateStudent(Student student) {
		
		return studentRepository.save(student);
	}

	@Override
	public void deleteStudentById(Integer id) {
		
		studentRepository.deleteById(id);
	}

}
