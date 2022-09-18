package Package1;

/*
 * Copiare oggetti
 * 
 * tramite metodo
 * tramite costruttore
 */

public class Main {

	public static void main(String[] args) {

		Persona persona1 = new Persona("Luka", "Modric");
		Persona persona2 = new Persona("Karim", "Benzema");
        Persona persona3 = new Persona("Edin", "Dzeko");
		
        // copiare oggetto tramite metodo csotruttore
        Persona persona4 = new Persona(persona2);
        System.out.println(persona4);
        
		System.out.println();
		// copiare un oggetto tramite metodo
	    // copio l'oggetto persona1 in persona2 grazie al metodo copy()
	    persona2.copy(persona1);
		persona1.setNome("Pallone d'oro");
		
		System.out.println(persona1);
		System.out.println(persona2);
		System.out.println(persona3);
		System.out.println();
		System.out.println(persona1.getNome());
		System.out.println(persona1.getCognome());
	    System.out.println();
		System.out.println(persona2.getNome());
		System.out.println(persona2.getCognome());
	    System.out.println();
	    System.out.println(persona3.getNome());
	    System.out.println(persona3.getCognome());
	
	    
	}

}
