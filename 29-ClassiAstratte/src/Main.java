
/*
 * Classi Astratte
 * 
 * cosa sono
 * creare una classe astratta Veicolo
 * creare classe figlie Macchina
 * metodi astratti
 * 
 */
public class Main {

	public static void main(String[] args) {

		// in java si può lavorare con metodi e classi astratte
		
		// possiamo definire classi astratte come delel classi ristrette, 
		// che non possono essere utilizzate per creare oggetti,
		// sono classi che definiamo esclusivamente affinchè vengano ereditate da altre classi
		
		// prendiamo un concetto astratto, come ad esempio un veicolo e andiamo a creare la classe veicolo
		
		// non possiamo creare un oggetto di tipo astratto
		// Veicolo veicolo = new Veciolo(); ----> errore
		
		Automobile myAutomobile = new Automobile();
		myAutomobile.muovi();
		myAutomobile.frena();
		
		
		
		
	}

}
