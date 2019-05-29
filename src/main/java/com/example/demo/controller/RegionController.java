package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.beans.Region;
import com.example.demo.service.RegionService;

@RestController
@RequestMapping("/api/region")
@CrossOrigin
public class RegionController {

	@Autowired(required = true)
	private RegionService regionService;
	
	@GetMapping
	public List<Region> getRegions(){
		return regionService.findAll();
	}
	
	@PostMapping 
	public void addRegion(@RequestBody Region region) {
		regionService.create(region);
	}
	
	@GetMapping("/{id}")
	public Region getRegionById(@PathVariable int id){
		return regionService.findById(id);
	}
	
	
	@PutMapping
	public void updateRegion(@RequestBody Region region) {
		regionService.update(region);
	}
	
	@DeleteMapping("/{id}")
	public void deleteRegion(@PathVariable int id) {
		Region r = regionService.findById(id);
		regionService.delete(r);
	}
}
