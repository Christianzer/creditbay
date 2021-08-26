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
@JsonIdentityInfo(generator= ObjectIdGenerators.PropertyGenerator.class,property="id")
public class GroupeUtilisateur{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nom;
    private String motdepassgroup;
    private Date datecrea;
    
    @ManyToOne
    @JoinColumn(name = "niveauAccesId",insertable=false,updatable=false)
    private NiveauAcces niveauAcces;
    private Integer niveauAccesId;
    
	public GroupeUtilisateur() {
		// TODO Auto-generated constructor stub
	}

	
	public GroupeUtilisateur(Integer id, String nom, String motdepassgroup, Date datecrea, NiveauAcces niveauAcces,
			Integer niveauAccesId) {
		super();
		this.id = id;
		this.nom = nom;
		this.motdepassgroup = motdepassgroup;
		this.datecrea = datecrea;
		this.niveauAcces = niveauAcces;
		this.niveauAccesId = niveauAccesId;
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
	 * @return the motdepassgroup
	 */
	public String getMotdepassgroup() {
		return motdepassgroup;
	}


	/**
	 * @param motdepassgroup the motdepassgroup to set
	 */
	public void setMotdepassgroup(String motdepassgroup) {
		this.motdepassgroup = motdepassgroup;
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
	 * @return the niveauAcces
	 */
	public NiveauAcces getNiveauAcces() {
		return niveauAcces;
	}


	/**
	 * @param niveauAcces the niveauAcces to set
	 */
	public void setNiveauAcces(NiveauAcces niveauAcces) {
		this.niveauAcces = niveauAcces;
	}


	/**
	 * @return the niveauAccesId
	 */
	public Integer getNiveauAccesId() {
		return niveauAccesId;
	}


	/**
	 * @param niveauAccesId the niveauAccesId to set
	 */
	public void setNiveauAccesId(Integer niveauAccesId) {
		this.niveauAccesId = niveauAccesId;
	}


	@Override
	public String toString() {
		return "GroupeUtilisateur [id=" + id + ", nom=" + nom + ", motdepassgroup=" + motdepassgroup + ", datecrea="
				+ datecrea + ", niveauAcces=" + niveauAcces + ", niveauAccesId=" + niveauAccesId + "]";
	}


	
	
    
}
