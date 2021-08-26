package com.mycompany.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;


import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
@JsonIdentityInfo(generator= ObjectIdGenerators.PropertyGenerator.class,property="id")
public class Encaisser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date dateEncaissement;
    private String numeroCompte;
    private Double montant;


    @ManyToOne
    @JoinColumn(name = "agentId",insertable=false,updatable=false)
    private Agent agent;
    private Integer agentId;

    @ManyToOne
    @JoinColumn(name = "clientId",insertable=false,updatable=false)
    private Client client;
    private Integer clientId;

    @ManyToOne
    @JoinColumn(name = "contratId",insertable=false,updatable=false)
    private Contrat contrat;
    private Integer contratId;
    
   
    
    
	public Encaisser() {
		// TODO Auto-generated constructor stub
	}
	public Encaisser(Integer id, Date dateEncaissement, String numeroCompte, Double montant, Agent agent, Integer agentId,
			Client client, Integer clientId, Contrat contrat, Integer contratId) {
		super();
		this.id = id;
		this.dateEncaissement = dateEncaissement;
		this.numeroCompte = numeroCompte;
		this.montant = montant;
		this.agent = agent;
		this.agentId = agentId;
		this.client = client;
		this.clientId = clientId;
		this.contrat = contrat;
		this.contratId = contratId;
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
	 * @return the dateEncaissement
	 */
	public Date getDateEncaissement() {
		return dateEncaissement;
	}
	/**
	 * @param dateEncaissement the dateEncaissement to set
	 */
	public void setDateEncaissement(Date dateEncaissement) {
		this.dateEncaissement = dateEncaissement;
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
		return "Encaisser [id=" + id + ", dateEncaissement=" + dateEncaissement + ", numeroCompte=" + numeroCompte
				+ ", montant=" + montant + ", agent=" + agent + ", agentId=" + agentId + ", client=" + client
				+ ", clientId=" + clientId + ", contrat=" + contrat + ", contratId=" + contratId + "]";
	}
    
    




}

