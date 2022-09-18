

/*
 * cos è un costruttore
 * creare un costruttore
 * parola chiave this
 * 
 */


// proprietà e metodi sono ereditati dalla classe ma possono avere diversi valori per ogni oggetto 

public class Main {

	public static void main(String[] args) {

		// istanze della stessa classe Persona, hanno stesse caratteristiche ma con valori diversi
		Persona persona1 = new Persona("Luca", "Rossi", 25, "blu"); // cambiano i valori ma le caratteristiche, proprietà.. sono quelle della classe Persona
		Persona persona2 = new Persona("Marco", "Verdi", 22, "rosso");
		
		// abbiamo creato degli oggetti che sono delle istanze differenti ma della stessa classe persona, 
		// la quale classe, grazie al costruttore, che abbiamo definito noi, siamo riusciti a prendere dei parametri in entrata diversi
		// per ciascuno oggetto e gli abbiamo detto: questa istanza ha questo nome, e quest altra istanza ha quest altro nome.
		
               System.out.println(persona1.surname );
               System.out.println(persona2.surname );

		// quindi il costruttore è una funzione(metodo) che viene chiamato automaticamente quando andiamo a crearee una nuova istanza della classe
        // che ci permette di passare dei parametri personalizzati che ci permettono di creare degli oggetti diversi tra di loro
	 
	
	}

}
