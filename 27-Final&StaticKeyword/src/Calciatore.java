
public class Calciatore {

	String name;
	String squadra;
	String nazione;
	int numero;
	static int numeroCalciatori;
	
	public Calciatore(String name, String squadra, String nazione, int numero) {

		this.name = name;
		this.squadra = squadra;
		this.nazione = nazione;
		this.numero = numero;
		numeroCalciatori++;
		System.out.println(numeroCalciatori);
	}

	@Override
	public String toString() {
		return "Calciatore [name=" + name + ", squadra=" + squadra + ", nazione=" + nazione + ", numero=" + numero
				+ "]";
	}


	void goal(Calciatore marcatore) {
		System.out.println("GOOOAAAALLLLL !!!!! goal di " + marcatore.name + " con assist di " + this.name );
	}
 
	static void team() {
		System.out.println("i membri della squadra sono: " + numeroCalciatori);
	}
}
