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


import com.example.demo.beans.Etablissement;
import com.example.demo.service.EtablissementService;

@RestController
@RequestMapping("/api/etablissement")
@CrossOrigin
public class EtablissementController {

	@Autowired(required = true)
	private EtablissementService etablissementService;
	
	@GetMapping
	public List<Etablissement> getEtablissements(){
		return etablissementService.findAll();
	}
	
	@PostMapping 
	public void addEtablissement(@RequestBody Etablissement etablissement) {
		etablissementService.create(etablissement);
	}
	
	@GetMapping("/{id}")
	public Etablissement getEtablissementById(@PathVariable int id){
		return etablissementService.findById(id);
	}
	
	
	@PutMapping
	public void updateEtablissement(@RequestBody Etablissement etablissement) {
		etablissementService.update(etablissement);
	}
	
	@DeleteMapping("/{id}")
	public void deleteEtablissement(@PathVariable int id) {
		Etablissement e = etablissementService.findById(id);
		etablissementService.delete(e);
	}
}
