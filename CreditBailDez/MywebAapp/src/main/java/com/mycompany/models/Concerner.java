package com.mycompany.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import javax.persistence.*;

@Entity
@JsonIdentityInfo(generator= ObjectIdGenerators.PropertyGenerator.class)
public class Concerner{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String numserie;
    private Integer quantite=1;


    @ManyToOne
    @JoinColumn(name = "materielId",insertable=false,updatable=false)
    private Materiel materiel;
    private Integer materielId;

    @ManyToOne
    @JoinColumn(name = "contratId",insertable=false,updatable=false)
    private Contrat contrat;
    private Integer contratId;
    
	public Concerner() {
		// TODO Auto-generated constructor stub
	}

	public Concerner(Integer id, String numserie, Integer quantite, Materiel materiel, Integer materielId, Contrat contrat,
			Integer contratId) {
		super();
		this.id = id;
		this.numserie = numserie;
		this.quantite = quantite;
		this.materiel = materiel;
		this.materielId = materielId;
		this.contrat = contrat;
		this.contratId = contratId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumserie() {
		return numserie;
	}

	public void setNumserie(String numserie) {
		this.numserie = numserie;
	}

	public Integer getQuantite() {
		return quantite;
	}

	public void setQuantite(Integer quantite) {
		this.quantite = quantite;
	}

	public Materiel getMateriel() {
		return materiel;
	}

	public void setMateriel(Materiel materiel) {
		this.materiel = materiel;
	}

	public int getMaterielId() {
		return materielId;
	}

	public void setMaterielId(Integer materielId) {
		this.materielId = materielId;
	}

	public Contrat getContrat() {
		return contrat;
	}

	public void setContrat(Contrat contrat) {
		this.contrat = contrat;
	}

	public int getContratId() {
		return contratId;
	}

	public void setContratId(Integer contratId) {
		this.contratId = contratId;
	}

	@Override
	public String toString() {
		return "Concerner [id=" + id + ", numserie=" + numserie + ", quantite=" + quantite + ", materiel=" + materiel
				+ ", materielId=" + materielId + ", contrat=" + contrat + ", contratId=" + contratId + "]";
	}
	
	
    
    

}

