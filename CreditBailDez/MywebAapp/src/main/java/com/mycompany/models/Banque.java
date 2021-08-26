package com.mycompany.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;


import javax.persistence.*;
import java.util.List;

@Entity
@JsonIdentityInfo(generator= ObjectIdGenerators.PropertyGenerator.class,property="id")
public class Banque {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nom;
    private String sigle;
    private String couleur;
    private String telephone;
    private String email;
    private String adresse;
    private String logo;


      
    @OneToMany(mappedBy = "banque")
    private List<Prelever> preleverList;
    
    @OneToMany(mappedBy = "banque")
    private List<Versement> versementList;

	public Banque() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Banque(Integer id, String nom, String sigle, String couleur, String telephone, String email, String adresse,
			String logo, 
			List<Prelever> preleverList,List<Versement> versementList) {
		super();
		this.id = id;
		this.nom = nom;
		this.sigle = sigle;
		this.couleur = couleur;
		this.telephone = telephone;
		this.email = email;
		this.adresse = adresse;
		this.logo = logo;
		this.preleverList = preleverList;
		this.versementList = versementList;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getSigle() {
		return sigle;
	}

	public void setSigle(String sigle) {
		this.sigle = sigle;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

		
	public List<Prelever> getPreleverList() {
		return preleverList;
	}

	public void setPreleverList(List<Prelever> preleverList) {
		this.preleverList = preleverList;
	}
	
	

	/**
	 * @return the versementList
	 */
	public List<Versement> getVersementList() {
		return versementList;
	}

	/**
	 * @param versementList the versementList to set
	 */
	public void setVersementList(List<Versement> versementList) {
		this.versementList = versementList;
	}

	@Override
	public String toString() {
		return "Banque [id=" + id + ", nom=" + nom + ", sigle=" + sigle + ", couleur=" + couleur + ", telephone="
				+ telephone + ", email=" + email + ", adresse=" + adresse + ", logo=" + logo + ", preleverList="
				+ preleverList + ", versementList=" + versementList + "]";
	}

	

	
    

}