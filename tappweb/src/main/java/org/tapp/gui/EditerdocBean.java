package org.tapp.gui;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.enterprise.inject.Model;
import javax.inject.Inject;

import org.tapp.bll.Document;
import org.tapp.dal.DocumentDAO;
import org.tapp.dal.InjectionDAOInter;

@Model
public class EditerdocBean {
	private String nom;

	private Document doc;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Inject
	InjectionDAOInter mydocDAO;

	public String ajoutdoc() throws SQLException {

		DocumentDAO req = new DocumentDAO();
		req.adddoc(nom);
		return "documentajoute";

	}

	public ArrayList<Document> getListedocs() throws SQLException {

		return mydocDAO.Listedocs();
	}

	public Document getDoc() throws SQLException {
		DocumentDAO req = new DocumentDAO();
		doc = req.selectdoc(nom);

		return doc;
	}

	public String docunique() {
		return "documentunique";
	}
}
