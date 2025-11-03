package com.example.fitpulse.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String Name;
	private String email;
	public int getId() {
		return id;
	}
	
	public User() {
		
	}
	
	public User(int id, String name, String email) {
		super();
		this.id = id;
		Name = name;
		this.email = email;
	}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", Name=" + Name + ", email=" + email + "]";
	}
	
	

}
