package com.mycompany.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;


import javax.persistence.*;
import java.util.List;

@Entity
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class,property="id")
public class Fournisseur {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;
        private String type;
        private String nom;
        private String telephone;
        private String email;
        private String adresse;

        @OneToMany(mappedBy = "fournisseur")
        private List<AchatMateriel> achatMaterielList;
        
        @OneToMany(mappedBy = "fournisseur")
        private List<Materiel> materielList;

		public Fournisseur() {
			// TODO Auto-generated constructor stub
		}

		public Fournisseur(Integer id, String type, String nom, String telephone, String email, String adresse,
				List<AchatMateriel> achatMaterielList,List<Materiel> materielList) {
			super();
			this.id = id;
			this.type = type;
			this.nom = nom;
			this.telephone = telephone;
			this.email = email;
			this.adresse = adresse;
			this.achatMaterielList = achatMaterielList;
			this.materielList = materielList;
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
		 * @return the type
		 */
		public String getType() {
			return type;
		}

		/**
		 * @param type the type to set
		 */
		public void setType(String type) {
			this.type = type;
		}

		/**
		 * @return the nom
		 */
		public String getNom() {
			return nom;
		}

		/**
		 * @param nom the nom to set
		 */
		public void setNom(String nom) {
			this.nom = nom;
		}

		/**
		 * @return the telephone
		 */
		public String getTelephone() {
			return telephone;
		}

		/**
		 * @param telephone the telephone to set
		 */
		public void setTelephone(String telephone) {
			this.telephone = telephone;
		}

		/**
		 * @return the email
		 */
		public String getEmail() {
			return email;
		}

		/**
		 * @param email the email to set
		 */
		public void setEmail(String email) {
			this.email = email;
		}

		/**
		 * @return the adresse
		 */
		public String getAdresse() {
			return adresse;
		}

		/**
		 * @param adresse the adresse to set
		 */
		public void setAdresse(String adresse) {
			this.adresse = adresse;
		}

		/**
		 * @return the achatMaterielList
		 */
		public List<AchatMateriel> getAchatMaterielList() {
			return achatMaterielList;
		}

		/**
		 * @param achatMaterielList the achatMaterielList to set
		 */
		public void setAchatMaterielList(List<AchatMateriel> achatMaterielList) {
			this.achatMaterielList = achatMaterielList;
		}
		
		

		/**
		 * @return the materielList
		 */
		public List<Materiel> getMaterielList() {
			return materielList;
		}

		/**
		 * @param materielList the materielList to set
		 */
		public void setMaterielList(List<Materiel> materielList) {
			this.materielList = materielList;
		}

		@Override
		public String toString() {
			return "Fournisseur [id=" + id + ", type=" + type + ", nom=" + nom + ", telephone=" + telephone + ", email="
					+ email + ", adresse=" + adresse + ", achatMaterielList=" + achatMaterielList + ", materielList="
					+ materielList + "]";
		}

		
        


}
