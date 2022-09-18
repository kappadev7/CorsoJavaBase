package Package1;

/*
 * Polimorfismo
 * 
 * è la capacità di un oggetto di identificarsi con più tipi di dato
 * 
 * 
 */
public class Main {

	public static void main(String[] args) {

		Centrocampista centrocampista1 = new Centrocampista("Luka", "Modric",10);
		Attaccante attaccante1 = new Attaccante("Karim","Benzema",9);
		
		// utilizzando il polimorfismo, sappiano che i due oggetti di tipo Centrocampista e di tipo Attaccante
		// sono in grado di cambiare forma ed identificarsi in un altro tipo: Calciatore

		Calciatore[] calciatori = {centrocampista1, attaccante1};
		
		// il metodo entra() è ereditato dalla classe Calciatore e reso differete per le classi Attaccante e Centrocampista grazie all Override
		for(Calciatore calciatore : calciatori) {
			calciatore.entra();
		}
		


	}

}
