package com.app.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.AuthenticationRequest;
import com.app.dto.AuthenticationResponse;
import com.app.jwt_utils.JwtUtils;
import com.app.service.UserDetailsImpl;

@CrossOrigin
@RestController
@RequestMapping("/user")
public class UserController {
	// auto wire Authentication Manager for user authentication , created in
	//Security Config class(currently based upon user details service)
	@Autowired
	private AuthenticationManager authManager;
	
	// auto wire JwtUtils for sending signed JWT back to the clnt
	@Autowired
	private JwtUtils jwtUtils;
	
	@PostMapping("/signin")
	public ResponseEntity<?> authenticateUser(@RequestBody AuthenticationRequest request){
		System.out.println("in auth " + request);
		try {
			Authentication authenticate = authManager.authenticate(
					// An o.s.s.c.Authentication i/f implementation used for simple presentation of
					// a username and password.
					// Actual dao based authentication takes place here internally(first username n
					// then pwd n then authorities gets validated)
					new UsernamePasswordAuthenticationToken(request.getUserName(), request.getPassword()));
			System.out.println("auth success " + authenticate);
			SecurityContextHolder.getContext().setAuthentication(authenticate);
			String jwt = jwtUtils.generateJwtToken(authenticate);
			UserDetailsImpl userDetails = (UserDetailsImpl) authenticate.getPrincipal();
			List<String> roles = userDetails.getAuthorities().stream()
					.map(item -> item.getAuthority())
					.collect(Collectors.toList());
			return ResponseEntity.ok(new AuthenticationResponse(jwt, userDetails.getId(), userDetails.getUsername(),
					userDetails.getEmail(), roles));
		}catch (Exception e){
			e.printStackTrace();
			throw new RuntimeException("User authentication Failed", e);
		}
		
	}
}
