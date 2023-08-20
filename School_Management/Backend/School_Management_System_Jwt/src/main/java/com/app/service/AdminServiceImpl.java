package com.app.service;

import java.util.Set;
import java.util.stream.Collectors;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import com.app.dto.AdminResponseDTO;
import com.app.dto.AdminSignupRequest;
import com.app.entities.Admin;
import com.app.entities.Role;
import com.app.entities.UserRoles;
import com.app.repository.AdminRepository;
import com.app.repository.RoleRepository;

public class AdminServiceImpl implements IAdminService{
	
	@Autowired
	private RoleRepository roleRepo;
	@Autowired
	private AdminRepository adminRepo;
	@Autowired
	private PasswordEncoder encoder;
	
	@Override
	public AdminResponseDTO registerAdmin(AdminSignupRequest adminRequest) {
		System.out.println("in register admin" +adminRequest);
		Admin admin = new Admin();
		BeanUtils.copyProperties(adminRequest, admin);
		admin.setPassword(encoder.encode(adminRequest.getPassword()));//set encoded password
		Set<Role> roles = adminRequest.getRoles().stream()		// convert Set<String> : role names ---> Stream<String>
				// mapping roleName --> Role (using RoleRepo)
				.map(roleName -> roleRepo.findByUserRole(UserRoles.valueOf(roleName)).get())
				.collect(Collectors.toSet());
		admin.setRoles(roles);
		admin.setActive(true);
		//admin.getRoles().add(new Role(UserRoles.ROLE_ADMIN));
		System.out.println("admin " +admin);
		AdminResponseDTO adminDTO = new AdminResponseDTO();
		BeanUtils.copyProperties(adminRepo.save(admin), adminDTO);
		System.out.println("admin resp dto " + adminDTO);
		return adminDTO;
	}

}
