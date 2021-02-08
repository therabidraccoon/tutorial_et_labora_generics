package it.etlabora.generics;

import java.util.ArrayList;
import java.util.List;

import it.etlabora.generics.model.Animale;

public class EsperimentoList {

	public static void main(String[] args) {

		List<String> listaNomi = new ArrayList<>();

		listaNomi.add("Alberto");
		listaNomi.add("Giuseppe");
		listaNomi.add("Giuseppe");


		for (int i = 0; i < listaNomi.size(); i++) {
			System.out.println(listaNomi.get(i));
		}

		List<Animale> listaAnimali = new ArrayList<Animale>();
		for (int i = 0; i < 10; i++) {
			Animale tmp = new Animale();
			tmp.setRazza("razza" + i);
			tmp.setNome("nomeanimale" + i);
			listaAnimali.add(tmp);
			listaAnimali.add(tmp);
		}

		for (Animale pippo : listaAnimali) {
			System.out.println("Ciao sono " + pippo.getNome() + " e sono un " + pippo.getRazza());
		}
	}

}
