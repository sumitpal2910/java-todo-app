package com.in28minutes.rest.webservices.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.in28minutes.rest.webservices.entities.Todo;

public interface TodoRepository  extends JpaRepository<Todo, Long>{

	public List<Todo> findByUsername(String username);
}
