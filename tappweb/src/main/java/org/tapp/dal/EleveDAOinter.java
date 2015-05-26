package org.tapp.dal;

import java.util.ArrayList;

import org.tapp.bll.Eleve;

public interface EleveDAOinter {

	public ArrayList<Eleve> Listeleves();

	public void addeleve(String prenom, String nom, String classe);

	public Eleve selectEleve(String nom);
}
