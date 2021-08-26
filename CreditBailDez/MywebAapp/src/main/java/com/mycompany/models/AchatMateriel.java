package com.mycompany.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;


import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;


@Entity

@JsonIdentityInfo(generator= ObjectIdGenerators.PropertyGenerator.class,property="id")
public class AchatMateriel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String numeroFacture;
    private Integer quantite;
    private Double prixunitaire;
    
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date dateAchat;
    


    @ManyToOne
    @JoinColumn(name = "fournisseurId",insertable=false,updatable=false)
    private Fournisseur fournisseur;
    private int fournisseurId;

    @ManyToOne
    @JoinColumn(name = "materielId",insertable=false,updatable=false)
    private Materiel materiel;
    private Integer materielId;


    @ManyToOne
    @JoinColumn(name = "agentId",insertable=false,updatable=false)
    private Agent agent;
    private Integer agentId;
    
	public AchatMateriel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AchatMateriel(Integer id, String numeroFacture, Integer quantite, Date dateAchat, Double prixunitaire,
			Fournisseur fournisseur, Integer fournisseurId, Materiel materiel, Integer materielId, Agent agent, Integer agentId) {
		super();
		this.id = id;
		this.numeroFacture = numeroFacture;
		this.quantite = quantite;
		this.dateAchat = dateAchat;
		this.prixunitaire = prixunitaire;
		this.fournisseur = fournisseur;
		this.fournisseurId = fournisseurId;
		this.materiel = materiel;
		this.materielId = materielId;
		this.agent = agent;
		this.agentId = agentId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumeroFacture() {
		return numeroFacture;
	}

	public void setNumeroFacture(String numeroFacture) {
		this.numeroFacture = numeroFacture;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(Integer quantite) {
		this.quantite = quantite;
	}

	public Date getDateAchat() {
		return dateAchat;
	}

	public void setDateAchat(Date dateAchat) {
		this.dateAchat = dateAchat;
	}

	public Double getPrixunitaire() {
		return prixunitaire;
	}

	public void setPrixunitaire(Double prixunitaire) {
		this.prixunitaire = prixunitaire;
	}

	public Fournisseur getFournisseur() {
		return fournisseur;
	}

	public void setFournisseur(Fournisseur fournisseur) {
		this.fournisseur = fournisseur;
	}

	public Integer getFournisseurId() {
		return fournisseurId;
	}

	public void setFournisseurId(Integer fournisseurId) {
		this.fournisseurId = fournisseurId;
	}

	public Materiel getMateriel() {
		return materiel;
	}

	public void setMateriel(Materiel materiel) {
		this.materiel = materiel;
	}

	public Integer getMaterielId() {
		return materielId;
	}

	public void setMaterielId(Integer materielId) {
		this.materielId = materielId;
	}

	public Agent getAgent() {
		return agent;
	}

	public void setAgent(Agent agent) {
		this.agent = agent;
	}

	public int getAgentId() {
		return agentId;
	}

	public void setAgentId(Integer agentId) {
		this.agentId = agentId;
	}

	@Override
	public String toString() {
		return "AchatMateriel [id=" + id + ", numeroFacture=" + numeroFacture + ", quantite=" + quantite
				+ ", dateAchat=" + dateAchat + ", prixunitaire=" + prixunitaire + ", fournisseur=" + fournisseur
				+ ", fournisseurId=" + fournisseurId + ", materiel=" + materiel + ", materielId=" + materielId
				+ ", agent=" + agent + ", agentId=" + agentId + "]";
	}

    
	

}

