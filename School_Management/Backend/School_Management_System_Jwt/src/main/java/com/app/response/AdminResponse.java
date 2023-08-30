package com.app.response;

public class AdminResponse {
	private Long id;
	private String email;
	private String userName;
	private String instituteName;
	private String adharNo;
	
	public AdminResponse() {
		super();
	}
	public AdminResponse(Long id, String email, String userName, String instituteName, String adharNo) {
		super();
		this.id = id;
		this.email = email;
		this.userName = userName;
		this.instituteName = instituteName;
		this.adharNo = adharNo;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getInstituteName() {
		return instituteName;
	}
	public void setInstituteName(String instituteName) {
		this.instituteName = instituteName;
	}
	public String getAdharNo() {
		return adharNo;
	}
	public void setAdharNo(String adharNo) {
		this.adharNo = adharNo;
	}
	
	
}
