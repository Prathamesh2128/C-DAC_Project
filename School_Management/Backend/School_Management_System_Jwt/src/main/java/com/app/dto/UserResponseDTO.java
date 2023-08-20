package com.app.dto;

import java.util.HashSet;
import java.util.Set;
import com.app.entities.Role;
import lombok.Data;

@Data
public class UserResponseDTO {
	private Integer id;
	private String userName;
	private String email;
	private boolean active;
	private Set<Role> roles = new HashSet<>();
}
