package tn.esprit.spring.Entity;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "factureachat")
public class Bien implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idAchat")
	private Long id;
	
	private String nom;
	
	private String description;
	
	private double prix;
	
	@ManyToOne
	private Facture facture;

	public Bien() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bien(String nom, String description, double prix, Facture facture) {
		super();
		this.nom = nom;
		this.description = description;
		this.prix = prix;
		this.facture = facture;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public Facture getFacture() {
		return facture;
	}

	public void setFacture(Facture facture) {
		this.facture = facture;
	}

	@Override
	public String toString() {
		return "Bien [id=" + id + ", nom=" + nom + ", description=" + description + ", prix=" + prix + ", facture="
				+ facture + "]";
	}
	
	
	
	

}
