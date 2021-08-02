package tn.esprit.spring.Entity;

import java.io.Serializable;

import java.util.List;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name = "client")
public class Client implements Serializable  {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int idclient;
	String cin;
	String nom;
	String prenom;
	String adresse;
	String tel;
	String email;
	@Enumerated(EnumType.STRING)
	private Role role;
	
	/*@OneToMany(cascade = CascadeType.ALL, mappedBy="clients")
	private List<Compte> compte;
	*/
	@OneToMany(cascade = CascadeType.ALL, mappedBy="clients")
	private List<Facture> facture;
	
	@ManyToMany(cascade = CascadeType.ALL, mappedBy="clients")
	private List<Intervention> intervention;
	
	public Client( String nom, String prenom, String adresse, String cin, String tel,
			String email,Role role) {
		super();
		
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.cin = cin;
		this.tel = tel;
		this.email = email;
		this.role = role;
	}

	public Client()
	{}
	
	
	public Client(int idclient, String cin, String nom, String prenom, String adresse, String tel, String email, Role role
			) {
		super();
		this.idclient = idclient;
		this.cin = cin;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.tel = tel;
		this.email = email;
		this.role = role;
		
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
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getCin() {
		return cin;
	}
	public void setCin(String cin) {
		this.cin = cin;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return " [cin=" + cin + ", nom=" + nom + ", prenom=" + prenom + "]";
	}
	
	
	}