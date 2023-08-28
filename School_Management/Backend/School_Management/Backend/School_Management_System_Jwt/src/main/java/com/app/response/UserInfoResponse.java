package com.app.response;

import java.util.List;

public class UserInfoResponse {
	private final String jwt;
	private String type = "Bearer";
	private Long id;
	private String userName;
	private String email;
	
	private List<String> roles;

	public UserInfoResponse(String jwt, Long id, String userName, String email, List<String> roles) {
		super();
		this.jwt = jwt;
		this.id = id;
		this.userName = userName;
		this.email = email;
		this.roles = roles;
	}

	public String getType() {
		System.out.println(getClass() +"and getType");
		return type;
	}

	public void setType(String type) {
		System.out.println(getClass() +"and setType");
		this.type = type;
	}

	public Long getId() {
		System.out.println(getClass() +"and getId");
		return id;
	}

	public void setId(Long id) {
		System.out.println(getClass() +"and setId");
		this.id = id;
	}

	public String getUserName() {
		System.out.println(getClass() +"and getuserName");
		return userName;
	}

	public void setUserName(String userName) {
		System.out.println(getClass() +"and setUserName");
		this.userName = userName;
	}

	public String getEmail() {
		System.out.println(getClass() +"and getEmail");
		return email;
	}

	public void setEmail(String email) {
		System.out.println(getClass() +"and setEmail");
		this.email = email;
	}

	public List<String> getRoles() {
		System.out.println(getClass() +"and getRoles");
		return roles;
	}

	public void setRoles(List<String> roles) {
		System.out.println(getClass() +"and setRoles");
		this.roles = roles;
	}

	public String getJwt() {
		System.out.println(getClass() +"and getJwt");
		return jwt;
	}
}
