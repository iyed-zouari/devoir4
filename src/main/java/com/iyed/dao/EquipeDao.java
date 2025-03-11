package com.iyed.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import com.iyed.entities.Equipe;
import com.iyed.util.JPAutil;

//classe contenant les méthodes génériques ajouter, supprimer,
//consulter par clé primaire (Id)
public class EquipeDao {
	private EntityManager entityManager = JPAutil.getEntityManager("MonProjetJPA");

//méthode ajouter d'une entité à la bd
	public void ajouter(Equipe e) {
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		entityManager.persist(e);
		tx.commit();

	}

//méthode modifier d'une entité à partir de la bd
	public void modifier(Equipe e) {
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		entityManager.merge(e);
		tx.commit();

	}

//méthode Supprimer d'une entité à partir de la bd
	public void supprimer(Equipe e) {
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		e = entityManager.merge(e); // important
		entityManager.remove(e);
		tx.commit();
	}

//méthode Consulter d'une entité à partir de la bd
	public Equipe consulter(Equipe e, Object id) {
		return entityManager.find(e.getClass(), id);
	}

//méthode pour lister tous les objets à partir de la bd
	public List<Equipe> listerTous() {
		List<Equipe> equipes = entityManager.createQuery("select c from Equipe c").getResultList();
		return equipes;
	}

//méthode pour lister tous les client dont le nom contient un 
//texte donné en paramètre (pnom)
	public List<Equipe> listerParNom(String nom) {
		List<Equipe> Equipes = entityManager.createQuery("select c from Equipe c where c.nomEquipe like :pnom").setParameter("pnom", "%" + nom + "%").getResultList();
		return Equipes;
	}
}
