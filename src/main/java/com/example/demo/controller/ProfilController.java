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

import com.example.demo.beans.Profil;
import com.example.demo.service.ProfilService;

@RestController
@RequestMapping("/api/profil")
@CrossOrigin
public class ProfilController {

	@Autowired(required = true)
	private ProfilService profilService;
	
	@GetMapping
	public List<Profil> getProfils(){
		return profilService.findAll();
	}
	
	@PostMapping
	public void addProfil(@RequestBody Profil profil) {
		profilService.create(profil);
	}
	
	@GetMapping("/{id}")
	public Profil getProfilById(@PathVariable int id) {
		return profilService.findById(id);
	}
	
	@PutMapping
	public void updateProfil(@RequestBody Profil profil) {
		profilService.update(profil);
	}
	
	@DeleteMapping("/{id}")
	public void deleteProfil(@PathVariable int id) {
		Profil p = profilService.findById(id);
		profilService.delete(p);
	}
}
