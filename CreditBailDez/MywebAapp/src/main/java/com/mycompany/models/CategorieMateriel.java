package com.mycompany.models;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;


import java.util.List;

@Entity

@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class,property="id")
public class CategorieMateriel {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	private Integer id;
	private String libelle;

	@OneToMany(mappedBy = "categorieMateriel")
	private List<Materiel> materielList;

	public CategorieMateriel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CategorieMateriel(Integer id, String libelle, List<Materiel> materielList) {
		super();
		this.id = id;
		this.libelle = libelle;
		this.materielList = materielList;
	}

	public Integer getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public List<Materiel> getMaterielList() {
		return materielList;
	}

	public void setMaterielList(List<Materiel> materielList) {
		this.materielList = materielList;
	}

	@Override
	public String toString() {
		return "CategorieMateriel [id=" + id + ", libelle=" + libelle + ", materielList=" + materielList + "]";
	}

	
}
