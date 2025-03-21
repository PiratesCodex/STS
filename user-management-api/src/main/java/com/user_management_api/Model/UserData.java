package com.user_management_api.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "UserData")
public class UserData {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    
 // Constructors, getters, and setters
    public UserData() {}
 public UserData(Long id, String name, String email) {
		this.id = id;
		this.name = name;
		this.email = email;
	}
    
	@Override
	public String toString() {
		return "UserData [id=" + id + ", name=" + name + ", email=" + email + "]";
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
    
    
}
