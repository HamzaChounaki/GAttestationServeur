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

import com.example.demo.beans.Compte;
import com.example.demo.service.CompteService;

@RestController
@RequestMapping("/api/compte")
@CrossOrigin
public class CompteController {

	@Autowired(required = true)
	private CompteService compteService;
	
	@GetMapping
	public List<Compte> getComptes(){
		return compteService.findAll();
	}
	
	@PostMapping
	public void addCompte(@RequestBody Compte compte) {
		compteService.create(compte);
	}
	
	@GetMapping("/{id}")
	public Compte getCompteById(@PathVariable int id) {
		return compteService.findById(id);
	}
	
	@PutMapping
	public void updateCompte(@RequestBody Compte compte) {
		compteService.update(compte);
	}
	
	@DeleteMapping("/{id}")
	public void deleteCompte(@PathVariable int id) {
		Compte c = compteService.findById(id);
		compteService.delete(c);
	}
}
