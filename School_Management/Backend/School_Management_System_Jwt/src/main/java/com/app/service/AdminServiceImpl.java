package com.app.service;

import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.app.entities.Admin;
import com.app.entities.Role;
import com.app.entities.UserRoles;
import com.app.repository.AdminRepository;
import com.app.repository.RoleRepository;
import com.app.request.AdminRequest;
import com.app.response.AdminResponse;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class AdminServiceImpl implements IAdminService{

	@Autowired
	private PasswordEncoder encoder;
	
	@Autowired
	private RoleRepository roleRepo;
	
	@Autowired
	private AdminRepository adminRepo;
	
	@Override
	public AdminResponse registerAdmin(AdminRequest adminRequest) {
		System.out.println("in register admin" +adminRequest);
		Admin admin = new Admin();
		BeanUtils.copyProperties(adminRequest, admin);
		admin.setPassword(encoder.encode(adminRequest.getPassword()));
		
		Set<Role> roles = adminRequest.getRoles().stream()
				.map(roleName -> roleRepo.findByUserRole(UserRoles.valueOf(roleName)).get())
				.collect(Collectors.toSet());
		
		admin.setRoles(roles);
		admin.setActive(true);
		System.out.println("admin " +admin);
		AdminResponse adminResponse = new AdminResponse();
		BeanUtils.copyProperties(adminRepo.save(admin), adminResponse);
		System.out.println("admin resp dto " + adminResponse);
		return adminResponse;
	}

}
