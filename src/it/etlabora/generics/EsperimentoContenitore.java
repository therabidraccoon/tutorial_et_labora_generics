package it.etlabora.generics;

import it.etlabora.generics.esempio.Contenitore;
import it.etlabora.generics.model.Animale;

public class EsperimentoContenitore {

	public static void main(String[] args) {
		Contenitore<String> contStringa = new Contenitore<String>();
		contStringa.setContenuto("ciao sono ivan");
		
		System.out.println(contStringa.getContenuto());
		
		Contenitore<Animale> contAnimale = new Contenitore<Animale>();
		
		Animale anim = new Animale();
		anim.setRazza("cane");
		anim.setNome("fido");
		contAnimale.setContenuto(anim);
		System.out.println(contAnimale.getContenuto().getNome());
		
	}
	
}
