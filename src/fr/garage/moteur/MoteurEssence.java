package fr.garage.moteur;

public class MoteurEssence extends Moteur{
	public MoteurEssence(String str, double prix){
		super(str, prix);
		this.type = TypeMoteur.ESSENCE;
	}
	public String toString(){
		String str = "";
		str = this.type + " " + this.cylindre;
		return str;
	}
}
