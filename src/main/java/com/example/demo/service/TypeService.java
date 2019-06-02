package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.beans.Type;
import com.example.demo.idao.idao;
import com.example.demo.repository.TypeRepository;
@Repository
public class TypeService implements idao<Type>{

	@Autowired
	private TypeRepository Typeres;
	
	@Override
	public void create(Type o) {
		Typeres.save(o);
		
	}

	@Override
	public void delete(Type o) {
		Typeres.delete(o);
		
	}

	@Override
	public void update(Type o) {
		Typeres.save(o);
		
	}

	@Override
	public List<Type> findAll() {
		return (List<Type>) Typeres.findAll();
	}

	@Override
	public Type findById(int id) {
		return Typeres.findById(id).get();
	}

}
