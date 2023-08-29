package com.app.request;

public class StudentSignupRequest extends UserRequest{

	private String firstName;
	private String lastName;
	private String address;
	private String contactNo;
	private double attendence;
	private String standard;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public double getAttendence() {
		return attendence;
	}
	public void setAttendence(double attendence) {
		this.attendence = attendence;
	}
	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
	
	
}
