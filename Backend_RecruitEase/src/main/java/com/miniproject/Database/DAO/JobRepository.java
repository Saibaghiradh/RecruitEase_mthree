package com.miniproject.Database.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.miniproject.Database.Entity.Jobpost;

public interface JobRepository extends JpaRepository<Jobpost,Long> {

}
