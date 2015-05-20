package classesMetier;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EleveDAO extends ServicesDAO {
	public static final String INSERT_ELEVES = "INSERT INTO eleves (nom,prenom,classe) VALUES(?,?,?)";
	public static final String SELECT_ELEVES = "SELECT * FROM eleves";
	public static final String UPDATE_ELEVES = "UPDATE eleves SET nom = ?, prenom = ?, classe = ? WHERE eleve = ?";
	public static final String DELETE_ELEVES = "DELETE FROM eleves WHERE nom = ?";
	public static final String SELECT_ELEVE_PAR_NOM = "SELECT * FROM eleves WHERE nom= ?";

	public Eleve addeleve(final String prenom, final String nom,
			final String classe) throws SQLException {
		final PreparedStatement preparedStatement = ServicesDAO
				.preparedStatement(INSERT_ELEVES);
		preparedStatement.setString(1, prenom);
		preparedStatement.setString(2, nom);
		preparedStatement.setString(3, classe);
		preparedStatement.executeUpdate();

		return new Eleve(prenom, nom, classe);
	}

	public ArrayList<Eleve> listEleves() throws SQLException {
		ArrayList<Eleve> liste = new ArrayList<Eleve>();
		final PreparedStatement preparedStatement = ServicesDAO
				.preparedStatement(SELECT_ELEVES);
		final ResultSet rst = preparedStatement.executeQuery();
		while (rst.next()) {
			String prenom = rst.getString("prenom");
			String nom = rst.getString("nom");
			String classe = rst.getString("classe");
			liste.add(new Eleve(prenom, nom, classe));

		}
		return liste;
	}

	public Eleve modifeleve(final String prenomorigin, final String prenomodif,
			final String nomorigin, final String nommodif,
			final String classeorigin, final String classemodif)
					throws SQLException {
		{
			final PreparedStatement prepareStatement = ServicesDAO
					.preparedStatement(UPDATE_ELEVES);
			prepareStatement.setString(1, prenomodif);
			prepareStatement.setString(2, nommodif);
			prepareStatement.setString(3, classemodif);
			prepareStatement.executeUpdate();
			return new Eleve(prenomodif, nommodif, classemodif);
		}

	}

}