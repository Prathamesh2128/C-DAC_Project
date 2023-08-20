package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.app.entities.Admin;

public interface AdminRepository extends JpaRepository<Admin, Long>{

}
