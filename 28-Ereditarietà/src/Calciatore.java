
public class Calciatore {

	// classe padre
	String name;
	String squadra;
	String nazione;
	int numero;
	
	public Calciatore(String name, String squadra, String nazione, int numero) {

		this.name = name;
		this.squadra = squadra;
		this.nazione = nazione;
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Calciatore [name=" + name + ", squadra=" + squadra + ", nazione=" + nazione + ", numero=" + numero
				+ "]";
	}


	void goal() {
		System.out.println("rete di " + name);
	}
	

	void prestazione() {
		System.out.println("una prestazione strepitosa di " + name);
	}

	
	
 
	void sostituzione() {
		System.out.println("entra in campo " + name + " con il numero " + numero);
	}
}
