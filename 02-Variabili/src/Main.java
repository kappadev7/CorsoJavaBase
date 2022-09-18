 /*
 * - le Variabili
 * 
 * - cosa è una variabile
 *   le variabili sono l'essenza di ogni linguaggio di programmazione.
 *   possiamo definire le variabili come una scatola che contiene un valore arbitrario:
 *   x = 8 
 *   3x + 5 = 29
 *   
 *   esempio variabile massa muscolare
 *   1000(kcal consumate da ognuno di noi) 10kcal(un valore arbitrario)*massa muscolare(variabile)
 *   quindi abbiamo sempre espressioni formulate ugalmente ma con valori che cambiano grazie alle variabili
 * 
 * - dichiarazione, assegnazione e inizializzaziome
 * 
 * - variabili con diversi tipi di dati
 * 
 * - nomenclatura delle variabili
 * 
 */
public class Main 
{

	public static void main(String[] args)
	{   
		// dichiarazione
		int x;  // questa variabile rappresenta un numero intero, la variabile è preceduta sempre dal tipo
	            // esempio double: 10,1 
		        // una variabile è definita dal tipo di dato che contiene
		double numeroFortunato;
		String parola;
		       
		// assegnazione        
		x = 18; // abbiamo assegnato un valore alla variabile x
		
		// inizializzazione
		int numeroReligioso = 77; // volendo possiamo dichiarare e assegnare insieme la variabile

		parola = "FORTUNA";
        numeroFortunato = 88.88;
        
        System.out.println(numeroReligioso);
        System.out.println(x); // mandami a schermo il contenuto di x
                               // System.out.println("x"); mandami a schermo la lettera x
		x = 1995;
        System.out.println(x);  // le variabili possono cambiare valore nel corso del programma
		System.out.println(numeroFortunato);
		System.out.println(parola);
		
       /* nomenclatura: l'insieme delle regole o delle migliori pratiche riguardo i nomi da assegnare alle variabili
          l'importante è chiamare le variabili con nomi comprensibili per chiunque stia leggendo il programma
	      esempio: 
		  - variabile: int saldoFineMese = 4000;
		  - costante:  int STIPENDIO_MENSILE = 1000;
        
        */
		
		int saldoFineMese;
		final int STIPENDIO_MENSILE = 1000;
		final int SPESE_PERSONALI = 800;
		saldoFineMese = STIPENDIO_MENSILE - SPESE_PERSONALI;
		
		System.out.println( "saldo fine mese: " + saldoFineMese);
	}

}
