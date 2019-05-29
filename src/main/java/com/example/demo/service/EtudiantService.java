package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.beans.Etudiant;
import com.example.demo.idao.idao;
import com.example.demo.repository.EtudiantRepository;
@Repository
public class EtudiantService implements idao<Etudiant> {

	@Autowired
	private EtudiantRepository Etudiantres;
	
	@Override
	public void create(Etudiant o) {
		Etudiantres.save(o);
		
	}

	@Override
	public void delete(Etudiant o) {
		Etudiantres.delete(o);
		
	}

	@Override
	public void update(Etudiant o) {
		Etudiantres.save(o);
		
	}

	@Override
	public List<Etudiant> findAll() {
		return (List<Etudiant>) Etudiantres.findAll();
	}

	@Override
	public Etudiant findById(int id) {
		return Etudiantres.findById(id).get();
	}

}
