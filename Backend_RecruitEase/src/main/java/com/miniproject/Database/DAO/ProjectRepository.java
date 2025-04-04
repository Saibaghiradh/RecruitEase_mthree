package com.miniproject.Database.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import com.miniproject.Database.Entity.*;

public interface ProjectRepository extends JpaRepository<Register,Long> {

	Register findByUnameAndPassword(String uname, String password);

	Register findByUname(String uname);

	

}
