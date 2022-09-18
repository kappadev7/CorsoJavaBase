
public class Calciatore {

	String nome;	
	String ruolo;
	String squadra;
	int numero;
	
	// genero il metodo costruttore
	
	// applico l'overloading al metodo costruttore per potere generare costruttori
	// con nome uguale ma signature (quantità di parametri e tipo) differente
	
	// quindi avremo lo stesso costruttore che viene chiamato (nel Main) in base al tipo di parametro che si va a prendere
	
	public Calciatore(String nome, String ruolo, String squadra, int numero) {
		
		this.nome = nome;
		this.ruolo = ruolo;
		this.squadra = squadra;
		this.numero = numero;
		System.out.println(" calciatore: " + nome + "\n" + " ruolo: " + ruolo + "\n" + " squadra: " + squadra + "\n" + " numero di maglia: " + numero);
        System.out.println("************************************************************************");

	}
	
    public Calciatore( String ruolo, String squadra, int numero) {
		
		this.ruolo = ruolo;
		this.squadra = squadra;
		this.numero = numero;
		System.out.println(" ruolo: "  +ruolo  + "\n" + " squadra: " + squadra + "\n" + " numero di maglia: " + numero);
        System.out.println("************************************************************************");
	}
	
    public Calciatore( String squadra, int numero) {
	
	this.squadra = squadra;
	this.numero = numero;
	System.out.println(" squadra: " + squadra + "\n" + " numero di maglia: " + numero);
    System.out.println("************************************************************************");

}

    public Calciatore(String nome, String squadra ) {
    	
    	
    this.squadra = squadra;
	this.nome = nome;
	System.out.println(" calciatore: " + nome + "\n" + " squadra: " + squadra );
    System.out.println("************************************************************************");

}

	
}
