package org.tapp.dal;

import java.util.ArrayList;

import org.tapp.bll.Document;
import org.tapp.bll.Eleve;

public class InjectionDAO implements InjectionDAOInter {

	@Override
	public ArrayList<Document> Listedocs() {
		DocumentDAO doc = new DocumentDAO();

		return doc.alldocs();
	}

	@Override
	public void ajoutdoc(final String nom) {
		DocumentDAO doc = new DocumentDAO();
		doc.adddoc(nom);

	}

	@Override
	public Document selectdoc(final String nom) {
		DocumentDAO doc = new DocumentDAO();
		return doc.selectdoc(nom);
	}

	@Override
	public ArrayList<Eleve> Listeleves() {
		EleveDAO eleve = new EleveDAO();

		return eleve.listEleves();
	}

	@Override
	public void addeleve(final String prenom, final String nom,
			final String classe) {
		EleveDAO eleve = new EleveDAO();
		eleve.addeleve(prenom, nom, classe);
	}

	@Override
	public Eleve selectEleve(final String nom) {
		EleveDAO eleve = new EleveDAO();
		return eleve.selecteleve(nom);
	}

}
