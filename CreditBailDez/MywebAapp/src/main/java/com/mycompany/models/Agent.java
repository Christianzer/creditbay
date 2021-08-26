package com.mycompany.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;


import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

@Entity
@JsonIdentityInfo(generator= ObjectIdGenerators.PropertyGenerator.class,property="id")
public class Agent{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nom;
    private String prenom;
    private String telephone;
    private String email;
    private String adresse;
    
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date datenaiss;


    @ManyToOne
    @JoinColumn(name = "genreId",insertable=false,updatable=false)
    private Genre genre;
    private Integer genreId;

    @ManyToOne
    @JoinColumn(name = "situationMatrimonialeId",insertable=false,updatable=false)
    private SituationMatrimoniale situationMatrimoniale;
    private Integer situationMatrimonialeId;

    @ManyToOne
    @JoinColumn(name = "fonctionId",insertable=false,updatable=false)
    private Fonction fonction;
    private Integer fonctionId;

    @OneToMany(mappedBy = "agent")
    private List<Contrat> contratList;

    @OneToMany(mappedBy = "agent")
    private List<Encaisser> encaisserList;

    @OneToMany(mappedBy = "agent")
    private List<AchatMateriel> achatMaterielList;

	public Agent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Agent(Integer id, String nom, String prenom, Date datenaiss, String telephone, String email, String adresse,
			 Genre genre, Integer genreId,
			SituationMatrimoniale situationMatrimoniale, Integer situationMatrimonialeId, Fonction fonction, Integer fonctionId,
			List<Contrat> contratList, List<Encaisser> encaisserList, List<AchatMateriel> achatMaterielList) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.datenaiss = datenaiss;
		this.telephone = telephone;
		this.email = email;
		this.adresse = adresse;
		this.genre = genre;
		this.genreId = genreId;
		this.situationMatrimoniale = situationMatrimoniale;
		this.situationMatrimonialeId = situationMatrimonialeId;
		this.fonction = fonction;
		this.fonctionId = fonctionId;
		this.contratList = contratList;
		this.encaisserList = encaisserList;
		this.achatMaterielList = achatMaterielList;
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

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Date getDatenaiss() {
		return datenaiss;
	}

	public void setDatenaiss(Date datenaiss) {
		this.datenaiss = datenaiss;
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

	
	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public Integer getGenreId() {
		return genreId;
	}

	public void setGenreId(Integer genreId) {
		this.genreId = genreId;
	}

	public SituationMatrimoniale getSituationMatrimoniale() {
		return situationMatrimoniale;
	}

	public void setSituationMatrimoniale(SituationMatrimoniale situationMatrimoniale) {
		this.situationMatrimoniale = situationMatrimoniale;
	}

	public Integer getSituationMatrimonialeId() {
		return situationMatrimonialeId;
	}

	public void setSituationMatrimonialeId(Integer situationMatrimonialeId) {
		this.situationMatrimonialeId = situationMatrimonialeId;
	}

	public Fonction getFonction() {
		return fonction;
	}

	public void setFonction(Fonction fonction) {
		this.fonction = fonction;
	}

	public Integer getFonctionId() {
		return fonctionId;
	}

	public void setFonctionId(Integer fonctionId) {
		this.fonctionId = fonctionId;
	}

	public List<Contrat> getContratList() {
		return contratList;
	}

	public void setContratList(List<Contrat> contratList) {
		this.contratList = contratList;
	}

	public List<Encaisser> getEncaisserList() {
		return encaisserList;
	}

	public void setEncaisserList(List<Encaisser> encaisserList) {
		this.encaisserList = encaisserList;
	}

	public List<AchatMateriel> getAchatMaterielList() {
		return achatMaterielList;
	}

	public void setAchatMaterielList(List<AchatMateriel> achatMaterielList) {
		this.achatMaterielList = achatMaterielList;
	}

	@Override
	public String toString() {
		return "Agent [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", datenaiss=" + datenaiss + ", telephone="
				+ telephone + ", email=" + email + ", adresse=" + adresse + 
				 ", genre=" + genre + ", genreId=" + genreId
				+ ", situationMatrimoniale=" + situationMatrimoniale + ", situationMatrimonialeId="
				+ situationMatrimonialeId + ", fonction=" + fonction + ", fonctionId=" + fonctionId + ", contratList="
				+ contratList + ", encaisserList=" + encaisserList + ", achatMaterielList=" + achatMaterielList + "]";
	}


    


}
