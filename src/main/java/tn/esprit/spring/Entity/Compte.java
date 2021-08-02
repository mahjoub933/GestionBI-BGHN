package tn.esprit.spring.Entity;


import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "compte")
public class Compte implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idCompte")
	private Long id;
	private Long rib;
	
	private double balance;
	private String type;
	private String etat;
	@Temporal(TemporalType.DATE)
	private Date dateCreation;

	/*@ManyToOne
	private Client clients;*/

	
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="compte")
	private List<Transaction> transaction;
	
	

	public Compte() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Compte(Long rib, double balance, String type, String etat, Date dateCreation) {
		super();
		this.rib = rib;
		
		this.balance = balance;
		this.type = type;
		this.etat = etat;
		this.dateCreation = dateCreation;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getRib() {
		return rib;
	}

	public void setRib(Long rib) {
		this.rib = rib;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	@Override
	public String toString() {
		return "Compte [id=" + id + ", rib=" + rib + ", balance=" + balance + ", type=" + type
				+ ", etat=" + etat + ", dateCreation=" + dateCreation + "]";
	}

}
