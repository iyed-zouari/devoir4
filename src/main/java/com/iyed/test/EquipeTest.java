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
		
		
		//ajouter l'objet equipe à la BD
		
		EquipeDao cltDao = new EquipeDao();
		cltDao.ajouter(e);
		System.out.println("Appel de la méthode listerTous");
		for (Equipe el : cltDao.listerTous())
			System.out.println(el.getIdEquipe() + " " + el.getNomEquipe());
		
		
		System.out.println("Appel de la méthode listerParNom");
		
		
		for (Equipe el : cltDao.listerParNom("real"))
			System.out.println(el.getIdEquipe()  + " " + el.getNomEquipe());
		// tester les autres méthodes de la classe ClientDao
	}
}
