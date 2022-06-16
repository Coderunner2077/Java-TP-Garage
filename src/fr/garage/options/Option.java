package fr.garage.options;

import java.io.Serializable;

public abstract class Option implements Serializable {
	protected String nom;
	protected double prix;
	
	public double getPrix() {
		return prix;
	}
	
	public String toString() {
		String str = "";
		str += nom + " ("+ prix +"€)";
		return str;
	}
}
