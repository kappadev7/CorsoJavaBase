
/*
 * Scope delle variabili
 * 
 * cos è lo scope di una variabile
 * scope locale
 * scope globale
 */

public class Main {

	public static void main(String[] args) {

		// lo scope di una variabile è quel raggio di azione in cui la variabile è disponibile nel codice
		// è il raggio di azione (per esempio dentro o fuori da un metodo) entro cui le variabili possono essere chiamate e lette

		mioCapitano capitanFuturo = new mioCapitano("Daniele","De Rossi",16,"giallorosso");

		 capitanFuturo.intro();
		 System.out.println("****************************************************");
		 capitanFuturo.scopeLocale(43, 21);
         
        
		
	}

}
