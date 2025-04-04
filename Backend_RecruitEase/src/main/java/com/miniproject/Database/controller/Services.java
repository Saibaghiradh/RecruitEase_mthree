package com.miniproject.Database.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miniproject.Database.DAO.ProjectRepository;
import com.miniproject.Database.Entity.Register;

@Service
public class Services {
	
	@Autowired
	private ProjectRepository repo;
	
	public List<Register> detail()
	{
		return repo.findAll();
	}

}
