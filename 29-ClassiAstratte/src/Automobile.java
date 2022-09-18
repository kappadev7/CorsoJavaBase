
public class Automobile extends Veicolo {

	// un automobile è invece un oggetto che effettivamente utilizziamo
	// deriva dalla classe Veicolo
	
	// andremo a creare oggetti di tipo Automobile, non Veicolo
	
	// The type Automobile must implement the inherited abstract methods
	
	@Override
	void muovi() {

		System.out.println("la macchina si muove");
		
	}

	@Override
	void frena() {

		System.out.println("la macchina frena");
	
	}
	
	
}
