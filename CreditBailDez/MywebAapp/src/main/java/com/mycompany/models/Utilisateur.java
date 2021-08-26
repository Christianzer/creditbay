package com.mycompany.models;

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
public class Utilisateur{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nom;
    private String motdepass;
    private Date datecrea;
    

    @ManyToOne
    @JoinColumn(name = "groupeUtilisateurId",insertable=false,updatable=false)
    private GroupeUtilisateur groupeUtilisateur;
    private Integer groupeUtilisateurId;

   
    @ManyToOne
    @JoinColumn(name = "fonctionId",insertable=false,updatable=false)
    private Fonction fonction;
    private Integer fonctionId;
	public Utilisateur() {
		// TODO Auto-generated constructor stub
	}
	public Utilisateur(Integer id, String nom, String motdepass, Date datecrea, GroupeUtilisateur groupeUtilisateur,
			Integer groupeUtilisateurId, Fonction fonction, Integer fonctionId) {
		super();
		this.id = id;
		this.nom = nom;
		this.motdepass = motdepass;
		this.datecrea = datecrea;
		this.groupeUtilisateur = groupeUtilisateur;
		this.groupeUtilisateurId = groupeUtilisateurId;
		this.fonction = fonction;
		this.fonctionId = fonctionId;
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
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * @return the motdepass
	 */
	public String getMotdepass() {
		return motdepass;
	}
	/**
	 * @param motdepass the motdepass to set
	 */
	public void setMotdepass(String motdepass) {
		this.motdepass = motdepass;
	}
	/**
	 * @return the datecrea
	 */
	public Date getDatecrea() {
		return datecrea;
	}
	/**
	 * @param datecrea the datecrea to set
	 */
	public void setDatecrea(Date datecrea) {
		this.datecrea = datecrea;
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
	 * @return the fonction
	 */
	public Fonction getFonction() {
		return fonction;
	}
	/**
	 * @param fonction the fonction to set
	 */
	public void setFonction(Fonction fonction) {
		this.fonction = fonction;
	}
	/**
	 * @return the fonctionId
	 */
	public Integer getFonctionId() {
		return fonctionId;
	}
	/**
	 * @param fonctionId the fonctionId to set
	 */
	public void setFonctionId(Integer fonctionId) {
		this.fonctionId = fonctionId;
	}
	@Override
	public String toString() {
		return "Utilisateur [id=" + id + ", nom=" + nom + ", motdepass=" + motdepass + ", datecrea=" + datecrea
				+ ", groupeUtilisateur=" + groupeUtilisateur + ", groupeUtilisateurId=" + groupeUtilisateurId
				+ ", fonction=" + fonction + ", fonctionId=" + fonctionId + "]";
	}
    
    

}
