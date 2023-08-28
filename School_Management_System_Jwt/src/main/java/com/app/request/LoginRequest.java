package com.app.request;

public class LoginRequest {

	private String userName;

	private String password;

	public String getuserName() {
		System.out.println(getClass() +"and getuserName");
		return userName;
	}

	public void setuserName(String userName) {
		System.out.println(getClass() +"and setuserName");
		this.userName = userName;
	}

	public String getPassword() {
		System.out.println(getClass() +"and getPassword");
		return password;
	}

	public void setPassword(String password) {
		System.out.println(getClass() +"and setPassword");
		this.password = password;
	}
}
