package it.polito.tdp.librettovoti.model;

import java.util.ArrayList;
import java.util.List;

public class Libretto {

	private List<Voto> voti;

	public Libretto() {
		
		this.voti = new ArrayList<>();
	}
	public void add(Voto v) {
		voti.add(v);
	}
	
	public List<Voto> listaVotiUguali(int punteggio){
		List<Voto> risultato= new ArrayList<>();
		for(Voto v:this.voti) {
			if(v.getVoto()==punteggio) {
				risultato.add(v);
			}
		}
		return risultato;
	}
	
	public Voto ricercaCorso(String corso){
		Voto risultato=null;
		for(Voto v:this.voti) {
			if(v.getNome().equals(corso)) {
				risultato=v;
				break;
			}
		}
		return risultato;
	}
	
	
	
	@Override
	public String toString() {
		String s = "";
				for(Voto v: this.voti) {
					s= s+ v.toString() +"\n";
				}
		return s;
	}
	
	
	
	
	
}
