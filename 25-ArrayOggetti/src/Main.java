
/*
 *  Array di oggetti
 *  
 *  creare array di tipo oggetto vuoto
 *  creare oggtti
 *  assegnare oggetti come elementi array
 *  accedere agli elementi
 *  creare array con elementi già presenti
 */

public class Main {

	public static void main(String[] args) {

		/*
		String[] formazione = new String[11];
		
		formazione[0]  = "Buffon";
		formazione[1]  = "Zambrotta";
		formazione[2]  = "Cannavaro";
		formazione[3]  = "Materazzi";
		formazione[4]  = "Grosso";
		formazione[5]  = "Gattuso";
		formazione[6]  = "Pirlo";
		formazione[7]  = "Camoranesi";
		formazione[8]  = "Totti";
		formazione[9]  = "Del Piero";
		formazione[10] = "Toni";

		
		for(int i = 0; i < formazione.length; i++) {
			System.out.println(formazione[i]);
		}*/

		Calciatore[] calciatori = new Calciatore[4];
		
		Calciatore calciatore1 = new Calciatore("Maradona","Napoli","Argentina",10);
		Calciatore calciatore2 = new Calciatore("Totti","AS Roma","Italia",10);
		Calciatore calciatore3 = new Calciatore("Iniesta","Barcellona","Spagna",8);
		Calciatore calciatore4 = new Calciatore("Benzaema","Real Madrid","Francia",9);

		// abbiamo quindi 4 oggetti diversi di tipo Calciatore
		// andiamo quindi a mettere i nostri oggetti all'interno dell' array
		
		calciatori[0] = calciatore1;
		calciatori[1] = calciatore2;
		calciatori[2] = calciatore3;
		calciatori[3] = calciatore4;
		
       for(int i = 0; i < calciatori.length; i++) {
    	   System.out.print(calciatori[i] + "\n");
       }
       
		// come possiamo creare un array definendo già gli elementi 
		
        // Calciatore[] calciatori = {calciatore1, calciatore2, calciatore3, calciatore4}
 
		
	}

}
