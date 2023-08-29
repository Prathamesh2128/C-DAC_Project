package com.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entities.Feedback;
import com.app.entities.Student;
import com.app.request.StudentSignupRequest;
import com.app.response.StudentResponseDTO;
import com.app.security_jwt.JwtUtils;
import com.app.service.IStudentService;

@CrossOrigin
@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private AuthenticationManager authManager;
	
	@Autowired
	private JwtUtils jwtUtils;
	
	@Autowired
	private IStudentService studentService;
	
	@PostMapping("/signup")
	public ResponseEntity<StudentResponseDTO> registerStudent(@RequestBody StudentSignupRequest studentRequest) {
		System.out.println("in student reg : student request " + studentRequest);
		return ResponseEntity.ok(studentService.registerStudent(studentRequest));
		}
	
	@GetMapping("/list")
	public List<Student> fetchAllStudents() {
		System.out.println("in fetch all students");
		return studentService.getAllStudents();
	}
	
	
	
}
