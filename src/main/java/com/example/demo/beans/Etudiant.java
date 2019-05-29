package com.example.demo.beans;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Etudiant {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nom;
	private String prenom;
	private Date dateNaissance;
	private String lieuNaissance;
	private String codeNationale;
	private String niveau;
	@ManyToOne(fetch = FetchType.EAGER)
	private Etablissement etablissement;
	@OneToMany(mappedBy="etudiant")
	private List<Attestation> attestations;
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
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Date getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public String getLieuNaissance() {
		return lieuNaissance;
	}
	public void setLieuNaissance(String lieuNaissance) {
		this.lieuNaissance = lieuNaissance;
	}
	public String getCodeNationale() {
		return codeNationale;
	}
	public void setCodeNationale(String codeNationale) {
		this.codeNationale = codeNationale;
	}
	public String getNiveau() {
		return niveau;
	}
	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}
	public Etablissement getEtablissement() {
		return etablissement;
	}
	public void setEtablissement(Etablissement etablissement) {
		this.etablissement = etablissement;
	}
	public List<Attestation> getAttestations() {
		return attestations;
	}
	public void setAttestations(List<Attestation> attestations) {
		this.attestations = attestations;
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
		Etudiant other = (Etudiant) obj;
		if (id != other.id)
			return false;
		return true;
	}
	public Etudiant(int id, String nom, String prenom, Date dateNaissance, String lieuNaissance, String codeNationale,
			String niveau, Etablissement etablissement, List<Attestation> attestations) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.lieuNaissance = lieuNaissance;
		this.codeNationale = codeNationale;
		this.niveau = niveau;
		this.etablissement = etablissement;
		this.attestations = attestations;
	}
	public Etudiant() {
		super();
	}
	
}
