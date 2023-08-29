package com.app.service;

import com.app.request.StudentSignupRequest;
import com.app.response.StudentResponseDTO;

public interface IStudentService {

	StudentResponseDTO registerStudent(StudentSignupRequest studentRequest);
}
