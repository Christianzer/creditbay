package com.mycompany.models;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;


import java.util.List;


@Entity

@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class,property="id")
public class OptionAchat {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String libelle;

	@OneToMany(mappedBy = "optionAchat")
	private List<Contrat> contratList;

	public OptionAchat() {
		// TODO Auto-generated constructor stub
	}

	public OptionAchat(Integer id, String libelle, List<Contrat> contratList) {
		super();
		this.id = id;
		this.libelle = libelle;
		this.contratList = contratList;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the libelle
	 */
	public String getLibelle() {
		return libelle;
	}

	/**
	 * @param libelle the libelle to set
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	/**
	 * @return the contratList
	 */
	public List<Contrat> getContratList() {
		return contratList;
	}

	/**
	 * @param contratList the contratList to set
	 */
	public void setContratList(List<Contrat> contratList) {
		this.contratList = contratList;
	}

	@Override
	public String toString() {
		return "OptionAchat [id=" + id + ", libelle=" + libelle + ", contratList=" + contratList + "]";
	}
	
	

}