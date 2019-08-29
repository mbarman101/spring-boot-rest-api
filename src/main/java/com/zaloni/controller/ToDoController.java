package com.zaloni.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.zaloni.dao.ToDoDao;
import com.zaloni.entity.ToDo;

@RestController
public class ToDoController {
	
	@Autowired
	ToDoDao dao;
	
	@GetMapping(path = "/todos", produces = {"application/json"})
	
	public List<ToDo> getToDos() {
		
		return dao.findAll();
	}
	
	@GetMapping(path = "/todos/{id}", produces = {"application/json"})
	
	public Optional<ToDo> getToDo(@PathVariable("id") int id) {
		return dao.findById(id);
		
	}
	
	@DeleteMapping(path = "/todos/{id}")
	public String deleteToDo(@PathVariable("id") int id) {
		ToDo td = dao.getOne(id);
		dao.delete(td);
		return "Deleted !!";
	}
	
	@PostMapping(path = "/todos", consumes = {"application/json"})
	public ToDo addToDo(@RequestBody ToDo toDo) {
		dao.save(toDo);
		return toDo;
	}
	
	@PutMapping(path = "/todos", consumes = {"application/json"})
	public ToDo saveOrUpdateTodo(@RequestBody ToDo toDo) {
		dao.save(toDo);
		return toDo;
	}

}
