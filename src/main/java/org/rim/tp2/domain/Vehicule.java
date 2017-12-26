package org.rim.tp2.domain;

import java.sql.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity

public  class Vehicule {

	@Id @GeneratedValue
	private long id;
	private String marque;
	private String couleur;
	private float  poids;
	private Date created;
	private Date updated;
	private Set<GroupeVehicule> groupeVehicules;
	private Set<AffectationVc> affectationVcs;
	
	
	@OneToMany(fetch=FetchType.LAZY , mappedBy = "vehicule")
	public Set<GroupeVehicule> getGroupeVehicules() {
		return groupeVehicules;
	}

	public void setGroupeVehicules(Set<GroupeVehicule> groupevehicules) {
		this.groupeVehicules = groupevehicules;
	}
	
	@OneToMany(fetch=FetchType.LAZY , mappedBy = "vehicule")
	public Set<AffectationVc> getAffectationVcs() {
		return affectationVcs;
	}

	public void setAffectationVcs(Set<AffectationVc> affectationVCs) {
		this.affectationVcs = affectationVCs;
	}

	public Vehicule() {	}
	
	public Vehicule(String marque, String couleur, float poids, Date created, Date updated) {
		super();
		this.marque = marque;
		this.couleur = couleur;
		this.poids = poids;
		this.created = created;
		this.updated = updated;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public String getCouleur() {
		return couleur;
	}
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	public float getPoids() {
		return poids;
	}
	public void setPoids(float poids) {
		this.poids = poids;
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
	public void setUpdated(Date updated) {
		this.updated = updated;
	}
	
	
	
	
}
