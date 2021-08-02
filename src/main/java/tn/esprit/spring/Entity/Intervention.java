package tn.esprit.spring.Entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "intervention")
public class Intervention implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idIntervention")
	private Long id;
	

	@Enumerated(EnumType.STRING)
	private TypeIntervention type;
	
	private Date date;
	
	private String description;
	
	@ManyToMany
	private List<Client> clients;
	
	public Intervention() {
		super();
	}

	public Intervention(TypeIntervention type, Date date, String description, List<Client> clients) {
		super();
		this.type = type;
		this.date = date;
		this.description = description;
		this.clients = clients;
	}

	public Intervention(Long id, TypeIntervention type, Date date, String description, List<Client> clients) {
		super();
		this.id = id;
		this.type = type;
		this.date = date;
		this.description = description;
		this.clients = clients;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public TypeIntervention getType() {
		return type;
	}

	public void setType(TypeIntervention type) {
		this.type = type;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	

}
