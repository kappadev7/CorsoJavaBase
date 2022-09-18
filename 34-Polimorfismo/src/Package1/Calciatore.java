package Package1;

public class Calciatore {

	protected String nome;
	protected String cognome;
	protected int numero;
	
	public Calciatore(String nome, String cognome, int numero) {

		this.nome = nome;
		this.cognome = cognome;
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public void entra() {
		System.out.println("entra in campo " + nome + " " + cognome + " con il numero " + numero);
	}
	
}
