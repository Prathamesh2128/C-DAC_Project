package com.app.service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.app.entities.Role;
import com.app.entities.Teacher;
import com.app.entities.UserRoles;
import com.app.exception.UserHandlingException;
import com.app.repository.RoleRepository;
import com.app.repository.TeacherRepository;
import com.app.request.TeacherSignupRequest;
import com.app.response.TeacherResponseDTO;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class TeacherServiceImpl implements ITeacherService{

	@Autowired
	private RoleRepository roleRepo;
	
	@Autowired
	private PasswordEncoder encoder;
	
	@Autowired
	private TeacherRepository teacherRepo;

	@Override
	public TeacherResponseDTO registerTeacher(TeacherSignupRequest teacherRequest) {
		System.out.println("Teacher Request "+teacherRequest);
		Teacher teacher = new Teacher();
		BeanUtils.copyProperties(teacherRequest, teacher);
		System.out.println("Teacher "+teacher);
		teacher.setPassword(encoder.encode(teacherRequest.getPassword()));
		
		Set<Role>roles=teacherRequest.getRoles().stream()
				.map(roleName->roleRepo.findByUserRole(UserRoles.valueOf(roleName)).get())
				.collect(Collectors.toSet());
		teacher.setRoles(roles);
		teacher.setActive(true);
		TeacherResponseDTO teacherDTO = new TeacherResponseDTO();
		BeanUtils.copyProperties(teacherRepo.save(teacher), teacherDTO);
		System.out.println("Teacher response DTO "+teacherDTO);
		return teacherDTO;
	}
	
	@Override
	public List<Teacher> getAllTeachers() {
		return teacherRepo.findAll();
	}	
	
}
