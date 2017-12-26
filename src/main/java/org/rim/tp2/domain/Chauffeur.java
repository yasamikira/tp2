package org.rim.tp2.domain;

import java.sql.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Chauffeur {

	@Id @GeneratedValue
	private long id;
	private String fname;
	private String lname;
	private Date dateN;
	private long ref;
	private Date created;
	private Date updated;
	private Set<AffectationVc> affectationVcs;
	
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy = "chauffeur")
	public Set<AffectationVc> getAffectationVcs() {
		return affectationVcs;
	}

	public void setAffectationVCs(Set<AffectationVc> affectationVCs) {
		this.affectationVcs = affectationVCs;
	}

	public Chauffeur() { }

	public Chauffeur(String fname, String lname, Date dateN, long ref) {
		super();
		
		this.fname = fname;
		this.lname = lname;
		this.dateN = dateN;
		this.ref = ref;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public Date getDateN() {
		return dateN;
	}

	public void setDateN(Date dateN) {
		this.dateN = dateN;
	}

	public long getRef() {
		return ref;
	}

	public void setRef(long ref) {
		this.ref = ref;
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
