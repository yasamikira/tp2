package org.rim.tp2.domain;

import java.io.Serializable;
import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="chauffeur",catalog="tp2")
public class Chauffeur implements Serializable{

	
	private long id;
	private String fname;
	private String lname;
	private Date dateN;
	private long ref;
	private Date created;
	private Date updated;
	private Set<AffectationVc> affectationVcs=new HashSet<AffectationVc>(0);
	
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "chauffeur")
	public Set<AffectationVc> getAffectationVcs() {
		return affectationVcs;
	}

	public void setAffectationVcs(Set<AffectationVc> affectationVCs) {
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

	@Id @GeneratedValue
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
