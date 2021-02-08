package it.etlabora.generics;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import it.etlabora.generics.comparators.AnimalComparator;
import it.etlabora.generics.model.Animale;

public class EsperimentoSet {

	public static void main(String[] args) {
		Set<String> setNomi = new HashSet<String>();
		setNomi.add("Luca");
		setNomi.add("Giuseppe");
		setNomi.add("Luca");
		setNomi.add("Andrea");
		setNomi.add("Alberto");

//		for(String nome : setNomi) {
//			System.out.println(nome);
//		}
		
		Set<Animale> setAnimali = new TreeSet<Animale>(new AnimalComparator());

		Animale anim = new Animale();
		anim.setRazza("cane");
		anim.setNome("fido");
		setAnimali.add(anim);
		
		Animale secAnim = new Animale();
		secAnim.setRazza("cane");
		secAnim.setNome("fido");
		setAnimali.add(secAnim);

		Animale terAnim = new Animale();
		terAnim.setRazza("gatto");
		terAnim.setNome("felix");
		setAnimali.add(terAnim);

		
		Animale quarAnim = new Animale();
		quarAnim.setRazza("mucca");
		quarAnim.setNome("boh");
		setAnimali.add(quarAnim);

		
		for(Animale a : setAnimali) {
			System.out.println(a.getRazza() + " - " + a.getNome());
		}
	}
	
}
