/*
 * User Input
 * come accettare input dell'utente dal terminale:
 * 
 * importare java.util.Scanner
 * creare ogetto scanner
 * creare domande per utente: nome, cognome, eta citta
 * 
 */

import java.util.Scanner; //abbiamo importato lo scanner dalle utility di java


public class Main {

	public static void main(String[] args) 
	
	{
		Scanner scanner = new Scanner(System.in);
	// tipo di dato reference | nome dell'oggetto = new | tipo di dato (input)
		
		System.out.print("il tuo nome: ");
	    String nome = scanner.nextLine(); 
	// associamo alla variabile nome l'oggetto scanner col metodo nextLine()--> scanner.nextLine()
	// quella cosa che ci arriva dentro dalla prossima riga dello scanner, quindi dal terminale, dovrà essere associata al nome
		
		System.out.print("il tuo cognome: ");
		String cognome = scanner.nextLine();

	    System.out.print("la tua eta: ");
		int eta = scanner.nextInt(); // quando prendiamo un intero il modulo diventa nextInt()
		                             // il nextInt() non sposta il cursore nella nuova riga quindi 
		                             // bisogna inserire un altro nextLine()
	    scanner.nextLine();
		
		System.out.print("la tua citta: ");
		String citta = scanner.nextLine();
		
		System.out.print("*********************************** ");
		System.out.print("soggetto: " + nome + " " + cognome + " di " + eta + " anni, che vive a " + citta); //concatenazione testo + variabile
		System.out.println(" ***********************************");
        
		System.out.print("sei single? ");
		boolean single = scanner.nextBoolean();
		scanner.nextLine();
		
		System.out.println("patrimonio: ");
		float patrimonio = scanner.nextFloat();
		scanner.nextLine();

		
		System.out.println("single? " + single + "\n" + "patrimonio: " + patrimonio);
		
        System.out.print("STIPENDIO MENSILE: ");
        final int STIPENDIO_MENSILE = scanner.nextInt();
        scanner.nextLine();
        System.out.println("spese personali: ");
        int spesePersonali = scanner.nextInt();
        scanner.nextLine();
        int saldoFineMese = STIPENDIO_MENSILE - spesePersonali;
        System.out.println("Saldo a fine mese: " + saldoFineMese);
        
        scanner.close();
	}

}
