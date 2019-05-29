package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.beans.TypeCompte;
import com.example.demo.idao.idao;
import com.example.demo.repository.TypeCompteRepository;
@Repository
public class TypeCompteService implements idao<TypeCompte>{

	@Autowired
	private TypeCompteRepository TypeCompteres;
	
	@Override
	public void create(TypeCompte o) {
		TypeCompteres.save(o);
		
	}

	@Override
	public void delete(TypeCompte o) {
		TypeCompteres.delete(o);
		
	}

	@Override
	public void update(TypeCompte o) {
		TypeCompteres.save(o);
		
	}

	@Override
	public List<TypeCompte> findAll() {
		return (List<TypeCompte>) TypeCompteres.findAll();
	}

	@Override
	public TypeCompte findById(int id) {
		return TypeCompteres.findById(id).get();
	}

}
