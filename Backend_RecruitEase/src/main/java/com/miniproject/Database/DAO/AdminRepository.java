package com.miniproject.Database.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.miniproject.Database.Entity.AdminRegister;

public interface AdminRepository extends JpaRepository<AdminRegister, Long> {

	AdminRegister findByEmail(String email);
}
