import fr.garage.Garage;
import fr.garage.moteur.MoteurEssence;
import fr.garage.moteur.MoteurHybride;
import fr.garage.options.BarreDeToit;
import fr.garage.options.Climatisation;
import fr.garage.options.GPS;
import fr.garage.options.SiegeChauffant;
import fr.garage.options.VitreElectrique;
import fr.garage.vehicule.D4;
import fr.garage.vehicule.Lagouna;
import fr.garage.vehicule.Vehicule;
public class Main_garage {

	public static void main(String[] args) {
		Garage garage = new Garage("garage2.txt");		
		Vehicule v1 = new Lagouna();
		v1.setMoteur(new MoteurEssence("150 chevaux", 12000.0d));
		v1.addOption(new GPS());			
		v1.addOption(new Climatisation());
		v1.addOption(new BarreDeToit());
		Vehicule v2 = new D4();			
		v2.setMoteur(new MoteurHybride("DIESEL/Electrique", 15000.0d));
		v2.addOption(new GPS());
		v2.addOption(new VitreElectrique());
		v2.addOption(new SiegeChauffant());
			
		garage.addVoiture(v1);
		garage.addVoiture(v2);	
		//garage.removeVoiture("700FEC416");
		
		System.out.println(garage);
		System.out.println("Le nombre de voitures du garage : " + garage.getNbreVoitures());
	}
}
