package com.humanbooster.tedi.tapp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Eleve {
	private String nom;
	private String prenom;
	private int age;
	private String classe;
	Clavier clavier = new Clavier();
	String url = "jdbc:postgresql://localhost:5432/tapp";
	String user = "utilisateur";
	String password = "utilisateur";
	ConnexionPgSql connection = new ConnexionPgSql(url, user, password);
	Connection connect = connection.connexion();

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public int getAge() {
		return age;
	}

	public String getClasse() {
		return classe;
	}

	public void setNom(final String nom) {
		this.nom = nom;
	}

	public void setPrenom(final String prenom) {
		this.prenom = prenom;
	}

	public void setAge(final int age) {
		this.age = age;
	}

	public void setClasse(final String classe) {
		this.classe = classe;
	}

	public Eleve() {

	}

	public Eleve(final String nom, final String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}

	public Eleve(final String nom, final String prenom, final String classe) {
		this.nom = nom;
		this.prenom = prenom;
		this.classe = classe;
	}

	// Nom complet de l'élévé
	public String getNomComplet() {
		String nomcomplet = nom + " " + prenom;
		// System.out.println("Le nom complet de l'éléve est : " + nomcomplet);
		return nomcomplet;

	}

	// Fiche de l'eleve
	public void getFicheEleve() {
		String nomcomplet = getNomComplet();
		System.out.println(nomcomplet + " est dans la classe " + classe);

	}

	// requete pour ajouter un eleve
	public String trequeteajouteleve() {
		String request = "INSERT INTO eleves (nom, prenom,classe) VALUES(?,?,?)";
		return request;
	}

	public void requeteajouteleve(final String nom, final String prenom,
			final String classe, final Connection connect) {
		// ecriture de la requete
		String request = "INSERT INTO eleves (nom, prenom,classe) VALUES(?,?,?)";
		try {
			PreparedStatement recupsaisie = connect.prepareStatement(request);
			// Saisie de la fiche
			recupsaisie.setString(1, getNom());
			// recupsaisie.executeUpdate();
			// System.out.println("Saisissez le prenom : ");
			recupsaisie.setString(2, getPrenom());
			// recupsaisie.executeUpdate();
			// System.out.println("Saisissez la classe : ");
			recupsaisie.setString(3, getClasse());
			// recuperation du resultat et insertion dans la base
			recupsaisie.executeUpdate();

		} catch (SQLException e) {
			// traitement de l'exception
			System.out.println("Probléme Insertion");
			e.printStackTrace();
		}
	}

	// requete pour editer un eleve
	public String requeteediteleve(final String nomeleve) {
		String request = "SELECT id_eleves , nom, prenom, classe FROM eleves WHERE nom= nomeleve";
		return request;
	}

	// requete pour supprimer un eleve
	public String supprimeleve(final String nomeleve) {
		String request = "DELETE FROM eleves WHERE nom = nomeleve";
		return request;
	}

	// requete pour lister les eleves par classe
	public String listeleves(final String classeleve) {
		String request = "SELECT nom, prenom, classe FROM eleves WHERE class= classeleve";
		return request;
	}

	/*
	 * requete pour donner le nombre d'eleves par classe public String
	 * nombreleves(final String classeleve) { String request =
	 * "SELECT COUNT (id_eleves) FROM eleves ;"; return request; }
	 */
	// requete pour donner le nombre d'eleves total
	public String listeleves() {
		String request = "SELECT * FROM eleves;";
		return request;
	}
}
