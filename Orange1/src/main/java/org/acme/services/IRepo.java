package org.acme.services;

import java.util.List;
import java.util.function.Predicate;

public interface IRepo<T, K> {

	public T add(T t);
	public T findById(K k);
	public void Delete(T t);
	
	List<T>  findBycritaire(Predicate<T>  prd);
}
