package com.mycompany.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;


import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

@Entity
@JsonIdentityInfo(generator= ObjectIdGenerators.PropertyGenerator.class,property="id")
public class Contrat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String numero;
    private Double montant;
    
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date dateSignature;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date datefincontrat;


    @ManyToOne
    @JoinColumn(name = "periodeId",insertable=false,updatable=false)
    private Periode periode;
    private Integer periodeId;

    @ManyToOne
    @JoinColumn(name = "clientId",insertable=false,updatable=false)
    private Client client;
    private Integer clientId;

    @ManyToOne
    @JoinColumn(name = "optionAchatId",insertable=false,updatable=false)
    private OptionAchat optionAchat;
    private int optionAchatId;

    @ManyToOne
    @JoinColumn(name = "agentId",insertable=false,updatable=false)
    private Agent agent;
    private Integer agentId;

    @ManyToOne
    @JoinColumn(name = "materielId",insertable=false,updatable=false)
    private Materiel materiel;
    private Integer materielId;

    @OneToMany(mappedBy = "contrat")
    private List<Prelever> preleverList;

    @OneToMany(mappedBy = "contrat")
    private List<Versement> verserList;

    @OneToMany(mappedBy = "contrat")
    private List<Encaisser> encaisserList;

	public Contrat() {
		// TODO Auto-generated constructor stub
	}

	public Contrat(Integer id, String numero, Date dateSignature, Date datefincontrat,Double montant, Periode periode, Integer periodeId,
			Client client, Integer clientId, OptionAchat optionAchat, Integer optionAchatId, Agent agent, Integer agentId,
			Materiel materiel, Integer materielId, List<Prelever> preleverList, List<Versement> verserList,
			List<Encaisser> encaisserList) {
		super();
		this.id = id;
		this.numero = numero;
		this.dateSignature = dateSignature;
		this.datefincontrat = datefincontrat;
		this.montant=montant;
		this.periode = periode;
		this.periodeId = periodeId;
		this.client = client;
		this.clientId = clientId;
		this.optionAchat = optionAchat;
		this.optionAchatId = optionAchatId;
		this.agent = agent;
		this.agentId = agentId;
		this.materiel = materiel;
		this.materielId = materielId;
		this.preleverList = preleverList;
		this.verserList = verserList;
		this.encaisserList = encaisserList;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Date getDateSignature() {
		return dateSignature;
	}

	public void setDateSignature(Date dateSignature) {
		this.dateSignature = dateSignature;
	}

	public Date getDatefincontrat() {
		return datefincontrat;
	}

	public void setDatefincontrat(Date datefincontrat) {
		this.datefincontrat = datefincontrat;
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
	 * @param optionAchatId the optionAchatId to set
	 */
	public void setOptionAchatId(int optionAchatId) {
		this.optionAchatId = optionAchatId;
	}

	/**
	 * @param agentId the agentId to set
	 */
	public void setAgentId(Integer agentId) {
		this.agentId = agentId;
	}

	public Periode getPeriode() {
		return periode;
	}

	public void setPeriode(Periode periode) {
		this.periode = periode;
	}

	public Integer getPeriodeId() {
		return periodeId;
	}

	public void setPeriodeId(Integer periodeId) {
		this.periodeId = periodeId;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public int getClientId() {
		return clientId;
	}

	public void setClientId(Integer clientId) {
		this.clientId = clientId;
	}

	public OptionAchat getOptionAchat() {
		return optionAchat;
	}

	public void setOptionAchat(OptionAchat optionAchat) {
		this.optionAchat = optionAchat;
	}

	public int getOptionAchatId() {
		return optionAchatId;
	}

	public void setOptionAchatId(Integer optionAchatId) {
		this.optionAchatId = optionAchatId;
	}

	public Agent getAgent() {
		return agent;
	}

	public void setAgent(Agent agent) {
		this.agent = agent;
	}

	public Integer getAgentId() {
		return agentId;
	}

	public void setAgentId(int agentId) {
		this.agentId = agentId;
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

	public List<Prelever> getPreleverList() {
		return preleverList;
	}

	public void setPreleverList(List<Prelever> preleverList) {
		this.preleverList = preleverList;
	}

	public List<Versement> getVerserList() {
		return verserList;
	}

	public void setVerserList(List<Versement> verserList) {
		this.verserList = verserList;
	}

	public List<Encaisser> getEncaisserList() {
		return encaisserList;
	}

	public void setEncaisserList(List<Encaisser> encaisserList) {
		this.encaisserList = encaisserList;
	}

	@Override
	public String toString() {
		return "Contrat [id=" + id + ", numero=" + numero + ", dateSignature=" + dateSignature + ", datefincontrat="
				+ datefincontrat + ", montant=" + montant + ", periode=" + periode + ", periodeId=" + periodeId
				+ ", client=" + client + ", clientId=" + clientId + ", optionAchat=" + optionAchat + ", optionAchatId="
				+ optionAchatId + ", agent=" + agent + ", agentId=" + agentId + ", materiel=" + materiel
				+ ", materielId=" + materielId + ", preleverList=" + preleverList + ", verserList=" + verserList
				+ ", encaisserList=" + encaisserList + "]";
	}

	
    
    




}
