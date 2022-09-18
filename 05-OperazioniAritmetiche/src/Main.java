/*
 * Operazioni Aritmetiche
 * 
 * - operatori aritmetici: + - / * %
 * - versione shorthand per eseguire le operazioni di cui sopra
 * - incremento e decremento
 * - esempi di espressioni
 * 
 */

import java.util.Scanner; 


public class Main 
{
    
	public static void main(String[] args) 
	
	{
	  // 1 modo: con variabili date
      int x = 10;
      int y = 2;
      int z = x + y;
      System.out.println(z);
      System.out.println("********************");
      
      // 2 modo: con variabili da assegnare da tatiera
      Scanner scanner = new Scanner (System.in); // assegno il nuovo oggetto scanner
      
      System.out.print("primo valore: ");
      int x1 = scanner.nextInt();
      scanner.nextLine();
      System.out.print("secondo valore: ");
      int y1 = scanner.nextInt();
      scanner.nextLine();
      int z1 = x1 + y1;
      System.out.println("somma valori: " + z1);
      
      scanner.close();
      
      /*
       * operatore modulo --> %
       * alcuni esempi:
       * - se modulo di x / y == 0 allora il numero x è pari
       * - il modulo tra due numeri ritorna sempre il resto della divisione tra quei due numeri
      */
      
      // shorthand
      int a = 70;
      a = a + 30; // caso in cui voglio aggiungere 30 alla variabile a
      System.out.println("se: a = 70 .......allora... a = a + 30 = " + a);
      // applicazione di una scorciatoia shorthand 
      // a = a + 30 --> a += 30
      
      int i = 90;
      i += 30; // significa: "i" è uguale a se stesso, operatore aritmetico (+), qualcos'altro
      System.out.println("se: i = 90 .......allora... i += 30 = " + i);
      
      // incremento e decremento
      int b = 100; 
      b++; // incremento la b di 1 // equivale a b += 1
      System.out.println("se: b = 100.......allora... b++ = " + b);
      
      // esempi di espressioni
      // [(3+5)*3+(4-2)]*9 // su carta noi la scriveremmo così
      
      int c = 3;
      System.out.println("valore di c = " + c);
      int e = 9;
      System.out.println("valore di e = " + e);
      int d = 10;
      System.out.println("valore di d = " + d);
      int risultato = ((2+e)*c+(4+d))*c; // si usano solo le parentesi tonde
      System.out.println("risultato espressione: ((2+e)*c+(4+d))*c = " + risultato);
      
	}

}
