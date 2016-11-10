package com.codingape.buscab.api.dao;

import com.codingape.buscab.api.exception.UserNotFoundException;
import com.codingape.buscab.api.model.ExtendedBarDetails;

public interface IExtendedBarDetailsDao {

    public ExtendedBarDetails getBarById(String id) throws UserNotFoundException;

    public void addBar(ExtendedBarDetails bar);

    public void deleteBar(String id);
}
