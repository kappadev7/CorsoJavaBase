package Package1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/*
 * Data e ora in java
 * data, ora, date e ora
 * formattare date
 */
public class Main {

	public static void main(String[] args) {

		// data attuale       anno/mese/giorno
		LocalDate x = LocalDate.now();
		System.out.println(x);
		
		// tempo attuale coi millisecondi
		LocalTime t = LocalTime.now();
		System.out.println(t);
		
		// date e tempo attuali insieme
		LocalDateTime y = LocalDateTime.now();
		System.out.println(y);
		
		// data formattata
		LocalDate ita = LocalDate.now();
		DateTimeFormatter i = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		System.out.println(ita.format(i));
		
	}

}
