package com.app.service;

import java.util.List;

import com.app.entities.Student;
import com.app.request.StudentSignupRequest;
import com.app.response.StudentResponseDTO;

public interface IStudentService {

	StudentResponseDTO registerStudent(StudentSignupRequest studentRequest);
	List<Student> getAllStudents();
	Student getDetails(int studentId);

}
