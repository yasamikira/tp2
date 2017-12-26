package org.rim.tp2.domain;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="groupe_vehicule",catalog="tp2")
public class GroupeVehicule implements Serializable{

	
	private long id;
	private Groupe groupe;
	private Vehicule vehicule;
	
	public GroupeVehicule() { }
	
	public GroupeVehicule(Groupe groupe, Vehicule vehicule) {
		super();
		this.groupe = groupe;
		this.vehicule = vehicule;
	}
	
	@Id @GeneratedValue
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	
	@ManyToOne
	@JoinColumn(name = "groupe_id")
	public Groupe getGroupe() {
		return groupe;
	}
	
	public void setGroupe(Groupe groupe) {
		this.groupe = groupe;
	}
	
	@ManyToOne
	@JoinColumn(name = "vehicule_id")
	public Vehicule getVehicule() {
		return vehicule;
	}
	public void setVehicule(Vehicule vehicule) {
		this.vehicule = vehicule;
	}
	
	
	
}
