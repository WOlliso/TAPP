package org.tapp.bll;

import javax.enterprise.inject.Model;

@Model
public class Eleve {
	private String prenom;
	private String nom;
	private String classe;

	public Eleve() {

	}

	public Eleve(final String prenom, final String nom, final String classe) {
		super();
		this.prenom = prenom;
		this.nom = nom;
		this.classe = classe;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(final String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(final String prenom) {
		this.prenom = prenom;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(final String classe) {
		this.classe = classe;
	}

}
