package com.app.controllers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.repository.RoleRepository;
import com.app.repository.UserRepository;
import com.app.request.LoginRequest;
import com.app.response.UserInfoResponse;
import com.app.security_jwt.JwtUtils;
import com.app.service.UserDetailsImpl;

import jakarta.validation.Valid;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/user")
public class UserController {
  @Autowired
  AuthenticationManager authenticationManager;

  @Autowired
  UserRepository userRepository;

  @Autowired
  RoleRepository roleRepository;

  @Autowired
  PasswordEncoder encoder;

  @Autowired
  JwtUtils jwtUtils;

  @PostMapping("/signin")
  public ResponseEntity<?> authenticateUser(@Valid @RequestBody LoginRequest request) {
	  System.out.println(getClass() +"and In authenticateUser");
	  System.out.println("in auth " + request);
	  try {
		  Authentication authenticate = authenticationManager.authenticate(
				  new UsernamePasswordAuthenticationToken(request.getuserName(), request.getPassword()));
		  System.out.println("auth success " + authenticate);
			SecurityContextHolder.getContext().setAuthentication(authenticate);
			String jwt = jwtUtils.generateJwtToken(authenticate);
			UserDetailsImpl userDetails = (UserDetailsImpl) authenticate.getPrincipal();
			List<String> roles = userDetails.getAuthorities().stream()
					.map(item -> item.getAuthority())
					.collect(Collectors.toList());
			return ResponseEntity.ok(new UserInfoResponse(jwt, userDetails.getId(), userDetails.getUsername(),
					userDetails.getEmail(), roles));
	  }
	  catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("User authentication Failed", e);
		}
  }
}
