package org.acme;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.acme.services.Calc;

@Path("/hello")

public class ExampleResource {

	@Inject
	Calc calc;
	
	

	@GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from RESTEasy Reactive orange";
    }
    
	@GET
	@Path("/som")
	
    public Calc  somm()
    {
    	return calc;
    }
    
}