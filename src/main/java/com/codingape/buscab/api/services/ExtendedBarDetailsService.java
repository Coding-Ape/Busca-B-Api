package com.codingape.buscab.api.services;

import com.codingape.buscab.api.exception.UserNotFoundException;
import com.codingape.buscab.api.model.ExtendedBarDetails;
import com.codingape.buscab.api.repository.ExtendedBarDetailsRepository;

/**
 * Created by rodrigo on 09/11/16.
 */
public class ExtendedBarDetailsService {

    private static ExtendedBarDetailsService instance =null;

    private ExtendedBarDetailsRepository repository = null;

    private ExtendedBarDetailsService(){
        repository = new ExtendedBarDetailsRepository();
    }

    public static ExtendedBarDetailsService getInstance(){
        if (instance == null){
            instance= new ExtendedBarDetailsService();
        }
        return instance;
    }

    public ExtendedBarDetails getBar(String id) throws UserNotFoundException {
        return repository.getExtendedBarDetails(id);
    }

    public void addBar(ExtendedBarDetails bar){
        repository.addBar(bar);
    }

    public void deleteBar(String id){
        repository.deleteBar(id);
    }
}
