
/*
 * Metodi Stringhe
 * 
 * equals, equalsIgnoreCase, length, charAt
 * indexOf, isEmpty, toUpperCase, toLowerCase
 * trim, replace
 * 
 */
public class Main {

	public static void main(String[] args) {

		// equals ---> Confronta questa stringa con l'oggetto specificato. 
		//             Il risultato è vero se e solo se l'argomento non è nullo ed è un oggetto String che rappresenta 
		//             la stessa sequenza di caratteri di questo oggetto. Restituisce un boolean.
		
		String nome = "Leonardo";
		boolean risultato1 = nome.equals("Leonardo");
		System.out.println("is equals? "+risultato1);
		System.out.println("************************************************");

		// equalsIgnoreCase ---> si comporta come equals ma non è case sensitive
		String parola = "Giovanni";
		boolean risultato2 = parola.equalsIgnoreCase("Giovanni");
		System.out.println("is equals ignoring case? " + risultato2);
		System.out.println("************************************************");

		// length ---> restituisce la lunghezza della o delle stringa/e che abbiamo, va applicato in una variabile del tipo int
		String word = "Francesca";
		int risultato3 = word.length();
		System.out.println("length of the string: "+risultato3);
		System.out.println("************************************************");

		// charAt ---> restituisce qual'è il carattere che troviamo in una determinata posizione della stringa
		String name = "Elizabeth";
		char risultato4 = name.charAt(2); // restituisce il carattere presente nella posizione 2(la terza) della stringa 
		System.out.println("character at position 2: " + risultato4);
		System.out.println("************************************************");

		// indexOf ----> restituisce l'indice del carattere (la sua posizione dove compare per la prima volta) all'interno della stringa  
		String city = "Granburrone";
		int risultato5 = city.indexOf("r");
		System.out.println("index of the character r: " + risultato5);
		System.out.println("************************************************");

		// isEmpty ----> restituisce un boolean. Ci dice se la stringa che abbiamo è vuota oppure no.
		String impero = "romano";
		boolean risultato6 = impero.isEmpty();
		System.out.println("is the string empty? " + risultato6);
		System.out.println("************************************************");

		// toUpperCase --> restituisce la stessa stringa che abbiamo, ma con lettere maiuscole
		String desiderio = "salute";
		String risultato7 = desiderio.toUpperCase();
		System.out.println("my only wish is " + risultato7);
		System.out.println("************************************************");

		// toLowerCase ---> restituisce la stessa stringa che abbiamo, ma con lettere minuscole
		String personaggio = "Aragorn";
		String risultato8 = personaggio.toLowerCase();
		System.out.println("il re degli uomini è " + risultato8);
		System.out.println("************************************************");

		// trim ----> ci permette di togliere gli spazi avanti e indietro una stringa 
		// si potrebbe utilizzare per esempio su stringhe che un utente potrebbe dover compilare in un modulo online
		String frase = "           <<fatti non foste a viver come bruti!>>           ";
		String risultato9 = frase.trim();
		System.out.println("disse Dante: " + risultato9);
		System.out.println("************************************************");

		// replace ---> ci darà una stringa cme risultato dove avremo il nome a cui sarà stato sostituito un carattere 
		//             (tutte le occorrenze di un carattere) con un altro carattere
		String sequenza = "aslodpfrtttiios";
		String risultato10 = sequenza.replace('t', 'o');  // sostituirà ogni 't' presente nella stringa con il carattere 'o'
		System.out.println(risultato10);
		
	}

}
