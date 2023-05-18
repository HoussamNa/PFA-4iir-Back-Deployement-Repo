package com.quicklinker.pfa.model;

import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;

@Entity
public class ProfilModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idProfil;
	
	@Column(nullable=false)
	private String nom;
	
	@Column(nullable=false)
	private String prenom;
	
	@Column(nullable=false,unique=true)
	private String email;
	
	@Column(nullable=false)
	private int age;
	
	@Column(nullable=false)
	private Date ddn;
	
	@Column(nullable=false)
	private String tel;

	 @OneToOne(cascade = CascadeType.ALL)
	 @JoinColumn(name = "idAdresse")
	 private AdresseModel address;
	
	//@ManyToMany
	//@JoinTable(name="profil_compte",joinColumns=@JoinColumn(name="idProfil"),
	//inverseJoinColumns=@JoinColumn(name="idCompte"))
	//List<CompteModel> CompteModel;
	
	public int getId() {
		return idProfil;
	}

	public void setId(int id) {
		this.idProfil = id;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getDdn() {
		return ddn;
	}

	public void setDdn(Date ddn) {
		this.ddn = ddn;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	} 
	

}
