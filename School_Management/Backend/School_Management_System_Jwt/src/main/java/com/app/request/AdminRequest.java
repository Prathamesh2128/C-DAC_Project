package com.app.request;

public class AdminRequest extends UserRequest{

	private String instituteName;
	private String adharNo;
	
	public AdminRequest(String instituteName, String adharNo) {
		super();
		this.instituteName = instituteName;
		this.adharNo = adharNo;
	}
	public AdminRequest() {
		super();
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
