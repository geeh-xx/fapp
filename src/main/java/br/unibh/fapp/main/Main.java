package br.unibh.fapp.main;

import java.util.ArrayList;
import java.util.List;

import br.unibh.fapp.entidade.Teste;
import br.unibh.fapp.util.DaoUtil;

public class Main {

	public static void main(String[] args) {

		
		Teste teste = new Teste();
		teste.setNome("teste");
		DaoUtil dao = new DaoUtil();
//		dao.save(teste);
		
//		dao.delete(teste, 1);
	
		Teste teste2 = new Teste();	
//		teste2 = (Teste) dao.find(teste, 2);
		
//		System.out.println(teste2.getNome());
	
		List<Teste> listaTeste = new ArrayList<Teste>();
		
		listaTeste =  dao.findAll();
		
		for (Teste teste3 : listaTeste) {
			
			System.out.println(teste3.getNome());
		}
		
	}
	
}
