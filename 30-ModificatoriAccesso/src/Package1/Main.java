package Package1;
import Package2.*;

/*
 * Modificatori di accesso
 * 
 * i modificatori di accesso servono per aggiungere un livello di sicurezza aggiuntivo
 * 
 * creare 2 package con due classi
 * 
 * tabella che rappresenta i modificatori di default(righe) 
 * e indica da dove vi si può accedere(colonne)
 * 
 *                   class     package    subclass     world(utilizzare metodi e attributi al di fuori del pacchetto)
 * public             si         si          si          si
 * protected          si         si          si          no
 * default            si         si          no          no
 * private            si         no          no          no
 * 
 */


// i modificatori di accesso sono le keywords che vediamo spesso davanti alle classi e ai metodi
// servono per aggiungere un livello di sicurezza dentro l'applicazione
// ci permettono di mostrare o meno determinati metodi o attributi in giro per il nostro codice



public class Main {

	public static void main(String[] args) {

		B prova = new B();
		// System.out.println(prova.nome); 
		// da errore poichè il suo modificatore di accesso è quello di default e non vi si può accedere al di fuori del pacchetto
		
		B crack = new B();
		System.out.println(crack.idolo);
		// si riesce ad accedere alla classe B con le sue proprietà poichè il modificatore di accesso della proprietà attributo "crack" è public

		A hero = new A();
		System.out.println(hero.eroe);
		// si riesce ad accedere alla proprietà "eroe" della classe A, poichè il modificatore di accesso è protected 
		// il modificatore di accesso "protected" permette di accedere alla proprietà dalla stessa classe, pacchetto, o relativa sottoclasse, non al di fuori pacchetto
		// se una classe si trova al di fuori del pacchetto della classe Padre, può accedere alle sue proprietà se il modificatore di accesso delle stesse é public o protected
		// il modificatore di accesso private rende accessibili quelle proprietà solo all'interno della classe stessa 
	}

}
