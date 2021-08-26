package com.mycompany.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@JsonIdentityInfo(generator= ObjectIdGenerators.PropertyGenerator.class,property="id")
public class AvoirEtat{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date dateEtat;


    @ManyToOne
    @JoinColumn(name = "etatmaterielId",insertable=false,updatable=false)
    private EtatMateriel etatmateriel;
    private Integer etatmaterielId;


    @ManyToOne
    @JoinColumn(name = "materielId",insertable=false,updatable=false)
    private Materiel materiel;
    private Integer materielId;
	public AvoirEtat() {
		// TODO Auto-generated constructor stub
	}
	public AvoirEtat(Integer id, Date dateEtat, EtatMateriel etatmateriel, Integer etatmaterielId, Materiel materiel,
			Integer materielId) {
		super();
		this.id = id;
		this.dateEtat = dateEtat;
		this.etatmateriel = etatmateriel;
		this.etatmaterielId = etatmaterielId;
		this.materiel = materiel;
		this.materielId = materielId;
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
	 * @return the dateEtat
	 */
	public Date getDateEtat() {
		return dateEtat;
	}
	/**
	 * @param dateEtat the dateEtat to set
	 */
	public void setDateEtat(Date dateEtat) {
		this.dateEtat = dateEtat;
	}
	/**
	 * @return the etatmateriel
	 */
	public EtatMateriel getEtatmateriel() {
		return etatmateriel;
	}
	/**
	 * @param etatmateriel the etatmateriel to set
	 */
	public void setEtatmateriel(EtatMateriel etatmateriel) {
		this.etatmateriel = etatmateriel;
	}
	/**
	 * @return the etatmaterielId
	 */
	public Integer getEtatmaterielId() {
		return etatmaterielId;
	}
	/**
	 * @param etatmaterielId the etatmaterielId to set
	 */
	public void setEtatmaterielId(Integer etatmaterielId) {
		this.etatmaterielId = etatmaterielId;
	}
	/**
	 * @return the materiel
	 */
	public Materiel getMateriel() {
		return materiel;
	}
	/**
	 * @param materiel the materiel to set
	 */
	public void setMateriel(Materiel materiel) {
		this.materiel = materiel;
	}
	/**
	 * @return the materielId
	 */
	public Integer getMaterielId() {
		return materielId;
	}
	/**
	 * @param materielId the materielId to set
	 */
	public void setMaterielId(Integer materielId) {
		this.materielId = materielId;
	}
	@Override
	public String toString() {
		return "AvoirEtat [id=" + id + ", dateEtat=" + dateEtat + ", etatmateriel=" + etatmateriel + ", etatmaterielId="
				+ etatmaterielId + ", materiel=" + materiel + ", materielId=" + materielId + "]";
	}
    
    
    

}
