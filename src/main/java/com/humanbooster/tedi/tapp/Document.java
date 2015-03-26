package com.humanbooster.tedi.tapp;

public class Document {
	private String nom;
	private int idProf;
	private int idClasse;

	public Document(String nom, int idProf, int idClasse) {
		super();
		this.nom = nom;
		this.idProf = idProf;
		this.idClasse = idClasse;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getIdProf() {
		return idProf;
	}

	public void setIdProf(int idProf) {
		this.idProf = idProf;
	}

	public int getIdClasse() {
		return idClasse;
	}

	public void setIdClasse(int idClasse) {
		this.idClasse = idClasse;
	}

}
