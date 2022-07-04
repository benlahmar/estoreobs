package org.acme.services;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

import javax.ws.rs.core.Response;

import org.acme.domaines.Categorie;
import org.acme.observers.Validated;

public class DaoMemory implements IDAOMemory {

	@Validated(min = 10, max = 1000)
	public static Set<Categorie> categories=new HashSet<>();
	@Override
	public Response add(Categorie c) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response all() {
		// TODO Auto-generated method stub
		
		return null;
	}

	
}
