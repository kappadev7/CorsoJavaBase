
/*
 *  passare oggetti come parametri
 *  
 */
public class Main {

	// ogni volta che si vuole utilizzare un oggetto bisogna richiamare il tipo di dato
	
	public static void main(String[] args) {

		Calciatore calciatore1 = new Calciatore("Maradona","Napoli","Argentina",10);
		Calciatore calciatore2 = new Calciatore("Totti","AS Roma","Italia",10);
		Calciatore calciatore3 = new Calciatore("Iniesta","Barcellona","Spagna",8);
 
		calciatore1.goal(calciatore2);
		calciatore3.goal(calciatore1);

	}

}
