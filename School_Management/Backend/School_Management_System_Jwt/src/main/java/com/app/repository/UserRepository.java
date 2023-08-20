package com.app.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.app.entities.User;


public interface UserRepository extends JpaRepository<User, Long> {
	@Query("select distinct u from User u join fetch u.roles where u.userName=:nm")
	Optional<User> findByUserName(@Param("nm") String userName);
}

