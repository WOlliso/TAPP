package org.tapp.dal;

import java.util.ArrayList;

import org.tapp.bll.Document;
import org.tapp.bll.Eleve;

public interface InjectionDAOInter {

	public ArrayList<Document> Listedocs();

	public void ajoutdoc(String nom);

	public Document selectdoc(String nom);

	public ArrayList<Eleve> Listeleves();

	public void addeleve(String prenom, String nom, String classe);

	public Eleve selectEleve(String nom);

}
