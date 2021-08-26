package com.mycompany.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;


import javax.persistence.*;
import java.util.List;

@Entity
@JsonIdentityInfo(generator= ObjectIdGenerators.PropertyGenerator.class,property="id")
public class Client{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nom;
    private String prenom;
    private String telephone;
    private String email;
    private String adresse;
    

    @ManyToOne
    @JoinColumn(name = "scieteClientId",insertable=false,updatable=false)
    private ScieteClient scieteClient;
    private int scieteClientId;

    @ManyToOne
    @JoinColumn(name = "genreId",insertable=false,updatable=false)
    private Genre genre;
    private Integer genreId;

    @ManyToOne
    @JoinColumn(name = "situationMatrimonialeId",insertable=false,updatable=false)
    private SituationMatrimoniale situationMatrimoniale;
    private Integer situationMatrimonialeId;

   

    @OneToMany(mappedBy = "client")
    private List<Contrat> contratList;

    @OneToMany(mappedBy = "client")
    private List<Encaisser> encaisserList;

    @OneToMany(mappedBy = "client")
    private List<Prelever> preleverList;
    
    @OneToMany(mappedBy = "client")
    private List<DemandeDeCredit> commandeList;

	
	public Client() {
		// TODO Auto-generated constructor stub
	}

	public Client(Integer id, String nom, String prenom, String telephone, String email, String adresse,
			ScieteClient scieteClient, Integer scieteClientId, Genre genre, Integer genreId,
			SituationMatrimoniale situationMatrimoniale, Integer situationMatrimonialeId, 
			List<Contrat> contratList, List<Encaisser> encaisserList, List<Prelever> preleverList,List<DemandeDeCredit> commandeList) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.telephone = telephone;
		this.email = email;
		this.adresse = adresse;
		this.scieteClient = scieteClient;
		this.scieteClientId = scieteClientId;
		this.genre = genre;
		this.genreId = genreId;
		this.situationMatrimoniale = situationMatrimoniale;
		this.situationMatrimonialeId = situationMatrimonialeId;
		this.contratList = contratList;
		this.encaisserList = encaisserList;
		this.preleverList = preleverList;
		this.commandeList=commandeList;
	}

	public Integer getId() {
		return id;
	}

	public void setId(int id) {
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

	public ScieteClient getScieteClient() {
		return scieteClient;
	}

	public void setScieteClient(ScieteClient scieteClient) {
		this.scieteClient = scieteClient;
	}

	public Integer getScieteClientId() {
		return scieteClientId;
	}

	public void setScieteClientId(Integer scieteClientId) {
		this.scieteClientId = scieteClientId;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public int getGenreId() {
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

	public int getSituationMatrimonialeId() {
		return situationMatrimonialeId;
	}

	public void setSituationMatrimonialeId(Integer situationMatrimonialeId) {
		this.situationMatrimonialeId = situationMatrimonialeId;
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

	public List<Prelever> getPreleverList() {
		return preleverList;
	}

	public void setPreleverList(List<Prelever> preleverList) {
		this.preleverList = preleverList;
	}
	
	

	/**
	 * @return the commandeList
	 */
	public List<DemandeDeCredit> getCommandeList() {
		return commandeList;
	}

	/**
	 * @param commandeList the commandeList to set
	 */
	public void setCommandeList(List<DemandeDeCredit> commandeList) {
		this.commandeList = commandeList;
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", telephone=" + telephone + ", email="
				+ email + ", adresse=" + adresse + ", scieteClient=" + scieteClient + ", scieteClientId="
				+ scieteClientId + ", genre=" + genre + ", genreId=" + genreId + ", situationMatrimoniale="
				+ situationMatrimoniale + ", situationMatrimonialeId=" + situationMatrimonialeId + 
				 ", contratList=" + contratList + ", encaisserList=" + encaisserList
				+ ", preleverList=" + preleverList + ", commandeList=" + commandeList + "]";
	}

	
}
    
    


