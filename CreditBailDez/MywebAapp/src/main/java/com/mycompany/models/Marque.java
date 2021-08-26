package com.mycompany.models;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import java.util.List;

@Entity
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class,property="id")
public class Marque {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String libelle;

	@OneToMany(mappedBy = "marque")
	private List<Materiel> materielList;

	public Marque() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Marque(Integer id, String libelle, List<Materiel> materielList) {
		super();
		this.id = id;
		this.libelle = libelle;
		this.materielList = materielList;
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

	public List<Materiel> getMaterielList() {
		return materielList;
	}

	public void setMaterielList(List<Materiel> materielList) {
		this.materielList = materielList;
	}

	@Override
	public String toString() {
		return "Marque [id=" + id + ", libelle=" + libelle + ", materielList=" + materielList + "]";
	}
	
	

}