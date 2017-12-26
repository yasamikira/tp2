package org.rim.tp2.domain.vo;

import java.sql.Date;

public class groupeVO {

	private Long groupeId;
	private String nom;
	private Date created;
	private Date  updated;
	
	
	
	public Long getGroupeId() {
		return groupeId;
	}
	public void setGroupeId(Long groupeId) {
		this.groupeId = groupeId;
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
	public void setUpdated(Date updated) {
		this.updated = updated;
	}
	
	
}
