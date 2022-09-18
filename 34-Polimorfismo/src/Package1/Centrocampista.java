package Package1;

public class Centrocampista extends Calciatore{

	public Centrocampista(String nome, String cognome, int numero) {
		super(nome, cognome, numero);

	}
	@Override
	public void entra() {
		System.out.println("c'è bisogno di idee a centrocampo: entra in campo " + nome + " " + cognome + " con il numero " + numero);

	}


}
