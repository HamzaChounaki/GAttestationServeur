package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import com.example.demo.beans.Profil;
import com.example.demo.idao.idao;
import com.example.demo.repository.ProfilRepository;
@Repository
@Primary
public class ProfilService implements idao<Profil>{

	@Autowired
	private ProfilRepository Profilres;
	
	@Override
	public void create(Profil o) {
		Profilres.save(o);
		
	}

	@Override
	public void delete(Profil o) {
		Profilres.delete(o);
		
	}

	@Override
	public void update(Profil o) {
		Profilres.save(o);
		
	}

	@Override
	public List<Profil> findAll() {
		return (List<Profil>) Profilres.findAll();
	}

	@Override
	public Profil findById(int id) {
		return Profilres.findById(id).get();
	}

}
