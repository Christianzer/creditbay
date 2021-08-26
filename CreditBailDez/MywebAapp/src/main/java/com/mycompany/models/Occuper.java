package com.mycompany.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;


import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
@JsonIdentityInfo(generator= ObjectIdGenerators.PropertyGenerator.class,property="id")
public class Occuper{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date datePriseDeFonction;


    @ManyToOne
    @JoinColumn(name = "fonctionId",insertable=false,updatable=false)
    private Fonction fonction;
    private Integer fonctionId;


    @ManyToOne
    @JoinColumn(name = "agentId",insertable=false,updatable=false)
    private Agent agent;
    private Integer agentId;
    
	public Occuper() {
		// TODO Auto-generated constructor stub
	}
	public Occuper(Integer id, Date datePriseDeFonction, Fonction fonction, Integer fonctionId, Agent agent, Integer agentId) {
		super();
		this.id = id;
		this.datePriseDeFonction = datePriseDeFonction;
		this.fonction = fonction;
		this.fonctionId = fonctionId;
		this.agent = agent;
		this.agentId = agentId;
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
	 * @return the datePriseDeFonction
	 */
	public Date getDatePriseDeFonction() {
		return datePriseDeFonction;
	}
	/**
	 * @param datePriseDeFonction the datePriseDeFonction to set
	 */
	public void setDatePriseDeFonction(Date datePriseDeFonction) {
		this.datePriseDeFonction = datePriseDeFonction;
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
	@Override
	public String toString() {
		return "Occuper [id=" + id + ", datePriseDeFonction=" + datePriseDeFonction + ", fonction=" + fonction
				+ ", fonctionId=" + fonctionId + ", agent=" + agent + ", agentId=" + agentId + "]";
	}
    
    


}

