
public class Panchinaro extends Calciatore {

	// la classe figlia eredita dalla classe padre le proprietà e metodi, grazie ad "extends"
    // devo applicare il metodo costruttore dalla superclasse
	// source --> generate constructor form superclass
	
	
	// introduco metodi e attributi aggiuntivi della sottoclasse Panchinaro
	
	int minuto;
	int minutiRimanenti;
	
	// la sottoclasse Pnachinaro avrà gli stessi attributi di quella padre Calciatore, essendo un panchinaro comunque un calciatore...
	
	public Panchinaro(String name, String squadra, String nazione, int numero, int minuto, int minutiRimanenti) {
		super(name, squadra, nazione, numero); // super sta per "sopra" fa riferimento alla classe che è sopra ed è il costruttore
		                                       // quindi si usa solo per i costruttori delle sotoclassi
		this.minuto = minuto;
		this.minutiRimanenti = minutiRimanenti;
	}
	
	void minutaggio() {
		System.out.println("con il numero " + numero + " entra in campo " + name + " al minuto " + minuto + ", giocherà i rimanenti " + minutiRimanenti + " minuti");
	}
	
	// applico l'override di un metodo presente nella superclasse
	// è un metodo che non è proprietario della classe Panchinaro ma deriva dalla superclasse Calciatore
	@Override
	void prestazione() {
		System.out.println("un ingresso in campo da sogno e subito decisivo per " + name);
	}

}
