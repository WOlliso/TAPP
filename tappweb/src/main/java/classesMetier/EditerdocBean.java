package classesMetier;

import java.sql.SQLException;

import javax.enterprise.inject.Model;

@Model
public class EditerdocBean {
	private String nom;

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

}
