package com.codingape.buscab.api.resource;

import com.codingape.buscab.api.data.BarDao;
import com.codingape.buscab.api.data.DummyBarDao;
import com.codingape.buscab.api.model.Bar;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by rodrigo on 08/11/16.
 */
@Path("/search")
public class SearchResource {

    BarDao dao = DummyBarDao.instance();

    @GET
    @Produces (MediaType.APPLICATION_JSON)
    public Bar probarBar (){
        return dao.get(1);
    }


    @PUT
    @Produces (MediaType.APPLICATION_JSON)
    @Consumes (MediaType.APPLICATION_JSON)
    public Bar insertarBar (Bar bar){
        dao.insert(bar);
        return bar;
    }

    @DELETE
    public void borrarBar (Integer id){
        dao.delete(id);
    }
}
