package fr.garage.vehicule;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

import fr.garage.moteur.Moteur;
import fr.garage.options.Option;

public class Vehicule implements Serializable {
	protected double prix, prixTotal;
	protected String nom;
	protected List<Option> options;
	protected Marque nomMarque;
	protected Moteur moteur;
	protected String immatriculation = "";
	
	public Vehicule(){
		char[] abc = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
		for(int i = 0; i < 9; i++) {
			if(i > 2 && i < 6)
				immatriculation += abc[(int) (Math.random() * 9)];
			else
				immatriculation += (int) (Math.random() * 9);
		}
		options = new LinkedList<Option>();
	}
	
	public void addOption(Option opt)
	throws NullPointerException
	{
		if(opt == null)
			throw new NullPointerException();
		else
			this.options.add(opt);
		this.setPrixTotal();
	}
	
	public Marque getMarque(){
		return nomMarque;
	}
	
	public List<Option> getOptions(){
		return options;
	}
	
	public double getPrix(){
		return prix;
	}
	
	public void setMarque(Marque m){
		this.nomMarque = m;
	}
	
	public void setMoteur(Moteur m){
		this.moteur = m;
	}
	
	protected void setPrixTotal(){
		double prixOptions = 0;
		if(options != null){
			for(Option opt : options)
				prixOptions += opt.getPrix();
		}
		this.prixTotal = prix + prixOptions;
	}
	
	public String toString(){
		this.setPrixTotal();
		String str = "", listeOptions = "";
		for(Option opt : options)
			listeOptions += opt.toString() + ", ";
		listeOptions = listeOptions.substring(0, listeOptions.lastIndexOf(','));
			
		str += "Voiture " + this.nomMarque+ " : " + this.nom +" immatriculée " + immatriculation 
				+ " " +  this.moteur.toString() +" ("+this.prix+ "€) [" + listeOptions 
				+ "] d'une valeur totale de " +this.prixTotal + "€";
		
		return str;
	}
	
	public void setPrix(double p){
		this.prix = p;
	}
	
	public String getImmatriculation() {
		return immatriculation;
	}
}

