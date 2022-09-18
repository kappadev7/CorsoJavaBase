
/*
 * Metodi(funzioni) in Java
 * 
 * cosa sono i metodi
 * creiamo un semplice metodo void
 * parametri dei metodi
 * il return
 * 
 */
public class Main {

	public static void main(String[] args) {

		// i metodi sono funzioni: blocchi di codice che ci permettono di scrivere del codice e richiamarlo ogni volta che serve
		// queste funzioni le chiamiamo metodi perchè java è un linguaggio orientato agli oggetti: ogni cosa che si fa è in classi, 
		// e in programmazione ogni funzione che si scrive in una classe è un metodo.
		
		// i parametri sono dei dati in entrata che noi passiamo alla funzione
		
		faiPasta();
		cucinaPranzo("carne");  // carne è il valore del parametro del metodo cibo
		addizione(3,4);
		
		int totaleSpeso = acquisti(1000,3000);
		System.out.println("totale speso per gli acquisti: " + totaleSpeso);
	}
	    
	    // i metodi si scrivono sempre al di fuori del metodo main principale o si possono importare da altre classi
		// tipo del metodo | nome del metodo() {cosa fa il metodo}
		static void faiPasta() {           // va sempre messo static quando si lavora nel main
			                               // void significa che la funzione, che fa cose, non ritorna nessun valore
			System.out.println("sto cucinando la pasta");
		}
		
		static void cucinaPranzo(String cibo) {    // String è il tipo del parametro del metodo cucinaPranzo
			                                       // cibo è il parametro del metodo cucinaPranzo() 
			System.out.println("sto cucinando " + cibo);
		}
		static void addizione(int a, int b) {
			int risultato = a + b;
					System.out.println("somma addizione: " + risultato);
		}
		static int acquisti(int c, int d) {
			int costo = d + c;
			return costo; // cosa mando a schermo, cosa ci restituisce il metodo
		}
		
	}


