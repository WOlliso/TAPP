package org.tapp.gui;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.enterprise.inject.Model;

import org.tapp.bll.Eleve;
import org.tapp.dal.EleveDAO;

@Model
public class EleveBean {
	private String prenom;
	private String nom;
	private String classe;
	private ArrayList<Eleve> lstEleves;
	private Eleve eleve;

	public EleveBean() {
	}

	public String getPrenom() {
		return prenom;
	}

	public String getNom() {
		return nom;
	}

	public String getClasse() {
		return classe;
	}

	public void setPrenom(final String prenom) {
		this.prenom = prenom;
	}

	public void setNom(final String nom) {
		this.nom = nom;
	}

	public void setClasse(final String classe) {
		this.classe = classe;
	}

	public String insereleve() throws SQLException {
		EleveDAO treq = new EleveDAO();
		treq.addeleve(prenom, nom, classe);
		return "ficheEleve";
	}

	public ArrayList<Eleve> getListeleves() throws SQLException {
		EleveDAO treq = new EleveDAO();
		lstEleves = treq.listEleves();
		return lstEleves;
	}

	public Eleve getEleve() throws SQLException {
		EleveDAO treq = new EleveDAO();
		eleve = treq.selecteleve(nom);
		return eleve;
	}

	public Eleve supEleve() throws SQLException {
		EleveDAO treq = new EleveDAO();
		treq.suprimeleve(nom);
		return eleve;

	}

}
