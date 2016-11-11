package com.codingape.buscab.api.services;


import com.codingape.buscab.api.exception.UserNotFoundException;
import com.codingape.buscab.api.model.User;
import com.codingape.buscab.api.repository.UserRepository;

public class UserService {

	private static UserService instance =null;

	private UserRepository repository = null;

	private UserService(){
		repository = new UserRepository();
	}
	
	public static UserService getInstance(){
		if (instance == null){
			instance= new UserService();
		}
		return instance;
	}
	
	public User getUser(String id) throws UserNotFoundException {
		return repository.getUser(id);
	}
	
	public void addBar(User user){
		repository.addUser(user);
	}
	
	public void deleteBar(String id){
		repository.deleteUser(id);
	}

}
