package fr.garage.vehicule;

import java.io.Serializable;

public enum Marque implements Serializable{
	RENO("RENO"),
	PIGEOT("PIGEOT"),
	CITROEN("CITROEN");
	private String nomMarque = "";
	
	Marque(String nom){
		this.nomMarque = nom;
	}
	
	public String toString(){
		return nomMarque;
	}

}
