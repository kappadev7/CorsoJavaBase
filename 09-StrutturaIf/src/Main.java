
/*
 * Condizioni con If
 * 
 * -IF
 * -ELSE
 * -ELSE IF 
 * -IF annidati
 * -ternary operator
 */

import java.util.Scanner;


public class Main 


{

	public static void main(String[] args)
	
	{
       // IF 
		
		boolean isOnline = true;
		
		if(isOnline) // if(!isOnline) --> esempio classico di dove usare il NOT logico
		{
			System.out.println("è online"); //comandi eseguiti se la condizione è verificata
		}
		// ELSE
		else // sta per altrimenti
		{
			System.out.println("non è online");
		}
		System.out.println("****************************************");
		
	    
	    Scanner scanner = new Scanner(System.in);
	     
	    
	    System.out.println();
		String nome = scanner.nextLine();

		if(nome.equals("Elisa"))
		{
			System.out.println("Elisa ti amo");
		}
		else if (nome.equals("Andrea"))
		{
			System.out.println("Andrea ama Elisa");
		}
		else 
		{
			System.out.println("nessuno si ama come loro");
		}
		
		   
		
		String nome1 = "Elisa";
		
		if(nome1 == "Elisa")
		{
			System.out.println("Elisa ti amo");
		}
		else if (nome1 == "Andrea")
		{
			System.out.println("Andrea ama Elisa");
		}
		else 
		{
			System.out.println("nessuno si ama come loro");
		}
		
		// if annidati
		int numero = 7;
		
		if(numero < 10) // se il numero è minore di 10 entri qua dentro -->
		{
			System.out.println("è minore di 10");
			if(numero % 2 == 0)
			{
				System.out.println("è pari");

			}
			else 
			{
				System.out.println("è dispari");
			}
		}
		else 
		{
			System.out.println("è maggiore di 10"); // non entra nell'if annidato
		}
		// quando facciamo un if dentro un if è perchè abbiamo bisogno di step separati
		
		
		// ternary operator
		
		/*In Java, the ternary operator is a type of Java conditional operator.
		 * The meaning of ternary is composed of three parts. The ternary operator (? :) 
		 * consists of three operands. It is used to evaluate Boolean expressions. 
		 * The operator decides which value will be assigned to the variable.
		 * It is the only conditional operator that accepts three operands. 
		 * It can be used instead of the if-else statement. It makes the code much more easy, 
		 * readable, and shorter.
		 */
		
		
	   String x = (3 < 10 ? "si":"no"); 
	          //            true : false
	 System.out.println(x);
	   

	 System.out.println("************************************************************");
	 

	 
	 System.out.println("nuovo numero: ");
      int nuovo = scanner.nextInt();
      
      scanner.nextLine();
      
	 
	 if(nuovo < 18) // se il numero è minore di 10 entri qua dentro -->
		{
			System.out.println("è minore di 18");
			if(nuovo % 2 == 0)
			{
				System.out.println("è pari");

			}
			else 
			{
				System.out.println("è dispari");
			}
		}
		else 
		{
			System.out.println("è maggiore di 18"); // non entra nell'if annidato
		}
	 
		scanner.close();
	   
	}

}
