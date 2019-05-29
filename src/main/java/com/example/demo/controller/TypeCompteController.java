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


import com.example.demo.beans.TypeCompte;
import com.example.demo.service.TypeCompteService;

@RestController
@RequestMapping("/api/typeCompte")
@CrossOrigin
public class TypeCompteController {

	@Autowired(required = true)
	private TypeCompteService typeCompteService;
	
	@GetMapping
	public List<TypeCompte> getTypeComptes(){
		return typeCompteService.findAll();
	}
	
	@PostMapping 
	public void addTypeCompte(@RequestBody TypeCompte typeCompte) {
		typeCompteService.create(typeCompte);
	}
	
	@GetMapping("/{id}")
	public TypeCompte getTypeCompteById(@PathVariable int id){
		return typeCompteService.findById(id);
	}
	
	
	@PutMapping
	public void updateTypeCompte(@RequestBody TypeCompte typeCompte) {
		typeCompteService.update(typeCompte);
	}
	
	@DeleteMapping("/{id}")
	public void deleteTypeCompte(@PathVariable int id) {
		TypeCompte t = typeCompteService.findById(id);
		typeCompteService.delete(t);
	}
}
