package com.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entities.Teacher;
import com.app.request.TeacherSignupRequest;
import com.app.response.TeacherResponseDTO;
import com.app.service.ITeacherService;

@CrossOrigin
@RestController
@RequestMapping("/teacher")
public class TeacherController {

	@Autowired
	private ITeacherService teacherService;
	
	@PostMapping("/register")
	public ResponseEntity<TeacherResponseDTO> registerTeacher(@RequestBody TeacherSignupRequest teacherRequest) {
		System.out.println("In teacher signup request "+teacherRequest);
		return ResponseEntity.ok(teacherService.registerTeacher(teacherRequest));
	}
	
	@GetMapping("/list")
	public List<Teacher> fetchAllTeachers() {
		System.out.println("in fetch all Teachers");
		return teacherService.getAllTeachers();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getTeacherDetails(@PathVariable int id) {
		System.out.println("in get Teacher details " +id);
		return ResponseEntity.ok(teacherService.getDetails(id));
	}
}
