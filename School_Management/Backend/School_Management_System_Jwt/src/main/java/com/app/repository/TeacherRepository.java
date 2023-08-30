package com.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Integer>{
	List<Teacher> findAll();
}
