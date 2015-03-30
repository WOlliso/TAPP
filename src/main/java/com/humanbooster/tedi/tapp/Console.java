package com.humanbooster.tedi.tapp;

import java.sql.Connection;

public class Console {
	private Clavier saisie = new Clavier();
	private Document document = new Document();
	private Journal journal = new Journal();
	private Eleve eleve = new Eleve();

	String url = "jdbc:postgresql://localhost:5432/tapp";
	String user = "user";
	String password = "formation";
	ConnexionPgSql connection = new ConnexionPgSql(url, user, password);
	Connection con = connection.connexion();

	// Méthode principale d'affichage
	public void affichageconsole() {
		Console console = new Console();
		System.out.println("Bienvenue sur l'application TAPP");

		System.out.println("A quelles données voulez vous avoir accès ?");
		System.out.println("1 - Documents");
		System.out.println("2 - Eleves");
		System.out.println("3 - Journal");
		int resultat = saisie.lirentier();

		switch (resultat) {
		case 1:
			console.affichageconsoledocument();
			break;
		case 2:
			console.affichageconsoleeleve();
			break;
		}
	}

	// methode d'affichage document
	public void affichageconsoledocument() {
		System.out.println("Vous avez choisi d'accéder aux documents");
		System.out.println("Que voulez vous faire ?");
		System.out.println("1 - Ajouter un document ");
		System.out.println("2 - Modifier un document ");
		System.out.println("3 - Afficher tous les documents ");
		System.out.println("4 - Retour menu précedent ");

		int choixdoc = saisie.lirentier();
		Console console = new Console();
		switch (choixdoc) {
		case 1:
			console.affichageconsoleadddoc(con);
			break;
		case 2:
			console.affichageconsolemodifydoc(con);
			break;
		case 3:
			console.affichageconsolealldoc(con);
			break;

		case 4:
			console.affichageconsole();
			break;
		}
	}

	// methode affichage ajout d'un document
	public void affichageconsoleadddoc(Connection connection) {
		System.out.println("Vous avez choisi d'ajouter un document");
		System.out.println("Quel est le nom de votre document ?");
		String nomdoc = saisie.lirechaine();
		document.adddoc(nomdoc, connection);
		System.out.println("Document ajouté");
	}

	// methode affichage modification d'un doc
	public void affichageconsolemodifydoc(Connection connection) {
		System.out.println("Vous avez choisi de modifier un document");
		System.out.println("Quel est le nom du document à modifier ?");
		String nominit = saisie.lirechaine();
		String nommod = saisie.lirechaine();
		document.modifydoc(nominit, nommod, connection);
		System.out.println("Document modifié");
	}

	// methode affichage tous les docs
	public void affichageconsolealldoc(Connection connection) {
		System.out.println("Vous avez choisi d'afficher tous les documents");
		System.out.println("Les documents sont :");
		document.alldocs(connection);
	}

	// methode affichage élève
	public void affichageconsoleeleve() {
		System.out.println("Vous avez choisi d'accéder aux élèves");
		System.out.println("Que voulez vous faire ?");
		System.out.println("1 - Ajouter un élève ");
		System.out.println("2 - Modifier un élève ");
		System.out.println("3 - Afficher tous les élèves ");
		System.out.println("4 - Retour menu précedent ");
		int choixele = saisie.lirentier();
		Console console = new Console();
		switch (choixele) {
		case 1:
			console.affichageconsoleaddeleve();
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			console.affichageconsole();
		}
	}

	// methode affichage ajout eleve

	public void affichageconsoleaddeleve() {
		System.out.println("Vous avez choisi d'ajouter un élève");
		System.out.println("Quel est son nom ?");
		String nom = saisie.lirechaine();

		System.out.println("Quel est son prenom ?");
		String prenom = saisie.lirechaine();

		System.out.println("Quelle est sa classe ?");
		String classe = saisie.lirechaine();

		eleve.requeteajouteleve(nom, prenom, classe, con);
		System.out.println("Eleve ajouté");

	}

	public void affichageconsolejournal() {
		System.out.println("Vous avez choisi d'accéder aujournal");
		System.out.println("Que voulez vous faire ?");
		System.out.println("1 - Ajouter un memo ");
		System.out.println("2 - Modifier un memo ");
		System.out.println("3 - Afficher tous les memos ");
		System.out.println("4 - Retour menu précedent ");
		int choixjour = saisie.lirentier();
		Console console = new Console();
		switch (choixjour) {
		case 1:
			console.affichageconsolecreatememo();
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			console.affichageconsole();
			break;

		}

	}

	public void affichageconsolecreatememo() {
		System.out.println("Vous avez choisi d'ajouter un memo");
		System.out.println("Quel est le nom de votre memo ?");
		String nommemo = saisie.lirechaine();
		journal.createMemo(nommemo, con);
		System.out.println("Memo ajouté");

	}

	public static void main(String[] args) {

		Console consoletest = new Console();
		consoletest.affichageconsole();
	}
}
