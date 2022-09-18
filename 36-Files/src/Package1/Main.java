package Package1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * Lavorare con i file
 * 
 * verificae se il file esiste nel progetto o nel computer
 * getPath, getAbsolutePath, isFile
 * eliminare file
 * scrivere in un file con filewriter: write e append
 * leggere un file con filereader
 * 
 */
public class Main {

	public static void main(String[] args) {

		// controllo se file esiste nel Java project in questione
		File file = new File("prova.txt");

		
		// prendo il path, l'absolute path e verifico che prova.txt sia un file

		if(file.exists()) {
			System.out.println("il file 1 esiste");
			System.out.println("path nel progetto: " + file.getPath()); // path relativo al progetto
			System.out.println("path assoluto: " + file.getAbsolutePath()); // path relativo al computer dove si sta lavorando
            System.out.println("è un file? " + file.isFile()); // verifico se è un file
		  // file.delete();      comando per eliminare il file
		
		}else {
			System.out.println("il file 1 non esiste");
		}
		
		// controllo se il file esiste nel computer
		File file2 = new File("C:\\Users\\andpo\\Desktop\\prova2.txt");
		
		if(file2.exists()) {
			System.out.println("il file 2 esiste");
		}else {
			System.out.println("il file 2 non esiste");
		}
		
		// per scrivere su di un file non dobbiamo piu utilizare l'oggetto file ma utilizzare invece l'oggetto filewriter
		try {
			FileWriter  writer = new FileWriter("prova.txt");
			// andiamo a scrivere qualcosa
			writer.write("Karim the Dream Benzema 9");
			// per aggiungere altre righe al file andiamo ad utilizzare il metodo append()
			writer.append("\nil nove più tecnico al mondo");
			writer.close();
		} catch (IOException e) {
 			e.printStackTrace();
		}
		
		// per leggere un file uso l'oggetto di tipo FileReader, legge in codice ASCII
		
		try {
			FileReader reader = new FileReader("prova.txt");
			int data = reader.read(); // legge la prima volta il file e prende il primo char. 
			                          // add catch clause
			
			// se il char letto non è -1(vuoto) allora vai dentro e stampalo
			while(data != -1) {      
				System.out.print((char)data); // bisogna fare la conversione al tipo carattere per l'attributo data
			    data = reader.read(); // leggi carattere 
			}
			System.out.println(data);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
		
		
		
		
		
		
		
	}

}
