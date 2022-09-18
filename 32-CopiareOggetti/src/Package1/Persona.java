package Package1;

public class Persona {

	public String nome;
	public String cognome;
	
	public Persona(String nome, String cognome) {

		this.nome = nome;
		this.cognome = cognome;
	}
	
	// copiare un oggetto tramite costruttore
	
	Persona(Persona persona){
		this.setNome(persona.getNome());
		this.setCognome(persona.getCognome());	}
	
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
	
	@Override
	public String toString() {
		return "Persona [nome=" + nome + ", cognome=" + cognome + "]";
	}
	
	// metodo per copiare l'oggetto in una diversa cella di memoria
	public void copy(Persona persona){
		this.setNome(persona.getNome());
		this.setCognome(persona.getCognome());
		
	}
		
}

