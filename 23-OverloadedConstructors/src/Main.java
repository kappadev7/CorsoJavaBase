
/*
 *  Overloaded Constructors
 *  
 *  Cosa sono?
 *  Creare class 
 *  Creare multipli costruttori
 *  
 */

public class Main {
	
	public static void main(String[] args) {
		
  // gli Overloaded Methods sono metodi con lo stesso nome ripetuto più volte, 
  // la cui signature è però diversa (numero diverso di parametri o combinazione di tipi di dato differenti)


	// quindi, un costruttore è un metodo ed anche esso può essere "overloaded"

	// creo diversi tipi di parametri... utilizzo quindi stesso nome ma signature diversa
	// sono quindi tutti costruttori diversi ma con lo stesso nome
		
	Calciatore calciatore1 = new Calciatore("De Rossi","Centrocampista","AS Roma",16);
	Calciatore calciatore2 = new Calciatore("Centrocampista","Napoli",10);
	Calciatore calciatore3 = new Calciatore("AS Roma",10);
	Calciatore calciatore4 = new Calciatore("Ronaldinho","Barcellona");
	}
}
