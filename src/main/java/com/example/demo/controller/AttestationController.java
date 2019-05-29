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

import com.example.demo.beans.Attestation;
import com.example.demo.service.AttestationService;

@RestController
@RequestMapping("/api/attestation")
@CrossOrigin
public class AttestationController {

	@Autowired(required = true)
	private AttestationService attestationService;
	
	@GetMapping
	public List<Attestation> getAttestations(){
		return attestationService.findAll();
	}
	
	@PostMapping
	public void addAttestation(@RequestBody Attestation attestation) {
		attestationService.create(attestation);
	}
	
	@GetMapping("/{id}")
	public Attestation getAttestationById(@PathVariable int id) {
		return attestationService.findById(id);
	}
	
	@PutMapping
	public void updateAttestation(@RequestBody Attestation attestation) {
		attestationService.update(attestation);
	}
	
	@DeleteMapping("/{id}")
	public void deleteAttestation(@PathVariable int id) {
		Attestation a = attestationService.findById(id);
		attestationService.delete(a);
	}
}
