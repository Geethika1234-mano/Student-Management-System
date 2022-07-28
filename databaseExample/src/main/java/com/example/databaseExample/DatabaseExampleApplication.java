package com.example.databaseExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.databaseExample.entity.Student;
import com.example.databaseExample.repository.StudentRepository;

@SpringBootApplication
public class DatabaseExampleApplication  implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(DatabaseExampleApplication.class, args);
	}
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
//		Student student1 = new Student("Geethika","Sewwandi","gee@gmail.com");
//		studentRepository.save(student1);
//		
//		Student student2 = new Student("Manoj","Udayanga","manoj@gmail.com");
//		studentRepository.save(student2);
//		
//		Student student3 = new Student("Prema","Kumara","prema@gmail.com");
//		studentRepository.save(student3);
		
	}

}
