package Package1;

/*
 * Casting
 * 
 * il casting è quel processo che modifica un tipo di dato
 * Implicito: automatico quando passiamo ad un tipo più ampio (int->double, float->double)
 * Esplicito: manuale quando passiamo ad un tipo più ristretto
 * 
 */
public class Main {

	public static void main(String[] args) {


		// casting implicito
		
		double x = 9; // pur avendo un int ci manda un double che è un tipo più ampio
		System.out.println(x);
		
		double y = 3.5f; 
		System.out.println(y);
		
		// casting esplicito 
		
		int z = (int) 9.5; 
		// bisogna fare il casting manualmente poichè int è meno ampio di double(perdi il .5)
		System.out.println(z);
		
		

		
	}

}
