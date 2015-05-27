package org.tapp.bll;

import java.util.ArrayList;

import javax.ejb.Stateful;

import javax.enterprise.inject.Default;

import org.tapp.dal.DocumentDAO;
import org.tapp.dal.DocumentDAOInter;

@Stateful

public class EJBDocuDAO {

	
	public ArrayList<Document> Listedocs() {
		DocumentDAO doc = new DocumentDAO();

		return doc.alldocs();

	}

	
	public void ajoutdoc(final String nom) {
		DocumentDAO doc = new DocumentDAO();
		doc.adddoc(nom);

	}

	
	public Document selectdoc(final String nom) {
		DocumentDAO doc = new DocumentDAO();
		return doc.selectdoc(nom);
	}

}
