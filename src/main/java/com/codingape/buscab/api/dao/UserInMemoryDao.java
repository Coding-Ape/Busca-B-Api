package com.codingape.buscab.api.dao;


import com.codingape.buscab.api.exception.UserNotFoundException;
import com.codingape.buscab.api.model.Bar;
import com.codingape.buscab.api.model.User;
import jersey.repackaged.com.google.common.collect.Maps;

import java.util.Map;

public class UserInMemoryDao implements IUserDao {

	private Map<String, User> userList;

	public UserInMemoryDao() {
		userList = Maps.newHashMap();
	}

	@Override
	public User getUserById(String id) throws UserNotFoundException {
		User user = userList.get(id);
		return user;
	}

	@Override
	public void addUser(User user) {
		userList.put(user.getId(), user);
	}

	@Override
	public void deleteUser(String id) {
		userList.remove(id);
	}
}
