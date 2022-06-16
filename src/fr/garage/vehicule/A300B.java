package fr.garage.vehicule;

public class A300B extends Vehicule{
	public A300B(){
		this.nom = "A300B";
		this.prix = 28457.00;
		this.nomMarque = Marque.PIGEOT;
		this.setPrixTotal();
	}
	
}
