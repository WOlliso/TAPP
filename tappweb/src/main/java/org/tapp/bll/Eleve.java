package org.tapp.bll;

import javax.enterprise.inject.Model;

@Model
public class Eleve {
	private String nom;
	private String prenom;
	private String classe;

	public Eleve() {

	}

	public Eleve(final String nom, final String prenom, final String classe) {
		super();
		this.nom = nom;
		this.prenom = prenom;

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
