/* 
 * Perchè imparare Java:
 * - top 3 linguaggi più popolari
 * - usato a livello aziendale (framework Spring), giochi (Minecraft), web app e android
 * 
 * alcune definizioni:
 * - API --> Application Programming Interface: è un insieme di procedure atte all'espletamento 
 *           di un dato compito; spesso tale termine designa le librerie software di un linguaggio
 *           di programmazione.
 * - front-end --> la parte visibile all'utente di un programma e con cui egli può interagire
 * - back-end --> la parte di un programma che permette l'effettivo funzionamento delle interazioni 
 *                tra utente e l'interfaccia del programma stesso.
 * - framework --> è un'architettura logica di supporto sul quale un software può essere progettato e realizzato,
 *                 spesso facilitandone lo sviluppo da parte del programmatore.
 *                
 * - framework Spring --> è un framework open source per lo sviluppo di applicazioni su piattaforma Java.
 *                        
 * 
 * Come funziona
 * - i computer ragionano solo con codice macchina (basso livello) binario 00000001 00000010 00000011 
 * - noi scriviamo source code (alto livello) in file.java
 * - java viene poi compilato ovvero tradotto in codice macchina
 * - quando però compiliamo il codice è specifico per il sistema operativo(Mac, Windows ecc...)
 * - ecco che allora java mette a disposizione uno step intermedio 
 *   source code --> compiler --> byte code --> jvs --> machine code
 *   
 * JVM: Java Virtual Machine è contenuto nel JDK ed è ciò che ci permette di far runnare java, quindi
 *      è ciò che prende il byte code che ci arriva dal compiler e lo traduce in machine code.
 *      La macchina allora, ci darà il risultato del nostro programma.
 * JDK: Java Development Kit che contiene JRE, non è altro che un kit quindi un insieme di cose, che ci permettono
 *      di sviluppare Java.
 * JRE: Java Runtime Environment contiene librerie e toolkits
 * 
 * JDK --> JRE --> JVM
 * 
 * Ci serve un IDE
 * IDE: integrate development environment (ambiente di sviluppo)
 * - eclipse, intellij e vsc
 * 
 */


// il file Main.java è il file da cui partirà tutto il programma.
// Java è un linguaggio di programmazione orientato agli oggetti

public class Main //la classe Main riprende il nome del file 


{

	public static void main(String[] args)
	
	//il metodo del file principale che manda a schermo qualcosa e che esegue il programma è il:
	//public static void main(String[]args)
	
	{
        System.out.println("I BELONG TO JESUS \n"); //System--> legge tutto il programma
                                                 //out--> dice al sistema di mandare qualcosa fuori
                                                 //print--> dice al sistema di stampare
                                                 //ln--> nuova riga (potremmo usare anche \n nella "stringa")
        System.out.println("I LOVE MY FAMILY");   
        
	}

}
