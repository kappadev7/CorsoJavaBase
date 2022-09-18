package Package1;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * Iteratori 
 * 
 * un iteratore è un oggetto che cicla una collezione (ArrayList)
 * loop di un ArrayList
 * rimuovere un elemento
 * 
 */

public class Main {

	public static void main(String[] args) {

		ArrayList<String> campioni = new ArrayList<String>();
		campioni.add("Ronaldinho");
		campioni.add("Bergkamp");
		campioni.add("Gallas");
		campioni.add("Pires");
		
		// prende elemento per elemento, bisogna quindi assegnarli un tipo di dato
		// import iteroator from java.util
		Iterator<String> it = campioni.iterator();
		// mandiamo a schermo il primo ciclo di iterazione
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());

		// iterare l'intero ArrayList
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
		
		
		// come rimuovere/modificare un elemento dall ArrayList
		ArrayList<String> numeri10 = new ArrayList<String>();
		numeri10.add("Baggio");
		numeri10.add("Maradona");
		numeri10.add("Totti");
		numeri10.add("Del Piero");
		Iterator<String> it1 = numeri10.iterator();

		while(it1.hasNext()) {
			String numero10 = it1.next();
			if(numero10 == "Del Piero") {
				it1.remove();
			}
		}
		System.out.println(numeri10);

		
	}

}
