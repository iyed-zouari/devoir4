package com.iyed.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity

public class Equipe implements Serializable  {
	
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY) 
	private Long idEquipe;
	
	private String nomEquipe;
	private double budgetAnnuel ;
	private String nomTerrain;
	
	
	
	
	public Long getIdEquipe() {
		return idEquipe;
	}
	public void setIdEquipe(final Long idEquipe) {
		this.idEquipe = idEquipe;
	}
	public String getNomEquipe() {
		return nomEquipe;
	}
	public void setNomEquipe(final String nomEquipe) {
		this.nomEquipe = nomEquipe;
	}
	public double getBudgetAnnuel() {
		return budgetAnnuel;
	}
	public void setBudgetAnnuel(final double budgetAnnuel) {
		this.budgetAnnuel = budgetAnnuel;
	}
	public String getNomTerrain() {
		return nomTerrain;
	}
	public void setNomTerrain(final String nomTerrain) {
		this.nomTerrain = nomTerrain;
	}
	
	
}
