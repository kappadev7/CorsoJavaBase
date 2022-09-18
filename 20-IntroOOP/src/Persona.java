
public class Persona {

	String nome = "Aragorn";
	String titolo = "Re di Gondor";
	int eta = 40;
	String notoCome = "Straider";
	
	// le classi hanno dei metodi
	// i metodi sono le funzioni delle classi
	// una funzione scritta in un altro contesto, al di fuori di una classe, è semplicemente una funzione
	// una funzioone scritta dentro una classe è un metodo: un azione che esegue quella classe
	// java è un intero linguaggio orientato agli oggetti, non si hanno funzioni in se, ma metodi ovunque
			
	// i metodi sono quindi le azioni che può compiere una determinata classe
	// gli attributi sono le caratteristiche della classe
	
	void personaggio() {
		System.out.println(nome + " " + titolo + " " + "noto come " + notoCome);
	}
	
	void anni() {
		System.out.println("eta del Re di Gondor: " + eta);
	}
}
