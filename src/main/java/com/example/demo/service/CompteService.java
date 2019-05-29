package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.beans.Compte;
import com.example.demo.idao.idao;
import com.example.demo.repository.CompteRepository;
@Repository
public class CompteService implements idao<Compte>{

	@Autowired
	private CompteRepository Compteres;
	
	@Override
	public void create(Compte o) {
		Compteres.save(o);
		
	}

	@Override
	public void delete(Compte o) {
		Compteres.delete(o);
		
	}

	@Override
	public void update(Compte o) {
		Compteres.save(o);
		
	}

	@Override
	public List<Compte> findAll() {
		return (List<Compte>) Compteres.findAll();
	}

	@Override
	public Compte findById(int id) {
		return Compteres.findById(id).get();
	}

}
