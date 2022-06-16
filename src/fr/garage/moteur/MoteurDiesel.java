package fr.garage.moteur;

public class MoteurDiesel extends Moteur{
	MoteurDiesel(String str, double prix){
		super(str, prix);
		this.type = TypeMoteur.DIESEL;
	}
}
