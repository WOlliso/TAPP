package classesMetier;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class Eleve {
	private String nom;
	private String prenom;
	private Classe classe;

	public Eleve() {

	}

	public Eleve(final String nom, final String prenom, final Classe classe) {
		super();
		this.nom = nom;
		this.prenom = prenom;

		this.classe = classe;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(final String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(final String prenom) {
		this.prenom = prenom;
	}

	public Classe getClasse() {
		return classe;
	}

	public void setClasse(final Classe classe) {
		this.classe = classe;
	}

	/*
	 * 
	 * public static final String INSERT_ELEVES =
	 * "INSERT INTO eleves (nom, prenom,classe) VALUES(?,?,?)"; public static
	 * final String SELECT_ELEVES = "SELECT * FROM eleves"; public static final
	 * String SELECT_ELEVE_PAR_NOM = "SELECT * FROM eleves WHERE nom= ?"; public
	 * static final String SELECT_ELEVES_PAR_CLASSE =
	 * "SELECT * FROM eleves WHERE classe= ?"; public static final String
	 * UPDATE_CLASSE_ELEVES="UPDATE eleves SET classe = ? WHERE nom = ?"; public
	 * static final String
	 * UPDATE_ELEVES="UPDATE eleves SET nom=? prenom=? classe=? WHERE nom = ?";
	 * public static final String
	 * DELETE_ELEVES="DELETE FROM eleves WHERE nom = ?";
	 */

	public Eleve insertEleve(final String nom, final String prenom,
			final Classe classe) throws SQLException {

		final PreparedStatement preparedStatement = ServicesDAO
				.preparedStatement(Requests.INSERT_ELEVE);
		preparedStatement.setString(1, nom);
		preparedStatement.setString(2, prenom);
		preparedStatement.setObject(3, classe);
		preparedStatement.executeUpdate();

		return new Eleve(nom, prenom, classe);
	}

	public List<Eleve> listEleves() {
		return null;
	}

	public Eleve selectEleveParNom() {

		return null;
	}

	public Eleve selectEleveParClasse() {
		return null;
	}

	public boolean updateEleveParNom() {
		return false;
	}

	public boolean updateClasseEleve() {
		return false;
	}

	public boolean deleteEleve() {
		return false;
	}
}
