package com.example.databaseExample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.databaseExample.Services.StudentService;
import com.example.databaseExample.entity.Student;

@Controller
public class userController {
	
	private StudentService studentService;
	
	public userController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}

	@GetMapping("/students")
	public String listStudents(Model model)
	{
		model.addAttribute("students",studentService.getAllStudents());
		return "students";
	}
	
	@GetMapping("/students/new")
	public String addStudent(Model model)
	{
		//create student object to hold student form data
		Student student = new Student();
		model.addAttribute("student",student);
		return "addstudent";
	}
	
	@PostMapping("/students")
	public String saveStudent(@ModelAttribute("student") Student student)
	{
		studentService.saveStudent(student);
		return "redirect:/students";
	}
	
	@GetMapping("/students/edit/{id}")
	public String editStudent(@PathVariable Integer id, Model model)
	{
		model.addAttribute("student",studentService.getStudentById(id));
		return "editstudent";
	}

	@PostMapping("/students/{id}")
	public String updateStudent(@PathVariable Integer id, @ModelAttribute("student") Student student,Model model)
	{
		//get student from database by id
		Student existingStudent = studentService.getStudentById(id);
		existingStudent.setId(student.getId());
		existingStudent.setFirstName(student.getFirstName());
		existingStudent.setLastName(student.getLastName());
		existingStudent.setEmail(student.getEmail());
		
		//save updated student object
		studentService.updateStudent(existingStudent);
		return "redirect:/students";
	}
	
	//handler method to handle student delete
	@GetMapping("/students/{id}")
	public String deleteStudent(@PathVariable Integer id)
	{
		studentService.deleteStudentById(id);
		return "redirect:/students";
	}
}
