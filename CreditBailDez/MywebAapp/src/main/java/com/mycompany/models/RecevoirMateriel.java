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
@JsonIdentityInfo(generator= ObjectIdGenerators.PropertyGenerator.class)
public class RecevoirMateriel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date dateAcquisition;


    @ManyToOne
    @JoinColumn(name = "clientId",insertable=false,updatable=false)
    private Client client;
    private Integer clientId;


    @ManyToOne
    @JoinColumn(name = "materielId",insertable=false,updatable=false)
    private Materiel materiel;
    private Integer materielId;
	public RecevoirMateriel() {
		// TODO Auto-generated constructor stub
	}
	public RecevoirMateriel(Integer id, Date dateAcquisition, Client client, Integer clientId, Materiel materiel,
			Integer materielId) {
		super();
		this.id = id;
		this.dateAcquisition = dateAcquisition;
		this.client = client;
		this.clientId = clientId;
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
	 * @return the dateAcquisition
	 */
	public Date getDateAcquisition() {
		return dateAcquisition;
	}
	/**
	 * @param dateAcquisition the dateAcquisition to set
	 */
	public void setDateAcquisition(Date dateAcquisition) {
		this.dateAcquisition = dateAcquisition;
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
		return "RecevoirMateriel [id=" + id + ", dateAcquisition=" + dateAcquisition + ", client=" + client
				+ ", clientId=" + clientId + ", materiel=" + materiel + ", materielId=" + materielId + "]";
	}
    
    
    
    
}
