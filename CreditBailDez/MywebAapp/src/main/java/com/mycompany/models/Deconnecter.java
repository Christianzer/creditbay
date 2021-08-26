package com.mycompany.models;

import java.sql.Time;
import java.util.Date;

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
public class Deconnecter{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Date datedeconnexion;
    private Time heuredeconnexion;
    

    @ManyToOne
    @JoinColumn(name = "traitementsId",insertable=false,updatable=false)
    private Traitements traitements;
    private Integer traitementsId;
    
    @ManyToOne
    @JoinColumn(name = "utilisateurId",insertable=false,updatable=false)
    private Utilisateur utilisateur;
    private Integer utilisateurId;
    
	public Deconnecter() {
		// TODO Auto-generated constructor stub
	}

	public Deconnecter(Integer id,Date datedeconnexion, Time heuredeconnexion, Traitements traitements, Integer traitementsId,
			Utilisateur utilisateur, Integer utilisateurId) {
		this.id=id;
		this.datedeconnexion = datedeconnexion;
		this.heuredeconnexion = heuredeconnexion;
		this.traitements = traitements;
		this.traitementsId = traitementsId;
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
	 * @return the datedeconnexion
	 */
	public Date getDatedeconnexion() {
		return datedeconnexion;
	}

	/**
	 * @param datedeconnexion the datedeconnexion to set
	 */
	public void setDatedeconnexion(Date datedeconnexion) {
		this.datedeconnexion = datedeconnexion;
	}

	/**
	 * @return the heuredeconnexion
	 */
	public Time getHeuredeconnexion() {
		return heuredeconnexion;
	}

	/**
	 * @param heuredeconnexion the heuredeconnexion to set
	 */
	public void setHeuredeconnexion(Time heuredeconnexion) {
		this.heuredeconnexion = heuredeconnexion;
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
		return "Deconnecter [id=" + id + ", datedeconnexion=" + datedeconnexion + ", heuredeconnexion="
				+ heuredeconnexion + ", traitements=" + traitements + ", traitementsId=" + traitementsId
				+ ", utilisateur=" + utilisateur + ", utilisateurId=" + utilisateurId + "]";
	}

	
    
    

}
