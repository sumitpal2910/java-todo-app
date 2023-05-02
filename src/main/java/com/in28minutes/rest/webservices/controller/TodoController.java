package com.in28minutes.rest.webservices.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.rest.webservices.entities.Todo;
import com.in28minutes.rest.webservices.repository.TodoRepository;

import jakarta.validation.Valid;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping(path = "/todos")
public class TodoController {

	private TodoRepository todoRepository;

	public TodoController(TodoRepository todoRepository) {
		this.todoRepository = todoRepository;
	}

	@GetMapping("/users/{username}/todos")
	public List<Todo> getList(@PathVariable String username) {
		List<Todo> list = todoRepository.findAll();
		System.out.println(list);
		return list;
	}
	
	@GetMapping("/users/{username}/todos/{id}")
	public Todo getDetails(@PathVariable String username, @PathVariable Long id) {
		Optional<Todo> todo = todoRepository.findById(id);		
//		return ResponseEntity<Todo>(user.get());
		
		return todo.get();
	}
	
	@PostMapping("/users/{username}/todos")
	public Todo saveTodo(@PathVariable String username, @Valid @RequestBody Todo todo) {
//		System.out.println(todo);
		todo.setUsername(username);
		
		Todo save = todoRepository.save(todo);
		return save;
	}
	
	
	@DeleteMapping("/users/{username}/todos/{id}")
	public ResponseEntity<Void> deleteTodo(@PathVariable String username, @PathVariable Long id) {
		todoRepository.deleteById(id);
		
		return ResponseEntity.noContent().build();
	}
}