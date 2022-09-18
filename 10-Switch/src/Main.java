
/*
 * Switch
 * 
 * è un if con varie condizioni che serve per scrivere in modo più pulito e ordinato
 * suddividendo le condizioni in vari casi 
 */
import java.util.Scanner;

public class Main

{

	public static void main(String[] args) 
	
	{
		
	/*
		
		Scanner scanner = new Scanner(System.in);
		 
		
		System.out.println("nome personaggio: ");
		String nome = scanner.nextLine();
		scanner.close();
		
		if(nome == "Aragorn") 
		{
			System.out.println("re degli uomini");
		}
		else if(nome == "Sauron")
		{
			System.out.println("signore oscuro");
		}
		else if(nome == "Elrond")
		{
			System.out.println("re degli elfi");
		}
		else if(nome == "Gimli")
		{
			System.out.println("figlio di Gloin");
		}
	*/
 
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Your Team: ");
		String parola = scanner.nextLine();
		
		switch(parola)
		{
		case "WEST HAM":
			System.out.println("I'm forever blowing bubbles");
			break; // bisogna sempre mettere il break nello switch altrimenti continua a cercare
		case "CHELSEA":
			System.out.println("Blue is the color, football is the game");
			break;
		case "LIVERPOOL":
			System.out.println("You'll never walk alone!");
			break;
		case "SPURS":
			System.out.println("We have no titles...");
			break;
		case "MANCHESTER UNITED":
			System.out.println("Glory Glory Man United!");
			break;
			default: // un caso di default in caso in cui non si verifica nessuna delle condizioni precedenti
				System.out.println("I love Football!");
		}
		
		scanner.close();
		
	}

}
