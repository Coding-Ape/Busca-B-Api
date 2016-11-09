package com.codingape.buscab.api.data;

import com.codingape.buscab.api.model.Bar;

/**
 * Created by rodrigo on 08/11/16.
 */
public interface BarDao {

    public void insert(Bar bar);

    public Bar get(Integer id);

    public void delete(Integer id);

}

