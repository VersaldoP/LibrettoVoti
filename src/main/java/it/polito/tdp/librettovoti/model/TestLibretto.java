package it.polito.tdp.librettovoti.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TestLibretto {
	public static void main(String args[]) {
		
		
		
		Libretto libretto= new Libretto();
		Libretto m= new Libretto();
		
		
		Voto voto1 = new Voto("Analisi 1",30,LocalDate.of(2019, 2, 15));
		
		libretto.add(voto1);
		libretto.add(new Voto("Fisica 1",27,LocalDate.of(2019, 7, 23)));
		libretto.add(new Voto("Chimica 1",25,LocalDate.of(2019, 2, 11)));
		libretto.add(new Voto("Fisica 1",18,LocalDate.of(2019, 9, 1)));
		libretto.add(new Voto("Fisica 2",18,LocalDate.of(2019, 9, 1)));
		libretto.add(new Voto("Fsk",21,LocalDate.of(2019, 9, 1)));
		libretto.add(new Voto("tdp",30,LocalDate.of(2019, 9, 1)));
		libretto.add(new Voto("pwr ",19,LocalDate.of(2019, 9, 1)));
		libretto.add(new Voto("diritto",23,LocalDate.of(2019, 9, 1)));
		libretto.add(new Voto("eoa",18,LocalDate.of(2019, 9, 1)));
		libretto.add(new Voto("Fisica 1",18,LocalDate.of(2019, 9, 1)));
		libretto.add(new Voto("Fisica 1",18,LocalDate.of(2019, 9, 1)));
		
		
		System.out.println(libretto.toString());
		List<Voto> venticinque = libretto.listaVotiUguali(25) ;
//		System.out.println(venticinque);
		
		
		Voto analisi = libretto.ricercaCorso("Analisi 1");
//		System.out.println(analisi);
//		m = libretto.migliorato();
//		 m=(Libretto) migliorato;
		m= libretto.cancella(24);
		
		System.out.println( m.toString());
		
	}

}
