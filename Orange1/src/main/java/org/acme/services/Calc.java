package org.acme.services;

import javax.inject.Singleton;

@Singleton
public class Calc {

	public int somme(int a, int b)
	{
				return a+b;
	}
		public int prd(int a, int b)
		{
			return a*b;
		}
}
