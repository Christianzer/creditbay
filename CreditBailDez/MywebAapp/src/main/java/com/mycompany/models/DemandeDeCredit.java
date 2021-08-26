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
public class DemandeDeCredit{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String numBonCommande;
    private Double qteCom;
    private Date dateCom;


    @ManyToOne
    @JoinColumn(name = "marqueId",insertable=false,updatable=false)
    private Client client;
    private int clientId;


    @ManyToOne
    @JoinColumn(name = "materielId",insertable=false,updatable=false)
    private Materiel materiel;
    private int materielId;
    
   
	public DemandeDeCredit() {
		// TODO Auto-generated constructor stub
	}


	public DemandeDeCredit(Integer id, String numBonCommande, Double qteCom, Date dateCom, Client client, Integer clientId,
			Materiel materiel, Integer materielId) {
		this.id = id;
		this.numBonCommande = numBonCommande;
		this.qteCom = qteCom;
		this.dateCom = dateCom;
		this.client = client;
		this.clientId = clientId;
		this.materiel = materiel;
		this.materielId = materielId;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNumBonCommande() {
		return numBonCommande;
	}


	public void setNumBonCommande(String numBonCommande) {
		this.numBonCommande = numBonCommande;
	}


	public Double getQteCom() {
		return qteCom;
	}


	public void setQteCom(Double qteCom) {
		this.qteCom = qteCom;
	}


	public Date getDateCom() {
		return dateCom;
	}


	public void setDateCom(Date dateCom) {
		this.dateCom = dateCom;
	}


	public Client getClient() {
		return client;
	}


	public void setClient(Client client) {
		this.client = client;
	}


	public Integer getClientId() {
		return clientId;
	}


	public void setClientId(int clientId) {
		this.clientId = clientId;
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


	@Override
	public String toString() {
		return "Commande [id=" + id + ", numBonCommande=" + numBonCommande + ", qteCom=" + qteCom + ", dateCom="
				+ dateCom + ", client=" + client + ", clientId=" + clientId + ", materiel=" + materiel + ", materielId="
				+ materielId + "]";
	}
	
	
    
	
    


}