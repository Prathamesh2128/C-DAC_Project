package com.app.entities;

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
@DiscriminatorValue(value = "admin")
@PrimaryKeyJoinColumn(name = "user_id")
@Entity
@Table(name = "admin")
public class Admin extends User{
	private String instituteName;
	
	private String adharNo;
}
