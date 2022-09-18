
/*
 * Cilco FOR
 * 
 * Ciclo for
 * for annidati
 * versione enhanced/foreach
 * break e continue
 * 
 */


public class Main {

	public static void main(String[] args) {
 
		// un ciclo è un blocco di codice che ci permette di eseguire in modo continuo 
		// una certa porzione di codice  finchè è verificata una determinata condizione 
		
		/* for(condizione) {
			codice
		}
		*/
		
		// solitamente il for si utilizza quando sappiamo quanti sono i cicli massimi (me lo esegui tot volte)
		// mentre il while è più: esegui quando c'è questa condizione
		
		
		for (int i=0/*inizializzo*/; i<5/*pongo condizione*/; i++/*incremento*/) {
			System.out.println(i);
		}
		
		// for e if annidati
		
		for(int a=0/*primo passaggio*/; a<9/*secondo passaggio*/; a++/*quarto passaggio*/) {
		System.out.println/*terzo passaggio*/("riga" + a);
		for(int j=0; j<9; j++) {        // un for dentro a un for molto spesso si usa dagly Array2d alle matrici, alle tabelle.....
			System.out.println("colonna" + j);
		}
		}
		
		// foreach/versione enhanced  -> si usa esclusivamente con gli Array e le liste
		
		int[] numeri = {10,20,30,40,50};    // inizializzo un Array
		for(int numero: numeri) {   // per ogni numero che abbiamo in "numeri" si stampa un numero. Si parte dalla posizione 0 (10=posizione 0)
			System.out.println(numero);
		}
		
		// break & continue
		
		for (int y=0; y<7; y++) {   
			
			if(y == 5) {    // un break si usa quando si vuole rompere un ciclo, è una condizione per cui
			                // quando viene verificata si esce dal ciclo
				break;
			}
			System.out.println(y);
		}
		
		
        for (int z=0; z<7; z++) {   
			
			if(z == 5) {    // un continue si usa quando si vuole far saltare una iterazione al ciclo, è una condizione per cui
			                // quando viene verificata si salta quel valore
				continue;
			}
			System.out.println(z);
		}
		
		
	}

}
