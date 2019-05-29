package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.beans.Ville;
import com.example.demo.idao.idao;
import com.example.demo.repository.VilleRepository;
@Repository
public class VilleService implements idao<Ville> {

	@Autowired
	private VilleRepository Villeres;
	
	@Override
	public void create(Ville o) {
		Villeres.save(o);
		
	}

	@Override
	public void delete(Ville o) {
		Villeres.delete(o);
		
	}

	@Override
	public void update(Ville o) {
		Villeres.save(o);
		
	}

	@Override
	public List<Ville> findAll() {
		return (List<Ville>) Villeres.findAll();
 	}

	@Override
	public Ville findById(int id) {
		return Villeres.findById(id).get();
	}

}
