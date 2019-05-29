package com.example.demo.beans;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Transient;



@Entity
public class Region {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nom;
	@Transient
	@OneToMany(mappedBy="region")
	private List<Ville> villes;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public List<Ville> getVilles() {
		return villes;
	}
	public void setVilles(List<Ville> villes) {
		this.villes = villes;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + ((villes == null) ? 0 : villes.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Region other = (Region) obj;
		if (id != other.id)
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (villes == null) {
			if (other.villes != null)
				return false;
		} else if (!villes.equals(other.villes))
			return false;
		return true;
	}
	public Region(int id, String nom, List<Ville> villes) {
		super();
		this.id = id;
		this.nom = nom;
		this.villes = villes;
	}
	public Region() {
		super();
	}
	
	
	
	
}
