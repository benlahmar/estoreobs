package org.acme.services;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.acme.domaines.Categorie;

public class DAOCategorie implements CatRepo {

	public static Set<Categorie> categories=new HashSet<>();

	
	@Override
	public Categorie add(Categorie t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Categorie findById(Long k) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void Delete(Categorie t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Categorie> findBycritaire(Predicate<Categorie> prd) {
		
		return categories.stream()
		.filter(x->prd.test(x)).collect(Collectors.toList());
		
	}

}
