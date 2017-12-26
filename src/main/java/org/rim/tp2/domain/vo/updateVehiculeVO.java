package org.rim.tp2.domain.vo;

import java.io.Serializable;

public class UpdateVehiculeVO implements Serializable{
	
	
	private long id;
	private String marque;
	private String couleur;
	private float  poids;
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
	
	
	

}
