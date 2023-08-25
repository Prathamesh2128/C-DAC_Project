package com.app.entities;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@DiscriminatorValue(value = "teacher")
@PrimaryKeyJoinColumn(name = "user_id")
@Table(name = "teachers")
public class Teacher extends User {
	@Column(length = 20)
	private String name;
	@Column(length = 20, unique = true)
	private String contactNo;
	@Column(length = 20)
	private String qualification;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
}
