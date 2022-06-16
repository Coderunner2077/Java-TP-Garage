package fr.garage.moteur;

import java.io.Serializable;

public enum TypeMoteur implements Serializable{
	DIESEL("Moteur DIESEL"),
	ESSENCE("Moteur ESSENCE"),
	HYBRIDE("Moteur HYBRIDE"),
	ELECTRIQUE("Moteur ELECTRIQUE");
	private String type = "";
	
	TypeMoteur(String type){
		this.type = type;
	}
	public String toString(){
		return type;
	}
	
}
