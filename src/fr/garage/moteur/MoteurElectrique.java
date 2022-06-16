package fr.garage.moteur;

public class MoteurElectrique extends Moteur{
	public MoteurElectrique(String str, double prix){
		super(str, prix);
		this.type = TypeMoteur.ELECTRIQUE;
	}
}
