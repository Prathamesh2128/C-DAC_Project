package com.app.service;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.app.entities.Role;
import com.app.entities.Student;
import com.app.entities.UserRoles;
import com.app.exception.UserHandlingException;
import com.app.repository.RoleRepository;
import com.app.repository.StudentRepository;
import com.app.request.StudentSignupRequest;
import com.app.response.StudentResponseDTO;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class StudentServiceImpl implements IStudentService{

	@Autowired
	private RoleRepository roleRepo;

	@Autowired
	private PasswordEncoder encoder;

	@Autowired
	private StudentRepository studentRepo;
	
	@Override
	public StudentResponseDTO registerStudent(StudentSignupRequest studentRequest) {
		System.out.println("student request:-"+studentRequest);
		Student student = new Student();
		BeanUtils.copyProperties(studentRequest, student);
		System.out.println("student"+student);
		student.setPassword(encoder.encode(studentRequest.getPassword()));

		Set<Role>roles = studentRequest.getRoles().stream().map(roleName->roleRepo.findByUserRole(UserRoles.valueOf(roleName)).get())
				.collect(Collectors.toSet());
		student.setRoles(roles);
		student.setActive(true);
		System.out.println("student"+student);
		StudentResponseDTO studentDTO = new StudentResponseDTO();
		BeanUtils.copyProperties(studentRepo.save(student), studentDTO);
		System.out.println("student resp dto " + studentDTO);

		return studentDTO;
	}
	
	

	@Override
	public List<Student> getAllStudents() {
		return studentRepo.findAll();
	}


}
