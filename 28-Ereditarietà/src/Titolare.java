
public class Titolare extends Calciatore {

	String ruolo;
	int goalUltime4Partite;


	public Titolare(String name, String squadra, String nazione, int numero, String ruolo, int goalUltime4Partite) {
		super(name, squadra, nazione, numero);
		this.ruolo = ruolo;
		this.goalUltime4Partite = goalUltime4Partite;
	}



	void statistiche(){
		System.out.println("giocando come " + ruolo + " ha realizzato nelle ultime 4 partite  " + goalUltime4Partite + " reti");
	}
}
