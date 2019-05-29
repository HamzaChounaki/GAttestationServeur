package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.beans.Region;
import com.example.demo.idao.idao;
import com.example.demo.repository.RegionRepository;
@Repository
public class RegionService implements idao<Region>{

	@Autowired
	private RegionRepository Regionres;
	
	@Override
	public void create(Region o) {
		Regionres.save(o);
	}

	@Override
	public void delete(Region o) {
		Regionres.delete(o);
		
	}

	@Override
	public void update(Region o) {
		Regionres.save(o);
		
	}

	@Override
	public List<Region> findAll() {
		return (List<Region>) Regionres.findAll();
	}

	@Override
	public Region findById(int id) {
		return Regionres.findById(id).get();
	}

}
