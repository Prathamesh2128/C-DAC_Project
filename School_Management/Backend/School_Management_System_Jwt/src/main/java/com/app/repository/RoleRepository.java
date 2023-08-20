package com.app.repository;

import java.util.Optional;

import com.app.entities.Role;
import com.app.entities.UserRoles;

public interface RoleRepository {
	Optional<Role> findByUserRole(UserRoles role);
}
