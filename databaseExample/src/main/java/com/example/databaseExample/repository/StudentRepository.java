package com.example.databaseExample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.databaseExample.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{
	
	

}
