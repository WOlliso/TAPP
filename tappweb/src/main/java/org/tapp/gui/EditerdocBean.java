package org.tapp.gui;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.ejb.EJB;
import javax.enterprise.inject.Model;
<<<<<<< HEAD
import javax.mail.Address;
=======
import javax.inject.Inject;
>>>>>>> refs/heads/william

import org.tapp.bll.Document;
import org.tapp.bll.EJBDocuDAO;
<<<<<<< HEAD
import org.tapp.bll.EJBDocuMail;
=======
import org.tapp.dal.DocumentDAOInter;
>>>>>>> refs/heads/william

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

<<<<<<< HEAD
	@EJB(beanName="EJBDocuDAO")
	EJBDocuDAO mydocDAO;
	
	@EJB(beanName="EJBDocuMail")
	EJBDocuMail mydocmail;
	
=======
//	@EJB
//	EJBDocuDAO mydocDAO;

	 @Inject
	 DocumentDAOInter mydocDAO;
>>>>>>> refs/heads/william

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
