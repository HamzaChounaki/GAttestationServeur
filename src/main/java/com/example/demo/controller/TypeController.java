package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.beans.Type;
import com.example.demo.service.TypeService;

@RestController
@RequestMapping("/api/type")
@CrossOrigin
public class TypeController {

	@Autowired(required = true)
	private TypeService typeService;
	
	@GetMapping
	public List<Type> getTypes(){
		return typeService.findAll();
	}
	
	@PostMapping 
	public void addType(@RequestBody Type type) {
		typeService.create(type);
	}
	
	@GetMapping("/{id}")
	public Type getTypeById(@PathVariable int id){
		return typeService.findById(id);
	}
	
	
	@PutMapping
	public void updateType(@RequestBody Type type) {
		typeService.update(type);
	}
	
	@DeleteMapping("/{id}")
	public void deleteType(@PathVariable int id) {
		Type t = typeService.findById(id);
		typeService.delete(t);
	}
}
