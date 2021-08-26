package com.mycompany.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;


import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;


@Entity
@JsonIdentityInfo(generator= ObjectIdGenerators.PropertyGenerator.class,property="id")
public class Formulaire{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nom;
    private String prenom;
   
    private String datenaiss;

    private String profession;
    private String typedepiece;
    private String numpiece;
    private String banque;
    private String refbancaire;

    private String telephone;
    private String email;
    private String adresse;

    private String employeur;

    private String libelle;
    private String typemateriel;
    private String marque;

    private String nomfournisseur;

    private String coutmateriel;
    private Boolean valide;
    
	public Formulaire() {
		super();
	}

	public Formulaire(Integer id, String nom, String prenom, String datenaiss, String profession, String typedepiece,
			String numpiece, String banque, String refbancaire, String telephone, String email, String adresse,
			String employeur, String libelle, String typemateriel, String marque, String nonfournisseur,
			String coutmateriel, Boolean valide) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.datenaiss = datenaiss;
		this.profession = profession;
		this.typedepiece = typedepiece;
		this.numpiece = numpiece;
		this.banque = banque;
		this.refbancaire = refbancaire;
		this.telephone = telephone;
		this.email = email;
		this.adresse = adresse;
		this.employeur = employeur;
		this.libelle = libelle;
		this.typemateriel = typemateriel;
		this.marque = marque;
		this.nomfournisseur = nonfournisseur;
		this.coutmateriel = coutmateriel;
		this.valide = valide;
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
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * @return the datenaiss
	 */
	public String getDatenaiss() {
		return datenaiss;
	}

	/**
	 * @param datenaiss the datenaiss to set
	 */
	public void setDatenaiss(String datenaiss) {
		this.datenaiss = datenaiss;
	}

	/**
	 * @return the profession
	 */
	public String getProfession() {
		return profession;
	}

	/**
	 * @param profession the profession to set
	 */
	public void setProfession(String profession) {
		this.profession = profession;
	}

	/**
	 * @return the typedepiece
	 */
	public String getTypedepiece() {
		return typedepiece;
	}

	/**
	 * @param typedepiece the typedepiece to set
	 */
	public void setTypedepiece(String typedepiece) {
		this.typedepiece = typedepiece;
	}

	/**
	 * @return the numpiece
	 */
	public String getNumpiece() {
		return numpiece;
	}

	/**
	 * @param numpiece the numpiece to set
	 */
	public void setNumpiece(String numpiece) {
		this.numpiece = numpiece;
	}

	/**
	 * @return the banque
	 */
	public String getBanque() {
		return banque;
	}

	/**
	 * @param banque the banque to set
	 */
	public void setBanque(String banque) {
		this.banque = banque;
	}

	/**
	 * @return the refbancaire
	 */
	public String getRefbancaire() {
		return refbancaire;
	}

	/**
	 * @param refbancaire the refbancaire to set
	 */
	public void setRefbancaire(String refbancaire) {
		this.refbancaire = refbancaire;
	}

	/**
	 * @return the telephone
	 */
	public String getTelephone() {
		return telephone;
	}

	/**
	 * @param telephone the telephone to set
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the adresse
	 */
	public String getAdresse() {
		return adresse;
	}

	/**
	 * @param adresse the adresse to set
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	/**
	 * @return the employeur
	 */
	public String getEmployeur() {
		return employeur;
	}

	/**
	 * @param employeur the employeur to set
	 */
	public void setEmployeur(String employeur) {
		this.employeur = employeur;
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
	 * @return the typemateriel
	 */
	public String getTypemateriel() {
		return typemateriel;
	}

	/**
	 * @param typemateriel the typemateriel to set
	 */
	public void setTypemateriel(String typemateriel) {
		this.typemateriel = typemateriel;
	}

	/**
	 * @return the marque
	 */
	public String getMarque() {
		return marque;
	}

	/**
	 * @param marque the marque to set
	 */
	public void setMarque(String marque) {
		this.marque = marque;
	}

	/**
	 * @return the nonfournisseur
	 */
	public String getNonfournisseur() {
		return nomfournisseur;
	}

	/**
	 * @param nonfournisseur the nonfournisseur to set
	 */
	public void setNonfournisseur(String nonfournisseur) {
		this.nomfournisseur = nonfournisseur;
	}

	/**
	 * @return the coutmateriel
	 */
	public String getCoutmateriel() {
		return coutmateriel;
	}

	/**
	 * @param coutmateriel the coutmateriel to set
	 */
	public void setCoutmateriel(String coutmateriel) {
		this.coutmateriel = coutmateriel;
	}

	/**
	 * @return the valide
	 */
	public Boolean getValide() {
		return valide;
	}

	/**
	 * @param valide the valide to set
	 */
	public void setValide(Boolean valide) {
		this.valide = valide;
	}

	
	
}
    
    


