package classesMetier;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class Eleve {
	private String nom;
	private String prenom;
	private int age;
	private Classe classe;

	public Eleve(String nom, String prenom, int age, Classe classe) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.classe = classe;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Classe getClasse() {
		return classe;
	}

	public void setClasse(Classe classe) {
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

	public Eleve insertEleve(String nom, String prenom, int age, Classe classe) throws SQLException {

		final PreparedStatement preparedStatement = ServicesDAO.preparedStatement(Requests.INSERT_ELEVE);
		preparedStatement.setString(1, nom);
		preparedStatement.setString(2, prenom);
		preparedStatement.setInt(3, age);
		preparedStatement.setObject(4, classe);
		preparedStatement.executeUpdate();

		return new Eleve(nom, prenom, age, classe);
	}

	public List<Eleve> selectEleves() {
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
