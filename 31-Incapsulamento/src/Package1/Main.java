package Package1;

/*
 * Incapsulamento
 * 
 * è il processo in cui nascondiamo attributi di una classe dall'esterno(rispetto ad altre classi) mettendoli private
 * diventano accessibili solo tramite dei metodi (getters/setters)
 * 
 * creiamo classe persona
 * aggiungiamo attributi private
 * definiamo getters e setters
 * 
 */
public class Main {

	public static void main(String[] args) {

		System.out.println("⋇⋆✦⋆⋇‧͙⁺˚*･༓☾ APPLICO GETTERS ☽༓･*˚⁺‧͙⋇⋆✦⋆⋇\r\n");

		Persona persona = new Persona("Luka", "Modric");
		System.out.println(persona.getNome() + " " + persona.getCognome());
        
		System.out.println();
        
		System.out.println("⋇⋆✦⋆⋇‧͙⁺˚*･༓☾ APPLICO SETTERS ☽༓･*˚⁺‧͙⋇⋆✦⋆⋇\r\n");
		
		persona.setNome("Karim");
		persona.setCognome("Benzema");
		System.out.println(persona.getNome() + " " + persona.getCognome());
	
	}

}
