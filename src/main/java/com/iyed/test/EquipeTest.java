package com.iyed.test;

import com.iyed.dao.EquipeDao;
import com.iyed.entities.Equipe;

public class EquipeTest {
	public static void main(String[] args) {
		
		// créer un objet equipe
		Equipe e = new Equipe();
		e.setNomEquipe("Real Madrid");
		e.setNomTerrain("Santiago Bernabéu");
		e.setBudgetAnnuel(100023);
		
		Equipe e2 = new Equipe();
		e2.setNomEquipe("Barcelona");
		e2.setNomTerrain("Camp nou");
		e2.setBudgetAnnuel(300200);
		
		//ajouter l'objet equipe à la BD
		
		EquipeDao cltDao = new EquipeDao();
		cltDao.ajouter(e);
		System.out.println("Appel de la méthode listerTous");
		for (Equipe el : cltDao.listerTous())
			System.out.println(el);
		System.out.println("modification");
		cltDao.modifier(e2);
		System.out.println("suppression");
		cltDao.supprimer(e);
		
		System.out.println("Appel de la méthode listerParNom");
		
		
		for (Equipe el : cltDao.listerParNom("r"))
			System.out.println(el);
		// tester les autres méthodes de la classe ClientDao
	}
}
