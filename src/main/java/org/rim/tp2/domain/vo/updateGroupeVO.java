package org.rim.tp2.domain.vo;

import java.io.Serializable;

public class UpdateGroupeVO implements Serializable{
	
	private long id;
	private String nom;
	
	
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
	
	
}
