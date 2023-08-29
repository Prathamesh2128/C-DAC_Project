package com.app.service;

import java.util.List;

import com.app.entities.Teacher;
import com.app.request.TeacherSignupRequest;
import com.app.response.TeacherResponseDTO;

public interface ITeacherService {

	TeacherResponseDTO registerTeacher(TeacherSignupRequest teacherRequest);
	
	List<Teacher> getAllTeachers();
	
	Teacher getDetails(int teacherId);
	
	TeacherResponseDTO updateDetails(Teacher teacherRequest);
}
