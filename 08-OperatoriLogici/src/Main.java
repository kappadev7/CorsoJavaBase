
/*
 * Operatori Logici
 * 
 * operatori logici sono operatori che ci permettono di mettere una logica alle nostre condizioni
 * 
 * 
 * operatori: 
 * - AND --> &&
 * - OR -->  ||
 * - NOT --> !
 * 
 */

public class Main 

{

	public static void main(String[] args) 
	
	{
        boolean x = 3 < 10 && 3 % 2 == 0; // caso 1 due condizioni legate tra loro 
        boolean y = 27 < 7 || 27 % 9 == 0 ;
        System.out.println(x);  // caso 1 devono essere ambedue soddisfatte
        
        System.out.println(y); // caso 2 deve essere almeno 1 soddisfatta 
        boolean z = 4 > 9;                       
        System.out.println(!z);       // ! -->  4 NON è maggiore di 9    --> true
        System.out.println(!(39<99)); // ! --> 39 NON è maggiore di 99   --> false
	
        boolean a = (3 < 10 && 3 % 2 == 0) || ( 6 < 10 && 6 % 2 == 0);
        //             true && false       ||     true && true   --> true
        // sarebbe a dire: è almeno una delle due macrocondizioni tra parentesi verificata?
	    System.out.println(a);
	
	}

}
