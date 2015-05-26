package org.tapp.bll;

import java.util.ArrayList;

import javax.ejb.Stateful;
import javax.enterprise.inject.Alternative;

import org.tapp.dal.InjectionDAOInter;

@Stateful
@Alternative
public class EJBinterDAO implements InjectionDAOInter {

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

	@Override
	public ArrayList<Eleve> Listeleves() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addeleve(final String prenom, final String nom,
			final String classe) {
		// TODO Auto-generated method stub

	}

	@Override
	public Eleve selectEleve(final String nom) {
		// TODO Auto-generated method stub
		return null;
	}

}
