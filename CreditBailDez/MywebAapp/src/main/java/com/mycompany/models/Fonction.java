package com.mycompany.models;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import java.util.List;


@Entity
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class,property="id")
public class Fonction {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String libelle;

	@OneToMany(mappedBy = "fonction")
	private List<Agent> agentList;

	public Fonction() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Fonction(Integer id, String libelle, List<Agent> agentList) {
		super();
		this.id = id;
		this.libelle = libelle;
		this.agentList = agentList;
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

	public List<Agent> getAgentList() {
		return agentList;
	}

	public void setAgentList(List<Agent> agentList) {
		this.agentList = agentList;
	}

	@Override
	public String toString() {
		return "Fonction [id=" + id + ", libelle=" + libelle + ", agentList=" + agentList + "]";
	}
	
	
}