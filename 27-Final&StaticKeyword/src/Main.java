
/*
 * 
 * final e static keyword
 * 
 * final 
 * static
 * 
 */
public class Main {

	public static void main(String[] args) {


	// normalmente posso modificare il valore di una variabile.
    System.out.println("⋇⋆✦⋆⋇⋇⋆✦⋆⋇⋇⋆✦⋆⋇ KEWYWORD FINAL ⋇⋆✦⋆⋇⋇⋆✦⋆⋇⋇⋆✦⋆⋇\r\n");
	int prova = 5;
	prova = 10; 
	System.out.println(prova);
	
	
	// final indica una variabile che non può essere modificata nel corso del  programma

	final int IMMUTABLE = 6;
	System.out.println(IMMUTABLE);
	System.out.println();

	// static significa che quell'attributo è univoco per tutte le istanze di quella classey
	
	System.out.println("⋇⋆✦⋆⋇⋇⋆✦⋆⋇⋇⋆✦⋆⋇ contatore di oggetti ⋇⋆✦⋆⋇⋇⋆✦⋆⋇⋇⋆✦⋆⋇\r\n");
	
	Calciatore calciatore1 = new Calciatore("Maradona","Napoli","Argentina",10);
	Calciatore calciatore2 = new Calciatore("Totti","AS Roma","Italia",10);
	Calciatore calciatore3 = new Calciatore("Iniesta","Barcellona","Spagna",8);
	Calciatore calciatore4 = new Calciatore("Benzaema","Real Madrid","Francia",9);
	System.out.println();

	System.out.println("⋇⋆✦⋆⋇⋇⋆✦⋆⋇⋇⋆✦⋆⋇ numero di calciatori ⋇⋆✦⋆⋇⋇⋆✦⋆⋇⋇⋆✦⋆⋇\r\n");
	System.out.println("numero di calciatori: " + Calciatore.numeroCalciatori);
	System.out.println();

	System.out.println("⋇⋆✦⋆⋇⋇⋆✦⋆⋇⋇⋆✦⋆⋇ KEWYWORD STATIC ⋇⋆✦⋆⋇⋇⋆✦⋆⋇⋇⋆✦⋆⋇\r\n");
	System.out.println(calciatore1);  // gli attributi dell'oggetto Calciatore differiscono per ogni istanza della classe
	System.out.println();

	// volendo che un attributo sia condiviso, che sia uguale per più oggetti, dobbiamo renderlo statico e risulterà quindi condiviso in comune tra le istanze
	System.out.println("⋇⋆✦⋆⋇⋇⋆✦⋆⋇⋇⋆✦⋆⋇ membri della squadra ⋇⋆✦⋆⋇⋇⋆✦⋆⋇⋇⋆✦⋆⋇\r\n");

    // metodo statico
	Calciatore.team();
	
	}

}
