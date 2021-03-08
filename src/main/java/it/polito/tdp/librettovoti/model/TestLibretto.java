package it.polito.tdp.librettovoti.model;

import java.time.LocalDate;

public class TestLibretto {
	public static void main(String args[]) {
		
		
		
		Libretto libretto= new Libretto();
		
		Voto voto1 = new Voto("Analisi 1",30,LocalDate.of(2019, 2, 15));
		
		libretto.add(voto1);
		libretto.add(new Voto("Fisica 1",27,LocalDate.of(2019, 7, 23)));
		libretto.add(new Voto("Chimica 1",25,LocalDate.of(2019, 2, 11)));
		libretto.add(new Voto("Fisica 1",18,LocalDate.of(2019, 9, 1)));
		System.out.println(libretto.toString());
	}

}
