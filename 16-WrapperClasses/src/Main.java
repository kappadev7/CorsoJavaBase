
/*
 * Wrapper Class
 * 
 * le wrapper class permettono di utilizzare dati primitivi come reference
 * 
 * boolean -----> Boolean
 * char --------> Character
 * int ---------> Integer
 * double ------> Double
 * 
 */
public class Main {

	public static void main(String[] args) {

		// la grande differenza tra tipi di dati primitivi e tipi di dati reference è che 
		// i dati reference ci permettono di utilizzare metodi. iniziano con la maiuscola

		// wantaggio delle wrapper class è di poter accedere a metodi ma sono più lente
		
		// tecnicamente è una primitiva che viene impacchettata(BOXING) come reference. quando si fanno operazioni vengono invece spacchettate(UNBOXING)
		
		
		/*
		 * 
		 * Boxing, unboxing e autoboxing
           Esaminiamo l'autoboxing in Java: la caratteristica che consente di lavorare con tipi primitivi e tipi wrapper in maniera intercambiabile.
           
        BOXING
        In Java generalmente ci occupiamo di utilizzare e definire oggetti come istanze di una classe, quindi con metodi e attributi. 
        Ma per motivi pratici abbiamo spesso a che fare con tipi primitivi (int, double, boolean, ...) che non sono oggetti, ma "tipi semplici".

        Prima dell'introduzione dell'autoboxing programmando in Java ci trovavamo nella necessità di convertire un tipo primitivo nella sua corrispondente 
        classe wrapper. Lo spezzone di codice che segue potrebbe non risultarvi nuovo:
        
        *********************************************
        Integer x = new Integer (10);
        Double y = new Double (5.5);
        Boolean z = Boolean.parseBoolean("true");
        *********************************************
        *
        Queste operazioni sono note come operazioni di boxing, cioè "inscatolamento" del tipo primitivo nel relativo tipo wrapper al fine di utilizzare un 
        oggetto e tutte le sue proprietà (ad esempio porre un intero in una lista o operazioni che hanno necessità di maneggiare oggetti).
           
        AUTOBOXING
        Veniamo alla novità introdotta da Java 1.5 con un esempio pratico:
        
        *********************************************
        Integer x = 10;
        Double y = 5.5f;
        Boolean z = true;
        Number n = 0.0f;
        *********************************************
        
        Attraverso autoboxing gli oggetti scritti nello spezzone di codice vengono automaticamente creati con i valori di riferimento dettati, 
        senza generare errori. Questo permette di scrivere codice più leggibile e maneggevole.
        Chiaramente alla funzione di boxing è associata l'operazione di unboxing che trae gli stessi vantaggi della precedente:
        
        Esempio di operazione di UNBOXING 
        *********************************************
        int x = -1;
        Integer y = x;
        *********************************************
        
        Il linguaggio si arricchisce, permettendo allo sviluppatore di non preoccuparsi delle operazioni di conversione (boxing e uboxing, appunto)
        lasciandole al compilatore del bytecode che si occuperà di gestirle per noi (autoboxing).
        A basso livello la situazione non è affatto cambiata, la macchina virtuale che esegue il bytecode non ha avuto cambiamenti; 
        ciò che cambia è a livello di compilazione. Infatti le operazioni di conversione a livello di bytecode sono quelle che avremmo svolto manualmente, 
        solo che ci viene in aiuto il compilatore preoccupandosi di effettuarle lui in automatico per noi.


        
		 */
		Boolean vero = true;
		Character carattere = 'a';
		Integer num = 77;
		Double virgola = 5.34;
		String stringa = "Contea";
		
		
		boolean a = true;
		char b = 'a';
		int c = 5;
		double d = 5.23;
		
		
		// Boolean Reference è uguale a boolean primitivo
		
		if(vero == a) {
			System.out.println("ciao");
		}
		
		Integer nuovo = c; // esempio di unboxing
		
		
		
		
	}

}
