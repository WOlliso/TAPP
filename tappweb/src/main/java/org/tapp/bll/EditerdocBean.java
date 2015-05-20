package org.tapp.bll;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.enterprise.inject.Model;

import org.tapp.dal.DocumentDAO;

@Model
public class EditerdocBean {
	private String nom;
	private ArrayList<Document> listedocs;
	private Document doc;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String ajoutdoc() throws SQLException {

		DocumentDAO req = new DocumentDAO();
		req.adddoc(nom);
		return "documentajoute";

	}

	public ArrayList<Document> getListedocs() throws SQLException {
		DocumentDAO req = new DocumentDAO();
		listedocs = req.alldocs();

		return listedocs;
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
