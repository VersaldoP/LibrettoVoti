package it.polito.tdp.librettovoti.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Libretto {

	private List<Voto> voti;

	public Libretto() {
		
		this.voti = new ArrayList<>();
	}
	public void add(Voto v) {
	
	for(Voto c:voti) {
		if(c.getNome().equals(v.getNome())) {
	     return;
	     
		}
	}
	this.voti.add(v);
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
	 
	public Libretto  migliorato(){
		List<Voto> m =new ArrayList<>();
		for(Voto v: voti) {
			if((v.getVoto()>=18)&&(v.getVoto() <24)) {
				v.setVoto(v.getVoto()+1);
				
				m.add(v);
			}
			else {
				if((v.getVoto()>=24)&&(v.getVoto() <29)) {
					v.setVoto(v.getVoto()+2);
					
					m.add(v);
					
					
				}
				else {
					m.add(v);
				}
			}
		}
		Libretto lm= new Libretto();
		for(Voto c:m) {
			lm.add(c);
			
		}
		return lm;
	}
	 
	public Libretto ordina() {
		LinkedList<Voto> temp= new LinkedList<>();
		for(Voto v : this.voti) {
			temp.add(v);
		}
		Collections.sort(temp,new ComparatoreVoti());
		Libretto ltemp= new Libretto();
		for(Voto vv:temp) {
			ltemp.add(vv);
		}
		
		
		
		return ltemp;
		
	}
	public Libretto cancella(int i) {
		List<Voto> tempv= new ArrayList<>();
		for(Voto v:this.voti) {
			if(v.getVoto()>=i) {
			tempv.add(v);
			}
		}
		Libretto templ = new Libretto();
		for(Voto l:tempv) {
			templ.add(l);
		}
		return templ;
		
	}

	
	
	
	@Override
	public String toString() {
		String s = "";
				for(Voto v: this.voti) {
					s= s+ v.toString();
				}
		return s;
	}
	
	
	
	
	
	
}
