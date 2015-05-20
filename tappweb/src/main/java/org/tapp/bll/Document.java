package org.tapp.bll;

import javax.enterprise.inject.Model;

@Model
public class Document {
	String nom;

	public Document() {

	}

	public Document(String nom) {
		super();
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
}
