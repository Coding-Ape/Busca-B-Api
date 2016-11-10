package com.codingape.buscab.api.dao;


import com.codingape.buscab.api.model.Bar;
import jersey.repackaged.com.google.common.collect.Maps;

import java.util.Map;

public class BarFinderInMemoryDao implements IBarFinderDao {
	
	private Map<String, Bar> barList;
	
	public BarFinderInMemoryDao() {
		barList = Maps.newHashMap();
	}

	@Override
	public Bar getBarById(String id) {
		Bar bar = barList.get(id);
		return bar;
	}

	@Override
	public void addBar(Bar bar) {
		barList.put(bar.getId(), bar);
		
	}

	@Override
	public void deleteBar(String id) {
		barList.remove(id);
		
	}

}
