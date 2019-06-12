package com.example.demo.beans;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Transient;



@Entity
public class Etablissement {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nom;
	@ManyToOne(fetch = FetchType.EAGER)
	private Ville ville;
	@Transient
	@OneToMany(mappedBy="etablissement")
	private List<Employe> employes;
	@Transient
	@OneToMany(mappedBy="etablissement")
	private List<Etudiant> etudiants;
	
	public List<Employe> getEmployes() {
		return employes;
	}
	public void setEmployes(List<Employe> employes) {
		this.employes = employes;
	}
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
		Etablissement other = (Etablissement) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	public List<Etudiant> getEtudiants() {
		return etudiants;
	}
	public void setEtudiants(List<Etudiant> etudiants) {
		this.etudiants = etudiants;
	}
	public Ville getVille() {
		return ville;
	}
	public void setVille(Ville ville) {
		this.ville = ville;
	}
	public Etablissement(int id, String nom, List<Employe> employes, List<Etudiant> etudiants, Ville ville) {
		super();
		this.id = id;
		this.nom = nom;
		this.employes = employes;
		this.etudiants = etudiants;
		this.ville = ville;
	}
	public Etablissement() {
		super();
	}
	
	
}
