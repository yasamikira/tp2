package org.rim.tp2.domain.vo;

import java.io.Serializable;
import java.sql.Date;

public class ChauffeurVO implements Serializable{

	private Long chauffeurId;
	private String fname;
	private String lname;
	private Date dateN;
	private long ref;
	private Date created;
	private Date updated;
	
	
	
	public Long getChauffeurId() {
		return chauffeurId;
	}
	public void setChauffeurId(Long chauffeurId) {
		this.chauffeurId = chauffeurId;
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
