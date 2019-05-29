package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.beans.Attestation;
import com.example.demo.idao.idao;
import com.example.demo.repository.AttestationRepository;

@Repository
public class AttestationService implements idao<Attestation>{

	@Autowired
	private AttestationRepository Attestationres;
	
	@Override
	public void create(Attestation o) {
		Attestationres.save(o);
		
	}

	@Override
	public void delete(Attestation o) {
		Attestationres.delete(o);
		
	}

	@Override
	public void update(Attestation o) {
		Attestationres.save(o);
		
	}

	@Override
	public List<Attestation> findAll() {
		return (List<Attestation>) Attestationres.findAll();
	}

	@Override
	public Attestation findById(int id) {
		return Attestationres.findById(id).get();
	}

}
