package br.unibh.fapp.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HibernateUtil {

	public static EntityManager pegaSessao(){
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("teste");
		EntityManager em = factory.createEntityManager();
	
		return em;
	}
	
}
