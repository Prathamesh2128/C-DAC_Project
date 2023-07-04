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
@DiscriminatorValue(value = "teacher")
@PrimaryKeyJoinColumn(name = "user_id")
@Table(name = "teachers")
public class Teacher extends User{
	@Column(length = 20)
	private String name;
	
	@Column(length = 20, unique = true)
	private String contactNo;
	
	@Column(length = 20)
	private String qualification;
}
