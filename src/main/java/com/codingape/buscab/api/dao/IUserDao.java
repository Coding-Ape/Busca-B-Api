package com.codingape.buscab.api.dao;

import com.codingape.buscab.api.exception.UserNotFoundException;
import com.codingape.buscab.api.model.User;

/**
 * Created by rodrigo on 10/11/16.
 */
public interface IUserDao {

    public User getUserById(String id) throws UserNotFoundException;

    public void addUser(User user);

    public void deleteUser(String id);
}
