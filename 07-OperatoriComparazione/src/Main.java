/*
 * Operatori di Comparazione:
 * servono a comparare dei nuemeri tra loro
 * 
 * operatori:
 * >
 * >=
 * <
 * <=
 * ==
 * !=
 * 
 */

public class Main

{

	public static void main(String[] args) 
	
	{
	  // operatori di comparazione >  >= < <= == !=
      
      boolean risultato = 3 > 10; 
      System.out.println("è 3 maggiore di 10? " + risultato);
      
      boolean risultato1 = 44 >= 44; 
      System.out.println("è 44 maggiore o uguale di 44? " + risultato1);
      
      boolean risultato2 = 33 < 24; 
      System.out.println("é 33 minore di 24? " + risultato2);
      
      
      boolean risultato3 = 5 <= 55; 
      System.out.println("è 5 minore o uguale di 55? " + risultato3);
      
      
      boolean risultato4 = 2 == 34;    // = -->  è un assegnazione
                                       // == --> è un operatore di confronto
      System.out.println("è 2 uguale a 34? " + risultato4);
      
      
      boolean risultato5 = 13 != 77; 
      System.out.println("è 13 diverso da 77? " + risultato5);
      
      // comparare tornerà utile quando si vorrà creare strutture di controlo if
      
      int a = 9;
      int b = 3;
      int c = 33;
      int d = 11;
      int e = a/b;
      int f = c/d;
      boolean comparazione = e == f; 
      System.out.println("dati i valori: " + "A = " + a + "   B = " + b + "   C = " + c + "   D = " + d);
      System.out.println("A diviso B è uguale a C diviso D? " + comparazione);
	}

}
