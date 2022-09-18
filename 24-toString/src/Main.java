
/*
 *  metodo toString
 *  
 *  
 */

public class Main {

	public static void main(String[] args) {

		Calciatore calciatore = new Calciatore ("Ronaldo", "Nazario de Lima", 9, "Brazil");
		
		// System.out.println(calciatore);
		// se provassimo a stampare quanto sopra otterremmo:  Calciatore@75a1cd57
        // quanto ottenuto non sarebbe altro che la collocazione a livello di memoria, l'indirizzo, dove è salvato il nostro oggetto
				
		
		// System.out.println(calciatore.toString());
		// otterremmo lo stesso risultato anche se applicassimo il metodo toString()

		// quindi una volta eseguito l'override del metodo toString() nella classe Calciatore, posso mandare a schermo ciò che mi occorreva
		
		System.out.println(calciatore); // non c'è bisogno di applicare il to String() qui, già è stato applicato l'override
		
	}

}
