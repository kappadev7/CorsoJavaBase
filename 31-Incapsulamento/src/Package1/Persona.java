package Package1;

public class Persona {

	private String nome;
	private String cognome;
	
	public Persona(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
	}

	// get permette di accedere alle proprietà
	public String getNome() {
		return nome;
	}

	// set permette di andare a modificare gli attributi 
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
   // l'unico modo in cui noi possiamo mandare fuori qualcosa da una classe sono i metodi
	
	
	
}


