/*
 * Math Class: 
 * è una classe che ci permette di fare operazioni aritmetiche complesse
 * 
 * alcuni metodi: abs, min, max, pow, sqrt
 * attributi: PI
 */

public class Main 

{

	public static void main(String[] args) 
	
	{
		
	   double a = -2727.999777;
       System.out.println(Math.abs(a));       // abs() prende il valore assoluto
       System.out.println(Math.min(55,34));   // min() prende il valore minimo tra due valori
	   System.out.println(Math.max(45,32));   // max() prende il valore massimo tra due valori
	   System.out.println(Math.pow(5,2));     // equivale a 5 elevato alla seconda
	   System.out.println(Math.sqrt(25));     // radice quadrata di un numero
	   System.out.println(Math.PI);           // P greco 
	}

}
