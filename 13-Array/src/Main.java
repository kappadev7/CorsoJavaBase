/*
 * ARRAY
 * 
 * Cosa sono gli array
 * creare un array vuoto
 * associare elementi
 * Array.toString
 * lunghezza di un array
 * modificare elementi
 * ciclare array con for e foreach
 * 
 */
public class Main {
	
	// COSA SONO GLI ARRAY: possiamo definire gli array come collezioni di dati (utili di mettere insieme poichè correlati)
	// collezione di dati -> un unica variabile che contiene più valori correlati tra di loro
	
	/*
	 * ESEMPIO: scrivere un elenco di voti presi in una materia a scuola
	 * int voto1= 7
	 * int voto2= 4
	 * int voto3= 9
	 * int voto4= 5
	 * 
	 * grazie agli array diventa --> 
	 */

	public static void main(String[] args) {

		// sintassi di array in Java
		
		/*tipo dell'array*/int[] numeri/*nome dell'array*/ = new int[4/*lunghezza dell'array*/];    
		// gli array di java hanno una dimensione fissa
		// abbiamo creato "numeri" che è un array di interi con lunghezza fissa uguale a 3
		
		// essendo il nostro array di lunghezza 4 posso aggiungere massimo 4 elementi nel seguente modo:
		numeri[0/*indice dell array(posizione cella)*/] =10/*valore aggiunto*/;
		numeri[1] =40;
		numeri[2] =33;
		numeri[3] =77;

		System.out.println(numeri.length/*restituisce la lunghezza del nostro array*/);
		System.out.println(numeri[3]); // manderà a schermo il valore presente nella posizione 3 dell array, ovvero 77
		
		numeri[3] = 100; // ho modificato il valore presente nella posizione 3 del nostro array
		System.out.println(numeri[3]); // negli array posso modificare i valori presenti nelle varie posizioni ma non la lunghezza dell array stesso
		
		int[] voti = {7/*posizione 0*/, 8/*posizione 1*/, 6/*posizione 2*/, 5/*posizione 3*/}; // la posizione è un indirizzo e si parte a contare da zero
		System.out.println(voti[1]); // la length è la quantità di oggetti effettivamente presegnti nell array
		
		System.out.println(voti[voti.length-1]); // vado a prendere il valore presente nell ultima posizione dell array
		
		// ciclare un array
		
		// con il for classico
		for(int i = 0; i < numeri.length; i++) {
			System.out.println(numeri[i]);
		}
		
		// con il foreach
		for(int numero: numeri) {
			System.out.println(numero);
		}
		
		 // stampa l'array
        System.out.print("My array of numbers: [ ");
        for (int i = 0; i < numeri.length; i++)
            System.out.print(numeri[i] +  " ");
        System.out.println("]");
        
        
		
	}

}
