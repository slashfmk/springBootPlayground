
package com.example.demo.student;

import java.util.*;
import com.example.demo.constants.RestRelated;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(path = RestRelated.API_V1+"/student")
public class StudentController {

	private final StudentService studentService;

	// dependency injection
	@Autowired
	public StudentController(StudentService studentService) {
		this.studentService = studentService;
	}

	@GetMapping
	public List<Student> getStudents() {
		return this.studentService.getStudents();
	}

	@PostMapping
	public void registerNewStudent(@RequestBody Student student) {
		this.studentService.addNewStudent(student);
	}

	@DeleteMapping(path =  "{studentId}")
	public void deleteStudent(@PathVariable("studentId") Long id){
		this.studentService.deleteStudent(id);
	}

}
