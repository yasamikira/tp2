package org.rim.tp2.domain;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class AffectationVc {

	@Id @GeneratedValue
	private long id;
	private Vehicule vehicule;
	private Chauffeur chauffeur;
	private Date dateAff;
	private int dure;
	
	public AffectationVc() { }

	public AffectationVc(Chauffeur chauffeur, Vehicule vehicule, Date dateAff,
			int dure) {
		super();
		this.chauffeur = chauffeur;
		this.vehicule = vehicule;
		this.dateAff = dateAff;
		this.dure = dure;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "vehicule_id")
	public Vehicule getVehicule() {
		return vehicule;
	}

	public void setVehicule(Vehicule vehicule) {
		this.vehicule = vehicule;
	}
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "chauffeur_id")
	public Chauffeur getChauffeur() {
		return chauffeur;
	}

	public void setChauffeur(Chauffeur chauffeur) {
		this.chauffeur = chauffeur;
	}
	
	

	public Date getDateAff() {
		return dateAff;
	}

	public void setDateAff(Date dateAff) {
		this.dateAff = dateAff;
	}

	public int getDure() {
		return dure;
	}

	public void setDure(int dure) {
		this.dure = dure;
	}
	
	
}
