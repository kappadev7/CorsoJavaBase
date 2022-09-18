/*
 * ARRAY 2D o MATRICI
 * 
 * cosa sono gli array 2D
 * creare un array 2D in entrambi i modi
 * accedere agli elementi degli array
 * ciclare con for
 * 
 */
public class Main {

	// gli array 2D sono array di array 
	
	public static void main(String[] args) {

	// la matrice sarebbe la rappresentazione sottoforma di un array di una tabella
		
		// il primo array conterrà tutte le classi
		// il secondo array contiene gli alunni all'interno delle classi
		
		String[][] classi = new String[3/*numero di classi*/][5/*numero studenti*/];
		
		// riempio manulamente la matrice
		
		classi[0][0] = "Luca";         // 1 studente della 1 classe
		classi[0][1] = "Marco";        // 2 studente della 1 classe
		classi[0][2] = "Mario";        // 3 studente della 1 classe
		classi[0][3] = "John";         // 4 studente della 1 classe
		classi[0][4] = "Paul";         // 5 studente della 1 classe
		
		classi[1][0] = "Sara";         // 1 studente della 2 classe
		classi[1][1] = "Jessica";      // 2 studente della 2 classe
		classi[1][2] = "Adriano";      // 3 studente della 2 classe
		classi[1][3] = "Mike";         // 4 studente della 2 classe
		classi[1][4] = "Eleonora";     // 5 studente della 2 classe
		
		classi[2][0] = "Elisa";        // 1 studente della 3 classe
		classi[2][1] = "Francesca";    // 2 studente della 3 classe
		classi[2][2] = "Ana";          // 3 studente della 3 classe
		classi[2][3] = "Mark";         // 4 studente della 3 classe
		classi[2][4] = "Robert";       // 5 studente della 3 classe
		
		System.out.println(classi[2][1]); // mando a schermo lo studente nella posizione 1(il secondo) della classe 2(la terza classe)
		
		// mando a schermo la matrice col for classico che prende le righe + un for annidato che prende gli elementi
		for(int classe = 0; classe < classi.length; classe++) {
			System.out.println();
			for (int studente = 0; studente < classi[classe].length; studente++) {
				
				// non vado a capo co "println" poichè occorre rappresentare gli studenti della stessa classe sulla stessa riga
				System.out.print(classi[classe][studente]+ " ");
				
			}
			
		}
		
		System.out.println();
		System.out.println("*********************************************************");
		
		// inizializzare una matrice
		String[][] nomi = {
				{"ste","and", "val", "ele"},
				{"marc", "mass", "matt", "sar"},
				{"ale", "eli", "pep", "gio"},
			
		};
		
		// stampo una matrice con un foreach 
		for(String[]nome/*sarebbe la riga...che è appunto un array di stringhe*/: nomi/*è quindi un array di array di stringhe*/) {
			System.out.println();
			for(String ele: nome ) {        // ele(i) rappresenta un valore iesimo di ogni singolo array(riga)
				System.out.print(ele +" ");
			}
			
		}
	}

}
