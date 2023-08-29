package com.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
