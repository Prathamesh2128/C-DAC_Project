package com.app.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.app.entities.Role;
import com.app.entities.UserRoles;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
	Optional<Role> findByUserRole(UserRoles role);
}
