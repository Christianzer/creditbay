package com.mycompany.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class,property="id")
public class MessageErreurs {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String libelle;


	public MessageErreurs() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MessageErreurs(Integer id, String libelle) {
		super();
		this.id = id;
		this.libelle = libelle;
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	

	@Override
	public String toString() {
		return "MessageErreurs [id=" + id + ", libelle=" + libelle;
	}
}
