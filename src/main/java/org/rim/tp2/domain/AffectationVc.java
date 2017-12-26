package org.rim.tp2.domain;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="affectation_vc",catalog="tp2")
public class AffectationVc implements Serializable{

	
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

	@Id @GeneratedValue
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "vehicule_id",nullable=false)
	public Vehicule getVehicule() {
		return vehicule;
	}

	public void setVehicule(Vehicule vehicule) {
		this.vehicule = vehicule;
	}
	
	
	@ManyToOne
	@JoinColumn(name = "chauffeur_id", nullable=false)
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
