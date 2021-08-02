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
import javax.persistence.Transient;

import com.itextpdf.text.pdf.PdfPCell;



@Entity
@Table(name = "facture")
public class Facture implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "refFacture")
	private Long ref;

	private String titre;

	private double montant;

	private Date dateDebut;
	private Date dateValidite;

	
    
	@ManyToOne
	private Client clients;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "facture")
	private List<Service> services;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "facture")
	private List<Bien> achat;

	public Facture() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Facture(Long ref, String titre, double montant, Date dateDebut, Date dateValidite, Client clients,
			List<Service> services, List<Bien> achat) {
		super();
		this.ref = ref;
		this.titre = titre;
		this.montant = montant;
		this.dateDebut = dateDebut;
		this.dateValidite = dateValidite;
		this.clients = clients;
		this.services = services;
		this.achat = achat;
	}

	public Facture(Long ref, String titre, double montant, Date dateDebut, Date dateValidite, Client clients) {
		super();
		this.ref = ref;
		this.titre = titre;
		this.montant = montant;
		this.dateDebut = dateDebut;
		this.dateValidite = dateValidite;
		this.clients = clients;
	}

	public Long getRef() {
		return ref;
	}

	public void setRef(Long ref) {
		this.ref = ref;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Date getDateValidite() {
		return dateValidite;
	}

	public void setDateValidite(Date dateValidite) {
		this.dateValidite = dateValidite;
	}

	public Client getClients() {
		return clients;
	}

	public void setClients(Client clients) {
		this.clients = clients;
	}

	public List<Service> getServices() {
		return services;
	}

	public void setServices(List<Service> services) {
		this.services = services;
	}

	public List<Bien> getAchat() {
		return achat;
	}

	public void setAchat(List<Bien> achat) {
		this.achat = achat;
	}

	@Override
	public String toString() {
		return "Facture [ref=" + ref + ", titre=" + titre + ", montant=" + montant + ", dateDebut=" + dateDebut
				+ ", dateValidite=" + dateValidite + ", clients=" + clients + "]";
	}
	
	
	

	

	

	

}