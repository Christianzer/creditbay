package com.mycompany.models;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;

@Entity
@JsonIdentityInfo(generator= ObjectIdGenerators.PropertyGenerator.class,property="id")
public class SocieteAcquereuse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nom;
    private String type;
    private String sigle;
    private String couleur;
    private String telephone;
    private String email;
    private String adresse;
    private String logo;

        

	public SocieteAcquereuse() {
		// TODO Auto-generated constructor stub
	}

	public SocieteAcquereuse(Integer id, String nom, String type, String sigle, String couleur, String telephone,
			String email, String adresse, String logo
			) {
		super();
		this.id = id;
		this.nom = nom;
		this.type = type;
		this.sigle = sigle;
		this.couleur = couleur;
		this.telephone = telephone;
		this.email = email;
		this.adresse = adresse;
		this.logo = logo;
		
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
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	
	
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the sigle
	 */
	public String getSigle() {
		return sigle;
	}

	/**
	 * @param sigle the sigle to set
	 */
	public void setSigle(String sigle) {
		this.sigle = sigle;
	}

	/**
	 * @return the couleur
	 */
	public String getCouleur() {
		return couleur;
	}

	/**
	 * @param couleur the couleur to set
	 */
	public void setCouleur(String couleur) {
		this.couleur = couleur;
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
	 * @return the logo
	 */
	public String getLogo() {
		return logo;
	}

	/**
	 * @param logo the logo to set
	 */
	public void setLogo(String logo) {
		this.logo = logo;
	}

	@Override
	public String toString() {
		return "SocieteAcquereuse [id=" + id + ", nom=" + nom + ", type=" + type + ", sigle=" + sigle + ", couleur="
				+ couleur + ", telephone=" + telephone + ", email=" + email + ", adresse=" + adresse + ", logo=" + logo
				+ "]";
	}

	

	
    
    




}