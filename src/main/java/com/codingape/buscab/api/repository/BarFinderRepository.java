package com.codingape.buscab.api.repository;


import com.codingape.buscab.api.dao.BarFinderInMemoryDao;
import com.codingape.buscab.api.dao.IBarFinderDao;
import com.codingape.buscab.api.exception.UserNotFoundException;
import com.codingape.buscab.api.model.Bar;

public class BarFinderRepository {
	
	private IBarFinderDao barDao;
	
	public BarFinderRepository(){
		barDao = new BarFinderInMemoryDao();
	}
	
	public Bar getBar (String id) throws UserNotFoundException {
		return barDao.getBarById(id);
	}
	
	public void addBar(Bar bar){
		barDao.addBar(bar);
	}
	
	public void deleteBar (String id){
		barDao.deleteBar(id);
	}

}
