package Package1;

import java.util.HashMap;

/*
 * HashMap
 * 
 * cosa sono
 * crearne una
 * aggiungere elementi
 * accedere agli elementi
 * rimuovere un elemento
 * pulire hashmap
 * 
 */
public class Main {

	public static void main(String[] args) {

    // a differenza delle arraylist ci permettono di salvare degli elementi come chiavi valore
		
		HashMap<String, String> capitani = new HashMap<String, String>();
	    // HashMap<chiave, valore>
		
		capitani.put("Chelsea", "Lampard");
		capitani.put("Real Madrid", "Raul");
		capitani.put("Roma", "Totti");
		capitani.put("Arsenal", "Henry");
		
		System.out.println("*•.¸♡ IL TITTI MAGGICOOOOO!!!!!  ♡¸.•*\r\n");
        System.out.println(capitani.get("Arsenal"));
        System.out.println();
		System.out.println("*•.¸♡ I PIU GRANDI CAPITANI ♡¸.•*\r\n");
		System.out.println(capitani);
		
		// rimuovere un valore dalla mappa --> capitani.remove("valore_da_rimuovere");
		// pulire l'intera mappa ------------> capitani.clear();
		
	}	
	
	
	

}
