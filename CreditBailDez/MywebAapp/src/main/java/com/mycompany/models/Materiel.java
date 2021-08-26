package com.mycompany.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;


import javax.persistence.*;
import java.util.List;

@Entity

@JsonIdentityInfo(generator= ObjectIdGenerators.PropertyGenerator.class,property="id")
public class Materiel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String libelle;
    private String immatriculation;
    private Double prix;
    

    @ManyToOne
    @JoinColumn(name = "fournisseurId",insertable=false,updatable=false)
    private Fournisseur fournisseur;
    private Integer fournisseurId;
    
    @ManyToOne
    @JoinColumn(name = "marqueId",insertable=false,updatable=false)
    private Marque marque;
    private Integer marqueId;


    @ManyToOne
    @JoinColumn(name = "categorieMaterielId",insertable=false,updatable=false)
    private CategorieMateriel categorieMateriel;
    private Integer categorieMaterielId;


    @OneToMany(mappedBy = "materiel")
    private List<Contrat> contratList;

    @OneToMany(mappedBy = "materiel")
    private List<AchatMateriel> achatMaterielList;

	public Materiel() {
		// TODO Auto-generated constructor stub
	}

	public Materiel(Integer id, String libelle, String immatriculation,Double prix, Fournisseur fournisseur,Integer fournisseurId, Marque marque, Integer marqueId,
			CategorieMateriel categorieMateriel, Integer categorieMaterielId, List<Contrat> contratList,
			List<AchatMateriel> achatMaterielList) {
		super();
		this.id = id;
		this.libelle = libelle;
		this.immatriculation = immatriculation;
		this.prix=prix;
		this.fournisseur = fournisseur;
		this.fournisseurId = fournisseurId;
		this.marque = marque;
		this.marqueId = marqueId;
		this.categorieMateriel = categorieMateriel;
		this.categorieMaterielId = categorieMaterielId;
		this.contratList = contratList;
		this.achatMaterielList = achatMaterielList;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getImmatriculation() {
		return immatriculation;
	}

	public void setImmatriculation(String immatriculation) {
		this.immatriculation = immatriculation;
	}
	
	

	/**
	 * @return the prix
	 */
	public Double getPrix() {
		return prix;
	}

	/**
	 * @param prix the prix to set
	 */
	public void setPrix(Double prix) {
		this.prix = prix;
	}

	/**
	 * @return the fournisseur
	 */
	public Fournisseur getFournisseur() {
		return fournisseur;
	}

	/**
	 * @param fournisseur the fournisseur to set
	 */
	public void setFournisseur(Fournisseur fournisseur) {
		this.fournisseur = fournisseur;
	}

	/**
	 * @return the fournisseurId
	 */
	public Integer getFournisseurId() {
		return fournisseurId;
	}

	/**
	 * @param fournisseurId the fournisseurId to set
	 */
	public void setFournisseurId(Integer fournisseurId) {
		this.fournisseurId = fournisseurId;
	}

	public Marque getMarque() {
		return marque;
	}

	public void setMarque(Marque marque) {
		this.marque = marque;
	}

	public Integer getMarqueId() {
		return marqueId;
	}

	public void setMarqueId(Integer marqueId) {
		this.marqueId = marqueId;
	}

	public CategorieMateriel getCategorieMateriel() {
		return categorieMateriel;
	}

	public void setCategorieMateriel(CategorieMateriel categorieMateriel) {
		this.categorieMateriel = categorieMateriel;
	}

	public Integer getCategorieMaterielId() {
		return categorieMaterielId;
	}

	public void setCategorieMaterielId(Integer categorieMaterielId) {
		this.categorieMaterielId = categorieMaterielId;
	}

	public List<Contrat> getContratList() {
		return contratList;
	}

	public void setContratList(List<Contrat> contratList) {
		this.contratList = contratList;
	}

	public List<AchatMateriel> getAchatMaterielList() {
		return achatMaterielList;
	}

	public void setAchatMaterielList(List<AchatMateriel> achatMaterielList) {
		this.achatMaterielList = achatMaterielList;
	}

	@Override
	public String toString() {
		return "Materiel [id=" + id + ", libelle=" + libelle + ", immatriculation=" + immatriculation + ", marque="
				+ marque + ", marqueId=" + marqueId + ", categorieMateriel=" + categorieMateriel
				+ ", categorieMaterielId=" + categorieMaterielId + ", contratList=" + contratList
				+ ", achatMaterielList=" + achatMaterielList + "]";
	}
    
    


}

