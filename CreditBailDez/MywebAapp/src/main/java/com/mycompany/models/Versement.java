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
public class Versement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date dateversement;
    private String numeroCompte;
    private Double montant;


    @ManyToOne
    @JoinColumn(name = "banqueId",insertable=false,updatable=false)
    private Banque banque;
    private Integer banqueId;
    
    @ManyToOne
    @JoinColumn(name = "clientId",insertable=false,updatable=false)
    private Client client;
    private Integer clientId;


    @ManyToOne
    @JoinColumn(name = "agentId",insertable=false,updatable=false)
    private Agent agent;
    private Integer agentId;

    @ManyToOne
    @JoinColumn(name = "contratId",insertable=false,updatable=false)
    private Contrat contrat;
    private Integer contratId;
    
	public Versement() {
		// TODO Auto-generated constructor stub
	}

	public Versement(Integer id, Date dateversement, String numeroCompte, Double montant,Client client, Integer clientId, Banque banque, Integer banqueId,
			Agent agent, Integer agentId, Contrat contrat, Integer contratId) {
		super();
		this.id = id;
		this.dateversement = dateversement;
		this.numeroCompte = numeroCompte;
		this.montant = montant;
		this.banque = banque;
		this.banqueId = banqueId;
		this.agent = agent;
		this.agentId = agentId;
		this.contrat = contrat;
		this.contratId = contratId;
		this.client=client;
		this.clientId=clientId;
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
	 * @return the dateversement
	 */
	public Date getDateversement() {
		return dateversement;
	}

	/**
	 * @param dateversement the dateversement to set
	 */
	public void setDateversement(Date dateversement) {
		this.dateversement = dateversement;
	}

	/**
	 * @return the numeroCompte
	 */
	public String getNumeroCompte() {
		return numeroCompte;
	}

	/**
	 * @param numeroCompte the numeroCompte to set
	 */
	public void setNumeroCompte(String numeroCompte) {
		this.numeroCompte = numeroCompte;
	}

	/**
	 * @return the montant
	 */
	public Double getMontant() {
		return montant;
	}

	/**
	 * @param montant the montant to set
	 */
	public void setMontant(Double montant) {
		this.montant = montant;
	}

	/**
	 * @return the banque
	 */
	public Banque getBanque() {
		return banque;
	}

	/**
	 * @param banque the banque to set
	 */
	public void setBanque(Banque banque) {
		this.banque = banque;
	}

	/**
	 * @return the banqueId
	 */
	public Integer getBanqueId() {
		return banqueId;
	}

	/**
	 * @param banqueId the banqueId to set
	 */
	public void setBanqueId(Integer banqueId) {
		this.banqueId = banqueId;
	}

	

	/**
	 * @return the client
	 */
	public Client getClient() {
		return client;
	}

	/**
	 * @param client the client to set
	 */
	public void setClient(Client client) {
		this.client = client;
	}

	/**
	 * @return the clientId
	 */
	public Integer getClientId() {
		return clientId;
	}

	/**
	 * @param clientId the clientId to set
	 */
	public void setClientId(Integer clientId) {
		this.clientId = clientId;
	}

	/**
	 * @return the agent
	 */
	public Agent getAgent() {
		return agent;
	}

	/**
	 * @param agent the agent to set
	 */
	public void setAgent(Agent agent) {
		this.agent = agent;
	}

	/**
	 * @return the agentId
	 */
	public Integer getAgentId() {
		return agentId;
	}

	/**
	 * @param agentId the agentId to set
	 */
	public void setAgentId(Integer agentId) {
		this.agentId = agentId;
	}

	/**
	 * @return the contrat
	 */
	public Contrat getContrat() {
		return contrat;
	}

	/**
	 * @param contrat the contrat to set
	 */
	public void setContrat(Contrat contrat) {
		this.contrat = contrat;
	}

	/**
	 * @return the contratId
	 */
	public Integer getContratId() {
		return contratId;
	}

	/**
	 * @param contratId the contratId to set
	 */
	public void setContratId(Integer contratId) {
		this.contratId = contratId;
	}

	@Override
	public String toString() {
		return "Versement [id=" + id + ", dateversement=" + dateversement + ", numeroCompte=" + numeroCompte
				+ ", montant=" + montant + ", banque=" + banque + ", banqueId=" + banqueId + ", client=" + client
				+ ", clientId=" + clientId + ", agent=" + agent + ", agentId=" + agentId + ", contrat=" + contrat
				+ ", contratId=" + contratId + "]";
	}

	
	
    
	
    




}
