package org.tapp.dal;

import java.util.ArrayList;

import org.tapp.bll.Document;

public class InjectionDAO implements InjectionDAOInter {

	@Override
	public ArrayList<Document> Listedocs() {
		DocumentDAO doc = new DocumentDAO();

		return doc.alldocs();
	}

}
