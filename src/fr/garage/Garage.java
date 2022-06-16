package fr.garage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import fr.garage.vehicule.Vehicule;


public class Garage {
	private Map<String, Vehicule> voitures;
	private String chemin;
	private int nbVoitures = 0;
	public Garage(){
		chemin = "garage.txt";
		File f = new File(chemin);
		if(f.exists()){
			voitures = new Hashtable<String, Vehicule>();
			try (FileInputStream fis = new FileInputStream(chemin); 
				 ObjectInputStream ois = new ObjectInputStream(fis)){
					this.voitures = (Map<String, Vehicule>)ois.readObject();
			}catch(IOException | ClassNotFoundException e){
				e.printStackTrace();
			}
		}
		else
			voitures = new Hashtable<String, Vehicule>();
	}
	
	public Garage(String chem1){
		chemin = chem1;
		File f = new File(chemin);
		if(f.exists()){
			voitures = new Hashtable<String, Vehicule>();
			try (FileInputStream fis = new FileInputStream(chemin); 
				 ObjectInputStream ois = new ObjectInputStream(fis)){
					this.voitures = (Map<String, Vehicule>)ois.readObject();
			}catch(IOException | ClassNotFoundException e){
				e.printStackTrace();
			}
		}
		else
			voitures = new Hashtable<String, Vehicule>();
	}
		
	public void addVoiture(Vehicule voit){
		voitures.put(voit.getImmatriculation(), voit);
		try(FileOutputStream fos = new FileOutputStream(chemin);
		    ObjectOutputStream oos = new ObjectOutputStream(fos)){
				oos.writeObject(this.voitures);
				}catch(IOException e){
					e.printStackTrace();
				}		
		System.out.println(" + " + voit.toString());
		
	}
	
	public void removeVoiture(String immatr) {
		Vehicule deleted = voitures.remove(immatr);
		System.out.println("Voiture supprimée : " + deleted);
		try(FileOutputStream fos = new FileOutputStream(chemin);
			ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			oos.writeObject(voitures);
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public String toString(){
		String str = "\n****************************\n";
		//this.chargerListe(voitures, "garage.txt");
		if(voitures.isEmpty())
			str = "Aucune voiture sauvegardée !";
		else{
			Collection<Vehicule> collect = voitures.values();
			for(Vehicule voit : collect){
				str += voit.toString() + "\n";
			}
		}
		str += "\n****************************\n*   Garage OpenClassooms   *\n****************************\n";
		return str;
	}
		
	public int getNbreVoitures(){
		this.nbVoitures = voitures.size();
		return nbVoitures;
	}
	
	public Map<String, Vehicule> getListeVoitures(){
		return this.voitures;
	}
}
