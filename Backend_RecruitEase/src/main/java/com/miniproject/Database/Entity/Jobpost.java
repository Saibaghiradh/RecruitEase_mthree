package com.miniproject.Database.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Jobpost {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column( name = "cname")
	private String cname;
	@Column( name = "crole")
	private String crole;
	@Column( name = "skills")
	private String skills;
	@Column( name = "link")
	private String link;
	@Column( name = "date")
	private String date;
	
	public Jobpost() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCrole() {
		return crole;
	}
	public void setCrole(String crole) {
		this.crole = crole;
	}
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	@Override
	public String toString() {
		return "Jobpost [id=" + id + ", cname=" + cname + ", crole=" + crole + ", skills=" + skills + ", link=" + link
				+ ", date=" + date + "]";
	}
	
	

}
