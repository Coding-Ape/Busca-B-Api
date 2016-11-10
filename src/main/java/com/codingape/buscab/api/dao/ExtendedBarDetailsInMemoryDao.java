package com.codingape.buscab.api.dao;


import com.codingape.buscab.api.model.ExtendedBarDetails;
import jersey.repackaged.com.google.common.collect.Maps;

import java.util.Map;

public class ExtendedBarDetailsInMemoryDao implements IExtendedBarDetailsDao {

	private Map<String, ExtendedBarDetails> barList;

	public ExtendedBarDetailsInMemoryDao() {
		barList = Maps.newHashMap();
	}

	@Override
	public ExtendedBarDetails getBarById(String id) {
		ExtendedBarDetails bar = barList.get(id);
		return bar;
	}

	@Override
	public void addBar(ExtendedBarDetails bar) {
		barList.put(bar.getId(), bar);
	}

	@Override
	public void deleteBar(String id) {
		barList.remove(id);
		
	}

}
