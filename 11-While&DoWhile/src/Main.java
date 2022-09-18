
/*
 * Ciclo While
 * 
 * -cos'è un ciclo:
 *  il ciclo si può definire come un blocco di codice che ci permette di ripetere all'infinito potenzialmente
 *  una porzione di codice finchè lo vogliamo noi. 
 *  
 * -a cosa serve un ciclo:
 *  ci permette di sostituire processi lunghi da fare a mano e a volte anche impossibili, in modo semplice e dinamico
 *  date delle condizioni.
 *  Esegue delle istruzioni finche c'è una condizione che viene verificata.
 *  
 * -Ciclo While
 * 
 * -Ciclo Do While
 * 
 */

public class Main 

{

	public static void main(String[] args) 
	
	{
       // come si costruisce un ciclo While
		
		int i = 0; // --> si crea la variabile iteratore (contatore)
		while(i < 5) // --> condizione da verificare tra le parentesi () 
		{
			System.out.println(" while " + i); // --> che cosa fare se la condizione è verificata
			/* dopo avere definito la i che è minore di 5, abbiamo detto che finchè la i è minore di 5
			   si debba mandare a schermo la i
			*/
			    
			i++; // se non mettessimo questo incremento i sarebbe sempre uguale a 0 e verrebbe ciclato all'infinito
			
		}
		
		// come si costruisce un ciclo Do While
		
		/*
		 * mentre in While eseguiamo solo se la condizione è verificata, 
		 * in Do While eseguiamo la condizione prima
		 *  
		 */
		int a = 2; // --> si crea la nuova variabile iteratore (contatore)
		
		do {
			System.out.println("dowhile " + a);   // prima viene eseguita la riga di codice e poi viene verificata l'istruzione
			a++;                     // si applica l'istruzione
		}while(a<5);                 // viene posta la condizione e se non è verificata si esce dal ciclo
		                             // si applica il do while per eseguire almeno una volta il codice anche se la condizione non è verificata
	}

}
