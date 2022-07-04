package org.acme.api;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import org.acme.domaines.Categorie;
import org.acme.observers.Logged;
import org.acme.observers.Validated;
import org.acme.services.DAOCategorie;
import org.acme.services.IDAOMemory;

@Path("categories")


public class CategorieApi {

	@Inject
	
	IDAOMemory dao;
	
	
	DAOCategorie cdao;
	
	
	@POST
	@Path("/add")
	@Produces(MediaType.APPLICATION_JSON)
	public Categorie add1(@QueryParam("lib") String lib,@QueryParam("id") long id)
	{
		 Categorie c=new Categorie();
		 c.setId(id);c.setLibelle(lib);
		dao.add(c);
		 return c;
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	
	public Response add(Categorie c)
	{
		
		 categories.add(c);
		URI uri=UriBuilder.fromResource(Categorie.class).path(Long.toString(c.getId())).build();
		return Response.created(
				uri)
				.build();
		
		 
	}
	
	@GET
	@Path("/{id}")
	@Logged
	public Response find(long id)
	{
		
		Categorie c = categories.stream()
		.filter(x->x.getId()==id).findFirst().get();
		return Response.ok(c).build();
	}
	
	@DELETE
	public void remove(Categorie c)
	{
		categories.remove(c);
	}
	
	@GET
	@Logged
	public Response all()
	{
		return dao.all();
		 
	}
	
	public Categorie findBetween(long id1, long id2)
	{
		return cdao.findBycritaire(x-> x.getId()<id2 && x.getId()>id1).get(0);
	}
	
	public List<Categorie> findBylibelle(String lib)
	{
		return cdao.findBycritaire(x-> x.getLibelle().contains(lib));
	}
	
}
