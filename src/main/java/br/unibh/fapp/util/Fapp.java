package br.unibh.fapp.util;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import br.unibh.fapp.ws.Hello;

@ApplicationPath("/service")
public class Fapp extends Application{

	 @Override
	    public Set<Class<?>> getClasses() {
	        final Set<Class<?>> returnValue = new HashSet<Class<?>>();
	        returnValue.add(Hello.class);
	        return returnValue;
	    }
	
}
