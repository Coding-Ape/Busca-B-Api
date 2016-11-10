package com.codingape.buscab.api.repository;

import com.codingape.buscab.api.dao.ExtendedBarDetailsInMemoryDao;
import com.codingape.buscab.api.dao.IExtendedBarDetailsDao;
import com.codingape.buscab.api.exception.UserNotFoundException;
import com.codingape.buscab.api.model.ExtendedBarDetails;

public class ExtendedBarDetailsRepository {

    private IExtendedBarDetailsDao extendedBarDetailsDao;

    public ExtendedBarDetailsRepository (){
        extendedBarDetailsDao =  new ExtendedBarDetailsInMemoryDao();
    }

    public ExtendedBarDetails getExtendedBarDetails (String id) throws UserNotFoundException {
        return extendedBarDetailsDao.getBarById(id);
    }

    public void addBar(ExtendedBarDetails bar){
        extendedBarDetailsDao.addBar(bar);
    }

    public void deleteBar (String id){
        extendedBarDetailsDao.deleteBar(id);
    }

}
