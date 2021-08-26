package com.mycompany.models;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;


import java.util.List;

@Entity
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class,property="id")
public class SituationMatrimoniale {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String libelle;

	@OneToMany(mappedBy = "situationMatrimoniale")
	private List<Client> clientList;

	@OneToMany(mappedBy = "situationMatrimoniale")
	private List<Agent> agentList;

	public SituationMatrimoniale() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SituationMatrimoniale(Integer id, String libelle, List<Client> clientList, List<Agent> agentList) {
		super();
		this.id = id;
		this.libelle = libelle;
		this.clientList = clientList;
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

	public List<Client> getClientList() {
		return clientList;
	}

	public void setClientList(List<Client> clientList) {
		this.clientList = clientList;
	}

	public List<Agent> getAgentList() {
		return agentList;
	}

	public void setAgentList(List<Agent> agentList) {
		this.agentList = agentList;
	}

	@Override
	public String toString() {
		return "SituationMatrimoniale [id=" + id + ", libelle=" + libelle + ", clientList=" + clientList
				+ ", agentList=" + agentList + "]";
	}
	
	
}