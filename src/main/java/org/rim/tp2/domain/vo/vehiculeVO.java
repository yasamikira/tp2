package org.rim.tp2.domain.vo;

import java.io.Serializable;
import java.sql.Date;

public class VehiculeVO implements Serializable{

	private Long vehiculeId;
	private String marque;
	private String couleur;
	private float  poids;
	private Date created;
	private Date updated;
	
	
	
	public Long getVehiculeId() {
		return vehiculeId;
	}
	public void setVehiculeId(Long vehiculeId) {
		this.vehiculeId = vehiculeId;
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
