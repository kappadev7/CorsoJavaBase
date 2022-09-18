package Package2;

import Package1.*;   // * ---> significa tutto, importo tutto il contenuto del pacchetto1

// per far derivare C dalla classe A ho bisogno di importare il pacchetto in cui A è contenuta

public class C extends A {   // per derivare dalla classe A ho bisogno di importare il pacchetto in cui A è contenuta

	public static void main(String[] args) {
	C prova = new C();
	System.out.println("⋇⋆✦⋆⋇‧͙⁺˚*･༓☾ " + prova.eroe + " ☽༓･*˚⁺‧͙⋇⋆✦⋆⋇\r\n");
	
    }
}
