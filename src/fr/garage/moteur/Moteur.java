package fr.garage.moteur;

import java.io.Serializable;

public abstract class Moteur implements Serializable{
	public double prix;
	public String cylindre;
	protected TypeMoteur type;
	
	public Moteur(String cylind, double p){
		cylindre = cylind;
		prix = p;
	}
	
	public double getPrix(){
		return this.prix;
	}
	
	public String toString(){
		String str = "";
		str = this.type + " " + this.cylindre;
		return str;
	}
	
}
