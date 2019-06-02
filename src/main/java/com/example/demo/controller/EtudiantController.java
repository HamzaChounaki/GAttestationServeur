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


import com.example.demo.beans.Etudiant;
import com.example.demo.service.EtudiantService;

@RestController
@RequestMapping("/api/etudiant")
@CrossOrigin
public class EtudiantController {

	@Autowired(required = true)
	private EtudiantService etudiantService;
	
	@GetMapping
	public List<Etudiant> getEtudiants(){
		return etudiantService.findAll();
	}
	
	@PostMapping 
	public void addEtudiant(@RequestBody Etudiant etudiant) {
		etudiantService.create(etudiant);
	}
	
	@GetMapping("/{id}")
	public Etudiant getEtudiantById(@PathVariable int id){
		return etudiantService.findById(id);
	}
	
	
	@PutMapping
	public void updateEtudiant(@RequestBody Etudiant etudiant) {
		etudiantService.update(etudiant);
	}
	
	@DeleteMapping("/{id}")
	public void deleteEtudiant(@PathVariable int id) {
		Etudiant e = etudiantService.findById(id);
		etudiantService.delete(e);
	}
}
