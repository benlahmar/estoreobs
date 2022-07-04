package org.acme.observers;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

import org.acme.domaines.Categorie;

import io.quarkus.arc.Priority;

@Logged
@Interceptor
@Priority(2004)
public class LoggedInterceptor {

	@AroundInvoke
	public Object abc(InvocationContext ctx)
	{
		Object rt = null;
		System.out.println("******appel a la méthode *******"+ctx.getMethod().getName());
		
		try {
			rt= ctx.proceed();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rt;
	}
}
