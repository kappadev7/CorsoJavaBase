

public class mioCapitano {

	String name;    // abbiamo definito una variabile fuori da un metodo (scope globale)
	String surname;
	int numero;
	String colorePreferito;
	
	// lo scope globale sono le variabili definite fuori dai metodi
	 
	mioCapitano(String name, String surname, int numero, String colorePreferito){

		
		this.name = name;
		this.surname = surname;
		this.numero = numero;
		this.colorePreferito = colorePreferito;
	}
	
	void intro() {
		// int variabileLocale = 5;    // abbiamo definito una variabile dentro ad un metodo (scope locale)  
	System.out.println("il mio capitano è " + this.name + " " + this.surname + " " + this.numero);
	}
	
	void cognome (){
		System.out.println(this.surname); 
		// siamo dentro a un metodo, ma ho accesso alla variabile surname poichè il suo scope è globale
	}
	
	
	
	
	
	
	// lo scope locale è quando le variabili sono inserite all'interno di metodi (compreso il constructor)

	
	void scopeLocale(int goalRoma, int goalNazionale) {
        int goalCarriera = goalRoma + goalNazionale;
        System.out.println("I gol del Capitano in carriera: " + goalCarriera);
        System.out.println("****************************************************");
	    this.prova(goalCarriera); // passo la variabile lcoale "goalCarriera" al metodo prova()
	}
	
	/* 
	void prova() {
		System.out.println(I gol del Capitano in carriera: " + goalCarriera);  
		
		// non trova la variabile "goalCarriera" poichè è stato creata in un altro metodo e quindi non può accedervi
	}
	*/


	
	// se vogliamo passare ad altri metodi una variabile locale dobbiamo per forza passarla come parametro
	// sotto ho passato la vriabile locale goalCarriera (rinominandola goalCarriera2) come parametro, al metodo prova()
	
	void prova(int goalCarriera2) {
		System.out.println("passo la variabiele locale: " + goalCarriera2);
	}
	
	
	
}
