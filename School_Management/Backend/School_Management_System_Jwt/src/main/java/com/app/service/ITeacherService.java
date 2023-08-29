package com.app.service;

import com.app.request.TeacherSignupRequest;
import com.app.response.TeacherResponseDTO;

public interface ITeacherService {

	TeacherResponseDTO registerTeacher(TeacherSignupRequest teacherRequest);
}
