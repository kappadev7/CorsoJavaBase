package Package1;

public class Attaccante extends Calciatore{

	public Attaccante(String nome, String cognome, int numero) {
		super(nome, cognome, numero);
	}
	
	
	@Override
	public void entra() {
		System.out.println("cambio offensivo: entra in campo " + nome + " " + cognome + " con il numero " + numero);

	}

}
