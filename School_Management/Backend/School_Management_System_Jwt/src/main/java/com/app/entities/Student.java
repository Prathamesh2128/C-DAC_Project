package com.app.entities;

import org.hibernate.annotations.DynamicUpdate;
import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@DynamicUpdate
@Entity
@DiscriminatorValue(value = "student")
@PrimaryKeyJoinColumn(name = "user_id")
@Table(name = "students")
public class Student extends User {
	@Column(length = 20, name = "firstname")
	private String firstName;
	@Column(length = 20, name = "lastname")
	private String lastName;
	
	@Column(length = 10)
	private double attendance;
	@Column(length = 300)
	private String address;
	@Column(length = 15)
	private String contactNo;
	
	@Column(length = 10)
	private String standard;
//	@ManyToOne
//	@JoinColumn(name = "parent_id")
//	private Parent parent;
	
//	@ManyToOne
//	@JoinColumn(name = "standard_id")
//	private Standard standard;
	

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
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
//	public Parent getParent() {
//		return parent;
//	}
//	public void setParent(Parent parent) {
//		this.parent = parent;
//	}
	
	public double getAttendance() {
		return attendance;
	}
	public void setAttendance(double attendance) {
		this.attendance = attendance;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
//	public Standard getStandard() {
//		return standard;
//	}
//	public void setStandard(Standard standard) {
//		this.standard = standard;
//	}
	
	

	
	
	
}
