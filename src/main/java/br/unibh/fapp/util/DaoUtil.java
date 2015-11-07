package br.unibh.fapp.util;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.metamodel.ListAttribute;

import br.unibh.fapp.entidade.Teste;

public class DaoUtil {

	public void save(Object objeto) {
		EntityManager em = HibernateUtil.pegaSessao();
		try {

			em.getTransaction().begin();
			em.persist(objeto);
			em.getTransaction().commit();
			System.out.println(objeto.toString() + " Salvo com sucesso");

		} catch (Exception e) {
			em.getTransaction().rollback();
			e.printStackTrace();
			System.out.println("Erro ao salvar:" + objeto.toString());
		} finally {
			em.close();
		}

	}

	public void delete(Object objeto, int id) {
		EntityManager em = HibernateUtil.pegaSessao();
		try {

			em.getTransaction().begin();
			objeto = em.find(objeto.getClass(), id);
			em.remove(objeto);
			em.getTransaction().commit();
			System.out.println(objeto.toString() + " Deletado com sucesso");

		} catch (Exception e) {
			em.getTransaction().rollback();
			e.printStackTrace();
			System.out.println("Erro ao deletar:" + objeto.toString());
		} finally {
			em.close();
		}

	}
	
	public Object find(Object objeto ,int id){
		EntityManager em = HibernateUtil.pegaSessao();
		try {

			em.getTransaction().begin();
			objeto = em.find(objeto.getClass(), id);
			em.getTransaction().commit();
			System.out.println(objeto.toString() + " Recuperado com sucesso");

		} catch (Exception e) {
			em.getTransaction().rollback();
			e.printStackTrace();
			System.out.println("Erro ao recuperar:" + objeto.toString());
		} finally {
			em.close();
		}
		
		return objeto;
		
		
	}
	
	public List<Object> findAll(Object object){
		
		EntityManager em = HibernateUtil.pegaSessao();

		try {
			
			em.getTransaction().begin();
			
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Erro ao recuperar Dados:");
		} 
		return  em.createQuery("Select t from  "+object.getClass().getName().substring(23)+" t" ).getResultList();

	}

}
