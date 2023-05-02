package com.in28minutes.rest.webservices.entities;

import java.sql.Date;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity( name = "todos")
public class Todo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@JsonProperty("id")
	private Long id;

	private String username;
	private String description;
	
	@JsonProperty("targetDate")
	private Date targetDate;
	
	private boolean done;
	
	@JsonProperty("createdAt")
	private Timestamp createdAt;
	
	@JsonProperty("updatedAt")
	private Timestamp updatedAt;

	public Todo() {
		
	}
	
	public Todo( String username, String description, Date targetDate, boolean done) {
		super();
		this.username = username;
		this.description = description;
		this.targetDate = targetDate;
		this.done = done;
	}


	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isDone() {
		return done;
	}

	public void setDone(boolean done) {
		this.done = done;
	}

	@Override
	public String toString() {
		return "Todo [id=" + id + ", username=" + username + ", description=" + description + ", targetDate="
				+ targetDate + ", done=" + done + "]";
	}

}