package com.mycompany.models;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;



@Entity
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class,property="id")
public class EtatMateriel {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	private Integer id;
	private String libelle;
	public EtatMateriel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EtatMateriel(Integer id, String libelle) {
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
		return "EtatMateriel [id=" + id + ", libelle=" + libelle + "]";
	}
	
	

	
}
