package org.tapp.bll;

import java.util.ArrayList;

import javax.ejb.Stateful;
import javax.enterprise.inject.Alternative;

import org.tapp.dal.DocumentDAOInter;

@Stateful
@Alternative
public class EJBDocuDAO implements DocumentDAOInter {

	@Override
	public ArrayList<Document> Listedocs() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void ajoutdoc(final String nom) {
		// TODO Auto-generated method stub

	}

	@Override
	public Document selectdoc(final String nom) {
		// TODO Auto-generated method stub
		return null;
	}

}
