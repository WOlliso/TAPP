package org.tapp.gui;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.enterprise.inject.Model;
import javax.inject.Inject;

import org.tapp.bll.Document;
import org.tapp.dal.InjectionDAOInter;

@Model
public class EditerdocBean {
	private String nom;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Inject
	InjectionDAOInter mydocDAO;

	public String ajoutdoc() throws SQLException {

		mydocDAO.ajoutdoc(nom);
		return "documentajoute";

	}

	public ArrayList<Document> getListedocs() throws SQLException {

		return mydocDAO.Listedocs();
	}

	public Document getDoc() throws SQLException {

		return mydocDAO.selectdoc(nom);
	}

	public String docunique() {
		return "documentunique";
	}
}
