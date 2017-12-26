package org.rim.tp2.domain.vo;

import java.io.Serializable;
import java.sql.Date;

public class UpdateChauffeurVO implements Serializable{
	
	private long id;
	private String fname;
	private String lname;
	private Date dateN;
	private long ref;
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
	
	

}
