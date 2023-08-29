package com.app.service;

import java.util.List;

import com.app.entities.Feedback;

public interface IStudentFeedbackService {

	List<Feedback> getAllFeedbacks(int studentId);

}
