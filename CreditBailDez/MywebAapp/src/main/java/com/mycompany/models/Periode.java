package com.mycompany.models;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;


import java.util.List;

@Entity
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class,property="id")
public class Periode {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String libelle;

	@OneToMany(mappedBy = "periode")
	private List<Contrat> contratList;

	public Periode() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Periode(Integer id, String libelle, List<Contrat> contratList) {
		super();
		this.id = id;
		this.libelle = libelle;
		this.contratList = contratList;
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

	public List<Contrat> getContratList() {
		return contratList;
	}

	public void setContratList(List<Contrat> contratList) {
		this.contratList = contratList;
	}

	@Override
	public String toString() {
		return "Periode [id=" + id + ", libelle=" + libelle + ", contratList=" + contratList + "]";
	}
	
	

}