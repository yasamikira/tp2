package org.rim.tp2.domain;

import javax.persistence.*;

@Entity
public class GroupeVehicule {

	@Id @GeneratedValue
	private long id;
	private Groupe groupe;
	private Vehicule vehicule;
	
	public GroupeVehicule() { }
	
	public GroupeVehicule(Groupe groupe, Vehicule vehicule) {
		super();
		this.groupe = groupe;
		this.vehicule = vehicule;
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
