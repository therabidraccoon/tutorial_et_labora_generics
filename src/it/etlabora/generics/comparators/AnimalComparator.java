package it.etlabora.generics.comparators;

import java.util.Comparator;

import it.etlabora.generics.model.Animale;

public class AnimalComparator implements Comparator<Animale> {

	@Override
	public int compare(Animale o1, Animale o2) {
		int ret = 1;
		if (o1.getNome().equals(o2.getNome()) && o1.getRazza().equals(o2.getRazza())) {
			ret = 0;
		}
		return ret;
	}

}
