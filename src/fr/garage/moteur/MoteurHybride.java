package fr.garage.moteur;

public class MoteurHybride extends Moteur{
	public MoteurHybride(String str, double prix){
		super(str, prix);
		this.type = TypeMoteur.HYBRIDE;
	}
}
