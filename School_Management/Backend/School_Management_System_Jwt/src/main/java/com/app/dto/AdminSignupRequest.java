package com.app.dto;

import lombok.Data;

@Data
public class AdminSignupRequest extends UserSignupRequest{
	private String instituteName;
	private String adharNo;
}
