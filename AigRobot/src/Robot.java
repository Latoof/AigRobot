
public class Robot {

	Aiguille aiguilleMinutes;
	Aiguille aiguilleHeures;
	
	Bouton boutonMinutes;
	Bouton boutonHeures;
	Bouton boutonReglages;
	Bouton boutonStopRing;
	
	Buzzer buzzer;
	
	public Robot() {
		
		this.aiguilleHeures = new Aiguille(Aiguille.HEURES);
		this.aiguilleMinutes = new Aiguille(Aiguille.MINUTES);
		
		this.buzzer = new Buzzer();
		
		
		
		
	}
		
	
}
