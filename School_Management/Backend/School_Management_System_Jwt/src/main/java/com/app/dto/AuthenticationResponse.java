package com.app.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class AuthenticationResponse {
	private final String jwt;
	private String type = "Bearer";
	private int id;
	private String userName;
	private String email;
	private List<String> roles;
	
	public AuthenticationResponse(String jwt, int id, String userName, String email, List<String> roles) {
		super();
		this.jwt = jwt;
		this.id = id;
		this.userName = userName;
		this.email = email;
		this.roles = roles;
	}
}
