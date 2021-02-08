package it.etlabora.generics;

import java.util.HashMap;
import java.util.Map;

import it.etlabora.generics.model.Animale;

public class EsperimentoMap {

	public static void main(String[] args) {

		Map<Integer, String> mappaNomi = new HashMap<Integer, String>();
		mappaNomi.put(123, "Alberto");
		mappaNomi.put(567, "Giuseppe");
		mappaNomi.put(1, "Luca");
		
		System.out.println(mappaNomi.get(567));
		
		mappaNomi.put(567, "Antonio");
		System.out.println(mappaNomi.get(567));
		
		Map<String, Animale> mappaAnimali = new HashMap<String, Animale>();
		
		Animale anim = new Animale();
		anim.setRazza("cane");
		anim.setNome("fido");
		mappaAnimali.put("K12HT", anim);
		
		Animale gatto = new Animale();
		gatto.setRazza("gatto");
		gatto.setNome("felix");
		mappaAnimali.put("G2HTT", gatto);
		
		System.out.println(mappaAnimali.get("G2HTT").getNome());

	}

}
