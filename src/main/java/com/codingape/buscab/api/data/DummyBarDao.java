package com.codingape.buscab.api.data;

import com.codingape.buscab.api.model.Bar;
import jersey.repackaged.com.google.common.collect.Maps;
import jersey.repackaged.com.google.common.collect.Sets;

import java.util.Map;
import java.util.Set;

/**
 * Created by rodrigo on 08/11/16.
 */
public class DummyBarDao implements BarDao{

    private Map<Integer, Bar> barList;

    private static DummyBarDao instance = null;

    private DummyBarDao (){
        barList = Maps.newHashMap();
    }

    public static BarDao instance(){
        if (instance==null){
            instance=new DummyBarDao();
        }
        return instance;
    }

    @Override
    public void insert(Bar bar) {
        barList.put(bar.getId(),bar);
    }

    @Override
    public Bar get(Integer id) {
        return barList.get(id);
    }

    @Override
    public void delete(Integer id) {
        barList.remove(id);
    }
}
