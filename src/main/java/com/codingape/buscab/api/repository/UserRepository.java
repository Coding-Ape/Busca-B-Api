package com.codingape.buscab.api.repository;

import com.codingape.buscab.api.dao.IUserDao;
import com.codingape.buscab.api.dao.UserInMemoryDao;
import com.codingape.buscab.api.exception.UserNotFoundException;
import com.codingape.buscab.api.model.User;

public class UserRepository {

    private IUserDao userDao;

    public UserRepository (){
        userDao =  new UserInMemoryDao();
    }

    public User getUser (String id) throws UserNotFoundException {
        return userDao.getUserById(id);
    }

    public void addUser(User user){
        userDao.addUser(user);
    }

    public void deleteUser(String id){
        userDao.deleteUser(id);
    }

}
