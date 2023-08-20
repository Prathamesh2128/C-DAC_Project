package com.app.dto;

import java.util.HashSet;
import java.util.Set;

import lombok.Data;
import lombok.Getter;

@Data
public class UserSignupRequest {
	private String userName;
	private String email;
	private String password;
	private Set<String> roles = new HashSet<>();
}
