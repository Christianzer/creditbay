package com.mycompany.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@JsonIdentityInfo(generator= ObjectIdGenerators.PropertyGenerator.class)
public class Rattacher{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

    @ManyToOne
    @JoinColumn(name = "traitementsId",insertable=false,updatable=false)
    private Traitements traitements;
    private Integer traitementsId;
    
    @ManyToOne
    @JoinColumn(name = "groupeUtilisateurId",insertable=false,updatable=false)
    private GroupeUtilisateur groupeUtilisateur;
    private Integer groupeUtilisateurId;

    @ManyToOne
    @JoinColumn(name = "utilisateurId",insertable=false,updatable=false)
    private Utilisateur utilisateur;
    private Integer utilisateurId;
    
	public Rattacher() {
		// TODO Auto-generated constructor stub
	}

	public Rattacher(Integer id,Traitements traitements, Integer traitementsId, GroupeUtilisateur groupeUtilisateur,
			Integer groupeUtilisateurId, Utilisateur utilisateur, Integer utilisateurId) {
		this.id =id;
		this.traitements = traitements;
		this.traitementsId = traitementsId;
		this.groupeUtilisateur = groupeUtilisateur;
		this.groupeUtilisateurId = groupeUtilisateurId;
		this.utilisateur = utilisateur;
		this.utilisateurId = utilisateurId;
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
	 * @return the traitements
	 */
	public Traitements getTraitements() {
		return traitements;
	}

	/**
	 * @param traitements the traitements to set
	 */
	public void setTraitements(Traitements traitements) {
		this.traitements = traitements;
	}

	/**
	 * @return the traitementsId
	 */
	public Integer getTraitementsId() {
		return traitementsId;
	}

	/**
	 * @param traitementsId the traitementsId to set
	 */
	public void setTraitementsId(Integer traitementsId) {
		this.traitementsId = traitementsId;
	}

	/**
	 * @return the groupeUtilisateur
	 */
	public GroupeUtilisateur getGroupeUtilisateur() {
		return groupeUtilisateur;
	}

	/**
	 * @param groupeUtilisateur the groupeUtilisateur to set
	 */
	public void setGroupeUtilisateur(GroupeUtilisateur groupeUtilisateur) {
		this.groupeUtilisateur = groupeUtilisateur;
	}

	/**
	 * @return the groupeUtilisateurId
	 */
	public Integer getGroupeUtilisateurId() {
		return groupeUtilisateurId;
	}

	/**
	 * @param groupeUtilisateurId the groupeUtilisateurId to set
	 */
	public void setGroupeUtilisateurId(Integer groupeUtilisateurId) {
		this.groupeUtilisateurId = groupeUtilisateurId;
	}

	/**
	 * @return the utilisateur
	 */
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	/**
	 * @param utilisateur the utilisateur to set
	 */
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	/**
	 * @return the utilisateurId
	 */
	public Integer getUtilisateurId() {
		return utilisateurId;
	}

	/**
	 * @param utilisateurId the utilisateurId to set
	 */
	public void setUtilisateurId(Integer utilisateurId) {
		this.utilisateurId = utilisateurId;
	}

	@Override
	public String toString() {
		return "Rattacher [id=" + id + ", traitements=" + traitements + ", traitementsId=" + traitementsId
				+ ", groupeUtilisateur=" + groupeUtilisateur + ", groupeUtilisateurId=" + groupeUtilisateurId
				+ ", utilisateur=" + utilisateur + ", utilisateurId=" + utilisateurId + "]";
	}

	
    
    


}
