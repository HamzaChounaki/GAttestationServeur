package com.example.demo.beans;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Transient;



@Entity
public class Profil {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int code;
	private String libelle;
	@Transient
	@OneToMany(mappedBy="profil")
	private List<Employe> employes;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public List<Employe> getEmployes() {
		return employes;
	}
	public void setEmployes(List<Employe> employes) {
		this.employes = employes;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
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
		Profil other = (Profil) obj;
		if (id != other.id)
			return false;
		return true;
	}
	public Profil(int id, int code, String libelle, List<Employe> employes) {
		super();
		this.id = id;
		this.code = code;
		this.libelle = libelle;
		this.employes = employes;
	}
	public Profil() {
		super();
	}
}
