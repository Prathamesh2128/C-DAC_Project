package com.app.entities;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@DiscriminatorValue(value = "student")
@PrimaryKeyJoinColumn(name = "user_id")
@Table(name = "students")
public class Student extends User{
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
}
