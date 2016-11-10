package com.codingape.buscab.api.dao;


import com.codingape.buscab.api.exception.UserNotFoundException;
import com.codingape.buscab.api.model.Bar;

public interface IBarFinderDao {
	
	public Bar getBarById(String id) throws UserNotFoundException;
	
	public void addBar(Bar bar);
	
	public void deleteBar(String id);

}
