package org.acme.services;

import javax.ws.rs.core.Response;

import org.acme.domaines.Categorie;

public interface IDAOMemory {

	public Response add(Categorie c);
	public Response all();
}
