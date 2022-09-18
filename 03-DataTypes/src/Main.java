/*
 * Tipi di dati: primitive e reference
 * 
 * - nome del tipo di dato | valore che può assumere il dato | quanto occupa il dato
 * 
 * - boolean | true(0) : false(1) | 1bit89
 * 
 *   valori interi:
 * - byte | -128 : 127 | 1 byte
 * - short | -32768 : 32767 | 2 bytes
 * - int | -2 miliardi : 2 miliardi | 4 bytes
 * - long | -9 quintilioni : 9 quintilioni | 8 bytes
 * 
 *   valori decimali:
 * - float | numero con 6-7 cifre decimali | 4 bytes
 * - double | numero con 15 cifre decimali | 8 bytes
 * 
 * - char | singolo carattere/lettere/ASCII 'f' | 2 bytes
 * - String | sequenza di caratteri "ciao da Tenerife" | variabile
 * 
 */
public class Main
{

	public static void main(String[] args) 
	
	{
		
				
       boolean ilBoolean = true;         // boolean   //primitive
	   byte ilByte = 127;                // byte      //primitive
	   short loShort = -32767;           // short     //primitive
	   int unInt = 2_000_000_000;        // int       //primitive
	   long ilLong = 2_000_000_000_00l;  // long      //primitive
	   
	   float ilFloat = 5.3030303030f;    // float     //primitive
	   double ilDouble = 5.303030303030; // double    //primitive
	   
	   char ilChar = 'f';                // char      //primitive
	   
	   // una strigna è un insieme di caratteri
	   String laStringa = "ciao da Tenerife";   // string    //reference
	   
	   /*
	    * la dfferenza tra un tipo di carattere primitive e uno di tipo refernce è che 
	    * i primitivi ci vengono forniti da java cosi comè sono e cominciano tutti con la minuscola
	    * invece i tipi di dati che cominciano con la maiuscola sono di tipo reference, gli altri dati 
	    * tipo reference ce li dovremo creare noi.
	    * 
	    * altra cosa che differenzia i dati di tipo reference con i dati di tipo primitive sono gli attributi 
	    * disponibili, o metodi.
	   */
	 System.out.println("BOOLEAN : " + ilBoolean);
	 System.out.println("BYTE : " + ilByte);
	 System.out.println("SHORT : " + loShort);
	 System.out.println("INT : " + unInt);
	 System.out.println("LONG : " + ilLong);
     System.out.println("FLOAT : " + ilFloat);
     System.out.println("DOUBLE : " + ilDouble);
     System.out.println("CHAR : " + ilChar);
     
	 System.out.println("STRINGA : " + laStringa);
	 
	 // le reference portano con se una serie di attributi e metodi che possiamo utilizzare
	 System.out.println(laStringa.toUpperCase());// laStringa.toUpperCase() 
	                                             // le ho applicato un metodo che stampa la stringa con caratteri maiuscoli
	}

}
