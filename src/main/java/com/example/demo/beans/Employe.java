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
import javax.persistence.Transient;

@Entity
public class Employe {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nom;
	private String prenom;
	private Date dateNaissance;
	private String lieuNaissance;
	private Date dateEmbauche;
	private String login;
	private String password;
	@ManyToOne(fetch = FetchType.EAGER)
	private Etablissement etablissement;
	@ManyToOne(fetch = FetchType.EAGER)
	private Profil profil;
	@Transient
	@OneToMany(mappedBy="employe")
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
	public Date getDateEmbauche() {
		return dateEmbauche;
	}
	public void setDateEmbauche(Date dateEmbauche) {
		this.dateEmbauche = dateEmbauche;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Etablissement getEtablissement() {
		return etablissement;
	}
	public void setEtablissement(Etablissement etablissement) {
		this.etablissement = etablissement;
	}
	public Profil getProfil() {
		return profil;
	}
	public void setProfil(Profil profil) {
		this.profil = profil;
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
		Employe other = (Employe) obj;
		if (id != other.id)
			return false;
		return true;
	}
	public Employe(int id, String nom, String prenom, Date dateNaissance, String lieuNaissance, Date dateEmbauche,
			String login, String password, Etablissement etablissement, Profil profil, List<Attestation> attestations) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.lieuNaissance = lieuNaissance;
		this.dateEmbauche = dateEmbauche;
		this.login = login;
		this.password = password;
		this.etablissement = etablissement;
		this.profil = profil;
		this.attestations = attestations;
	}
	public Employe() {
		super();
	}
	
	
}
