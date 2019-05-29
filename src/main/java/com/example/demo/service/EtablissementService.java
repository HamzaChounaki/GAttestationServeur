package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.beans.Etablissement;
import com.example.demo.idao.idao;
import com.example.demo.repository.EtablissementRepository;
@Repository
public class EtablissementService implements idao<Etablissement> {

	@Autowired
	private EtablissementRepository Etablissementres;
	
	@Override
	public void create(Etablissement o) {
		Etablissementres.save(o);
		
	}

	@Override
	public void delete(Etablissement o) {
		Etablissementres.delete(o);
		
	}

	@Override
	public void update(Etablissement o) {
		Etablissementres.save(o);
		
	}

	@Override
	public List<Etablissement> findAll() {
		return (List<Etablissement>) Etablissementres.findAll();
	}

	@Override
	public Etablissement findById(int id) {
		return Etablissementres.findById(id).get();
	}

}
