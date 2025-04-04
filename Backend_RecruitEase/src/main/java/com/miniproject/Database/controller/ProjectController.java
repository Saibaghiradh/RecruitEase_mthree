package com.miniproject.Database.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.miniproject.Database.DAO.ProjectRepository;
import com.miniproject.Database.Entity.AdminRegister;
import com.miniproject.Database.Entity.Jobpost;
import com.miniproject.Database.Entity.LoginRequest;
import com.miniproject.Database.Entity.Register;
import com.miniproject.Database.DAO.*;
import com.example.Database.Controller.*;

@RestController
@RequestMapping("/project")
@CrossOrigin("*")
public class ProjectController {
	
	@Autowired
	private ProjectRepository repo;
	
	@Autowired
	private AdminRepository repo1;
	
	@Autowired
	private JobRepository repo2;
	
	@Autowired
	private Services s;
	
	@GetMapping("/")
	public List<Register> details()
	{
		return s.detail();
	}
	
	@GetMapping("/admin")
	public List<AdminRegister> admindetails()
	{
		return repo1.findAll();
	}
	
	
	@PostMapping("/add")
	public ResponseEntity<Map<String, String>> registerUser(@RequestBody Register registration) {
	    repo.save(registration);

	    // Creating a JSON response
	    Map<String, String> response = new HashMap<>();
	    response.put("message", "Registration Successful!");
	    
	    return ResponseEntity.ok(response);
	}
	
	@PostMapping("/login")
	public ResponseEntity<Map<String, String>> loginUser(@RequestBody Register loginRequest) {
		Map<String, String> response = new HashMap<>();

	    if (loginRequest.getUname() == null || loginRequest.getPassword() == null) {
	        response.put("message", "Username or Password is missing");
	        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
	    }

	    Register user = repo.findByUname(loginRequest.getUname());
	    

	    if (user == null) {
	        response.put("message", "User not found");
	        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(response);
	    }

	    if (!user.getPassword().equals(loginRequest.getPassword())) {
	        response.put("message", "Incorrect password");
	        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(response);
	    }

	    response.put("message", "Login Successful!");
	    return ResponseEntity.ok(response);
	}


	@PostMapping("/adminlogin")
	public ResponseEntity<Map<String, String>> loginUser1(@RequestBody AdminRegister loginRequest) {
		Map<String, String> response = new HashMap<>();

	    if (loginRequest.getEmail() == null || loginRequest.getPassword() == null) {
	        response.put("message", "Username or Password is missing");
	        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
	    }

	    AdminRegister user = repo1.findByEmail(loginRequest.getEmail());

	    if (user == null) {
	        response.put("message", "User not found");
	        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(response);
	    }

	    if (!user.getPassword().equals(loginRequest.getPassword())) {
	        response.put("message", "Incorrect password");
	        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(response);
	    }

	    response.put("message", "Login Successful!");
	    return ResponseEntity.ok(response);
	}
	
	@PostMapping("/addpost")
	public ResponseEntity<Map<String, String>> registerJob(@RequestBody Jobpost post) {
	    repo2.save(post);
	    // Creating a JSON response
	    Map<String, String> response = new HashMap<>();
	    response.put("message", "Registration Successful!");
	    
	    return ResponseEntity.ok(response);
	}
	
	
	@GetMapping("/getjobs")
	public List<Jobpost> jobdetails()
	{
		return repo2.findAll();
		
	}



}
