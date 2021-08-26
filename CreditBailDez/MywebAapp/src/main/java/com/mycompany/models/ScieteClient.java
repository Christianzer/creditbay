package com.mycompany.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@JsonIdentityInfo(generator= ObjectIdGenerators.PropertyGenerator.class,property="id")
public class ScieteClient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nom;
    private String telephone;
    private String email;
    private String adresse;
    

    
    @OneToMany(mappedBy = "scieteClient")
    private List<Client> clientList;


	public ScieteClient() {
		// TODO Auto-generated constructor stub
	}

	public ScieteClient(Integer id, String nom, String telephone, String email, String adresse, List<Client> clientList) {
		super();
		this.id = id;
		this.nom = nom;
		this.telephone = telephone;
		this.email = email;
		this.adresse = adresse;
		this.clientList = clientList;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public List<Client> getClientList() {
		return clientList;
	}

	public void setClientList(List<Client> clientList) {
		this.clientList = clientList;
	}

	@Override
	public String toString() {
		return "ScieteClient [id=" + id + ", nom=" + nom + ", telephone=" + telephone + ", email=" + email
				+ ", adresse=" + adresse + ", clientList=" + clientList + "]";
	}
    
	
    





}