package org.tapp.gui;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.ejb.EJB;
import javax.enterprise.inject.Model;
import javax.inject.Inject;

import org.tapp.bll.Document;
import org.tapp.bll.EJBDocuDAO;
import org.tapp.dal.DocumentDAOInter;

@Model
public class EditerdocBean {
	private String nom;
	private ArrayList<Document> listedocs;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

//	@EJB
//	EJBDocuDAO mydocDAO;

	 @Inject
	 DocumentDAOInter mydocDAO;

	public String ajoutdoc() throws SQLException {

		mydocDAO.ajoutdoc(nom);
		return "documentajoute";

	}

	public ArrayList<Document> getListedocs() throws SQLException {
		listedocs = mydocDAO.Listedocs();
		return listedocs;
	}

	public Document getDoc() throws SQLException {

		return mydocDAO.selectdoc(nom);
	}

	public String docunique() {
		return "documentunique";
	}
}
