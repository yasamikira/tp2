package org.rim.tp2.domain;

import java.io.Serializable;
import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="groupe",catalog="tp2")
public class Groupe implements Serializable{

	private long id;
	private String nom;
	private Date created;
	private Date  updated;
	private Set<GroupeVehicule> groupeVehicules=new HashSet<GroupeVehicule>(0);;
	
	
	
	@OneToMany(mappedBy = "groupe",fetch=FetchType.LAZY)
	public Set<GroupeVehicule> getGroupeVehicules() {
		return groupeVehicules;
	}

	public void setGroupeVehicules(Set<GroupeVehicule> groupevehicules) {
		this.groupeVehicules = groupevehicules;
	}

	public Groupe() {
		// TODO Auto-generated constructor stub
	}

	public Groupe(String nom, Date created, Date pdated) {
		super();
		this.nom = nom;
		this.created = created;
		this.updated = pdated;
	}
	@Id @GeneratedValue
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getUpdated() {
		return updated;
	}

	public void setUpdated(Date pdated) {
		this.updated = pdated;
	}
	
	
}
