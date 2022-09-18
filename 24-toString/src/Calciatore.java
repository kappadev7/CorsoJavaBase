
public class Calciatore {

	String nome;
	String notoCome;
	int numero;
	String nazione;
	
	public Calciatore(String nome, String notoCome, int numero, String nazione) {

		this.nome = nome;
		this.notoCome = notoCome;
		this.numero = numero;
		this.nazione = nazione;
	}
	
	
	// abbiamo fatto l'override del metodo toString() creando la nostra stringa, che è un recap degli attributi del nostro oggetto
	
	public String toString() {
		String stringa = this.nome + "\n" + this.notoCome + "\n" + this.numero + "\n" + this.nazione;
		return stringa;
	}
}

