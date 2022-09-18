import java.util.ArrayList;

/*
 * ArrayList
 * 
 * Le arraylist sono array ridimensionabili, accettano però solo tipi di dato reference
 * 
 * creare un ArrayList
 * aggiungere elementi add()
 * mandare a schermo elementi get()
 * modificare elementi set()
 * rimuovere elementi remove(), clear()
 * ArrayList 2D
 * 
 */
public class Main {

	public static void main(String[] args) {

		// accettano solo tipi di dato reference quindi per esempio si usa Integer e non int
		
		ArrayList<String> heroes = new ArrayList<String>();
		
		heroes.add("Aragorn");
		heroes.add("Legolas");
		heroes.add("Gimli");
		
		// si usa il metodo get() per prendere elementi in una data posizione dell ArrayList
		System.out.println(heroes.get(0));  // restituirà il valore nella posizione 0(la prima) del nostro ArrayList

		System.out.print("[ ");
		for(int i=0; i < heroes.size(); i++) {
			System.out.print(heroes.get(i)+ " ");
		}
		System.out.println(" ]");
		
		
		// si usa il metodo set() per modificare il valore in una determinata posizione del nostro ArrayList
		heroes.set(1, "Gandalf");
		System.out.println(heroes.get(1));
		
		
		// remove() rimuovo il valore presente nella posizione dell ArrayList indicata, che quindi diventa occupata dal valore che era il successivo
		heroes.remove(0);
		System.out.println(heroes.get(0)); // stampa il valore che era nella posizione 1 che si è andato a collocare nella posizione 0

		
		// clear() pulisce il nostro ArrayList
		heroes.clear();
		System.out.print("[ ");
		for(int i=0; i < heroes.size(); i++) {
			System.out.print(heroes.get(i)+ " ");
		}
		System.out.println(" ]");
		
		
		// ArrayList 2D
		
		ArrayList<ArrayList<String>> personaggi = new ArrayList();
		
		ArrayList <String> buoni = new ArrayList<String>();
		buoni.add("Frodo");
		buoni.add("Sam");
		buoni.add("Faramir");
		buoni.add("Galadriel");

		
		ArrayList<String> cattivi = new ArrayList<String>();
		cattivi.add("Sauron");
		cattivi.add("Shagrat");
		cattivi.add("Lurtz");
		cattivi.add("Gorbag");

		
		personaggi.add(buoni);
		personaggi.add(cattivi);
		
		for(int i=0; i < personaggi.size(); i++) {
			System.out.println();
			for(int j=0; j < personaggi.get(i).size(); j++) {
				System.out.print(personaggi.get(i).get(j) + " "); 
			}
		}
		
		
		
		
	}

}
