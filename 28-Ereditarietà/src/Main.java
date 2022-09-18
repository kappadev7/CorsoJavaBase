/*
 * Ereditarietà
 * 
 * cos è l'ereditarietà
 * creare classi figlie di una classe padre
 * metodi e attributi aggiuntivi
 * overriding di metodi (@Override)
 * costruttore classi figlie e super keyword
 * 
 */
public class Main {

	public static void main(String[] args) {

		// l'ereditarietà è quel meccanismo che permette ad una classe di derivare da un altra classe ed ereditarne metodi e attributi
		
		// creeremo la classe Squadra che sarà ereditatà dalle classi Titolari e Panchinari

		System.out.println("⋇⋆✦⋆⋇⋇⋆✦⋆⋇⋇⋆✦⋆⋇ GOOOOOOOOALLLLLLL!!! ⋇⋆✦⋆⋇⋇⋆✦⋆⋇⋇⋆✦⋆⋇\r\n");
		
		Calciatore calciatore1 = new Calciatore("Maradona","Napoli","Argentina",10);
		calciatore1.goal();
		
		System.out.println();
		System.out.println("⋇⋆✦⋆⋇⋇⋆✦⋆⋇⋇⋆✦⋆⋇ GOOOOOOOOALLLLLLL!!! ⋇⋆✦⋆⋇⋇⋆✦⋆⋇⋇⋆✦⋆⋇\r\n");

		Titolare titolare1 = new Titolare("Totti","AS Roma","Italia",10 ,"Attaccante", 7 );
	    titolare1.goal();
	    
        System.out.println();
		System.out.println("⋇⋆✦⋆⋇⋇⋆✦⋆⋇⋇⋆✦⋆⋇ SOSTITUZIONE ⋇⋆✦⋆⋇⋇⋆✦⋆⋇⋇⋆✦⋆⋇\r\n");

	    Panchinaro panchinaro1 = new Panchinaro("Iniesta", "Barcellona", "Spagna", 8, 63, 27);
	    panchinaro1.sostituzione();
	    
	    // grazie al concetto di ereditarietà, una sottoclasse (in questo caso Pnachinaro e Titolare)
	    // può avere accesso ai metodi e alle proprietà della superclasse
	    
	    // mando a schermo metodi e attributi esclusivi della classe Titolare
	    System.out.println();
		System.out.println("⋇⋆✦⋆⋇⋇⋆✦⋆⋇⋇⋆✦⋆⋇ STATISTICHE ⋇⋆✦⋆⋇⋇⋆✦⋆⋇⋇⋆✦⋆⋇\r\n");
        titolare1.statistiche();
        
	    // mando a schermo metodi e attributi esclusivi della classe Panchinaro
        System.out.println();
		System.out.println("⋇⋆✦⋆⋇⋇⋆✦⋆⋇⋇⋆✦⋆⋇ NUOVA SOSTITUZIONE ⋇⋆✦⋆⋇⋇⋆✦⋆⋇⋇⋆✦⋆⋇\r\n");
        panchinaro1.minutaggio();
        
        // applico il metodo che ho sottoposto ad overriding
        System.out.println();
		System.out.println("⋇⋆✦⋆⋇⋇⋆✦⋆⋇⋇⋆✦⋆⋇ PRESTAZIONE DEL CAPITANO ⋇⋆✦⋆⋇⋇⋆✦⋆⋇⋇⋆✦⋆⋇\r\n");
        titolare1.prestazione(); // il metodo prestazione() è il medesimo della superclasse Calciatore
        System.out.println();
        // essendo stato applicato l'override il metodo prestazione() è quello sovrascritto nella classe Panchinaro
		System.out.println("⋇⋆✦⋆⋇⋇⋆✦⋆⋇⋇⋆✦⋆⋇ PRESTAZIONE DEL MAGO ⋇⋆✦⋆⋇⋇⋆✦⋆⋇⋇⋆✦⋆⋇\r\n");
        panchinaro1.prestazione(); 
        
	}

}
