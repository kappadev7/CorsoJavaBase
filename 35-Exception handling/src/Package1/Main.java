package Package1;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Exception handling
 * 
 * esempi con ArithmeticException e InputMismatchException
 * try catch e finally
 */
public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		// il try mi dice prova ad eseguire tutta questa porzione di codice 
		// nel catch si indica il tipo di exception: tipo nomevariabileditipoexception)
		// try {codice che provi ad eseguire} catch (tipo di eccezione){che faccio se trovo l'eccezione} 
		
		try {
		System.out.print("dividendo: ");
		int x = scanner.nextInt();

		
		System.out.print("divisore: ");
		int y = scanner.nextInt();
		
		int result = x/y;
		
		System.out.println("risultato: " + result);
		}catch(ArithmeticException e
			){System.out.println("non si può dividere per zero....");
		}catch(InputMismatchException e
				) {System.out.println("non si può dividere un numero per una stringa");
		}finally {
			System.out.println("eseguito comunque");
		}
		
		// finally è un blocco di codice che viene eseguito alla fine a prescindere
		scanner.close();
		
		// una exception arriva quando c'è una situazione che non è un errore di compilazione ma bensì un evento
		// che potrebbe succedere e che va ad alterare il flusso del programma andandolo spesso a stoppare.
	}

}
