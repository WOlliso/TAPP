package org.tapp.dal;

import java.util.ArrayList;

import org.tapp.bll.Document;

public class DocumentDAOinject implements DocumentDAOInter {

	@Override
	public ArrayList<Document> Listedocs() {

		DocumentDAO doc = new DocumentDAO();

		return doc.alldocs();
	}

	@Override
	public void ajoutdoc(String nom) {
		DocumentDAO doc = new DocumentDAO();
		doc.adddoc(nom);

	}

	@Override
	public Document selectdoc(String nom) {
		DocumentDAO doc = new DocumentDAO();
		return doc.selectdoc(nom);
	}

}