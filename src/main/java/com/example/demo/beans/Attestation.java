package com.example.demo.beans;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;


@Entity
public class Attestation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int numero;
	private Date dateSortie;
	@ManyToOne(fetch = FetchType.EAGER)
	private Etudiant etudiant;
	@ManyToOne(fetch = FetchType.EAGER)
	private Employe employe;
	@Transient
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Date getDateSortie() {
		return dateSortie;
	}
	public void setDateSortie(Date dateSortie) {
		this.dateSortie = dateSortie;
	}
	public Etudiant getEtudiant() {
		return etudiant;
	}
	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}
	public Employe getEmploye() {
		return employe;
	}
	public void setEmploye(Employe employe) {
		this.employe = employe;
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
		Attestation other = (Attestation) obj;
		if (id != other.id)
			return false;
		return true;
	}
	public Attestation(int id, int numero, Date dateSortie, Etudiant etudiant, Employe employe) {
		super();
		this.id = id;
		this.numero = numero;
		this.dateSortie = dateSortie;
		this.etudiant = etudiant;
		this.employe = employe;
	}
	public Attestation() {
		super();
	}
	
	
}
