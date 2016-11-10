package com.codingape.buscab.api.resource;


import com.codingape.buscab.api.exception.UserNotFoundException;
import com.codingape.buscab.api.model.Bar;
import com.codingape.buscab.api.services.BarFinderService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * bar resource (exposed at "bar" path)
 */
@Path("api/bar")
public class BarResource {

	/**
	 * Method handling HTTP GET requests. The returned object will be sent to
	 * the client as "text/plain" media type.
	 *
	 * @return String that will be returned as a text/plain response.
	 */
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Bar getIt(@PathParam("id") String id) {
		try {
			Bar wantedBar = BarFinderService.getInstance().getBar(id);
			return wantedBar;
		} catch (UserNotFoundException e) {
			throw new RuntimeException ("uia exploto todo");
		}
	}

	@PUT
	@Path("/")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response saveBar(Bar bar) {
		BarFinderService.getInstance().addBar(bar);
		return Response.status(200).build();

	}

	@DELETE
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response deleteBar(@PathParam("id") String id) {
		BarFinderService.getInstance().deleteBar(id);
		return Response.status(200).build();
	}
}
