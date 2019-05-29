package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.beans.Employe;
import com.example.demo.idao.idao;
import com.example.demo.repository.EmployeRepository;
@Repository
public class EmployeService implements idao<Employe>{

	@Autowired
	private EmployeRepository Employeres;
	
	@Override
	public void create(Employe o) {
		Employeres.save(o);
		
	}

	@Override
	public void delete(Employe o) {
		Employeres.delete(o);
		
	}

	@Override
	public void update(Employe o) {
		Employeres.save(o);
		
	}

	@Override
	public List<Employe> findAll() {
		return (List<Employe>) Employeres.findAll();
	}

	@Override
	public Employe findById(int id) {
		return Employeres.findById(id).get();
	}

}
