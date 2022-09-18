
/*
 * Overloaded Methods
 * 
 * cosa sono 
 * creiamo diversi metodi con numero di parametri differenti
 * creiamo diversi metodi con tipi di dato differenti
 * 
 */


public class Main {
   
	// gli Overloaded Methods sono metodi con lo stesso nome ripetuto più volte, 
	// la cui signature è però diversa (numero diverso di parametri o combinazione di tipi di dato differenti)

	public static void main(String[] args) {

		int doppioInt = addizione(9, 19);
		int triploInt = addizione(39, 99, 73);
		double doppioDouble = addizione(4.9, 7.7);
		
		// a livello nominale è un addizione ma cambiano i parametri e la loro combinazione (cambia la signature)
		
		System.out.println("valore1 + valore2 = " + doppioInt);
		System.out.println("valore3 + valore4 + valore5 = " + triploInt);
		System.out.println("valore6 + valore7 = " + doppioDouble);

	}
	
	// possiamo creare più metodi con lo stesso nome ma con una signature diversa
	// la signature(firma) sarebbe la combinazione di parametri
	
	static int addizione(int a, int b) {
		int risultato = a + b;
		return risultato;
	}
	static int addizione(int a, int b, int c) {
		int risultato = c + b + a;
		return risultato;
	}
	static double addizione(double a, double b) {
		double risultato = a + b;
		return risultato;
	}


}
