package com.codingape.buscab.api.services;


import com.codingape.buscab.api.exception.UserNotFoundException;
import com.codingape.buscab.api.model.Bar;
import com.codingape.buscab.api.repository.BarFinderRepository;

public class BarFinderService {
	
	private static BarFinderService instance =null;
	
	private BarFinderRepository repository = null;
	
	private BarFinderService(){
		repository = new BarFinderRepository();
	}
	
	public static BarFinderService getInstance(){
		if (instance == null){
			instance= new BarFinderService();
		}
		return instance;
	}
	
	public Bar getBar(String id) throws UserNotFoundException {
		return repository.getBar(id);
	}
	
	public void addBar(Bar bar){
		repository.addBar(bar);
	}
	
	public void deleteBar(String id){
		repository.deleteBar(id);
	}

}
