package org.tapp.gui;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.ejb.EJB;
import javax.enterprise.inject.Model;
import javax.mail.Address;

import org.tapp.bll.Document;
import org.tapp.bll.EJBDocuDAO;
import org.tapp.bll.EJBDocuMail;

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

	@EJB(beanName="EJBDocuDAO")
	EJBDocuDAO mydocDAO;
	
	@EJB(beanName="EJBDocuMail")
	EJBDocuMail mydocmail;
	

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
	
	public String mailenvoye(){
		mydocmail.send("nicolas.valadier@hotmail.fr", "Essai", "c'est génial");
		return "mailenvoye";
		
	}
}
