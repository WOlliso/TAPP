package org.tapp.bll;

import java.util.ArrayList;

import javax.ejb.Stateful;
import javax.enterprise.inject.Alternative;

import org.tapp.dal.DocumentDAO;
import org.tapp.dal.DocumentDAOInter;

@Stateful
@Alternative
public class EJBDocuDAO implements DocumentDAOInter {

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

}
