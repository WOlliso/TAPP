package classesMetier;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class EleveDAO extends ServicesDAO {
	public static final String INSERT_ELEVES = "INSERT INTO eleves (nom,prenom,classe) VALUES(?,?,?)";
	public static final String SELECT_ELEVES = "SELECT * FROM eleves";
	public static final String UPDATE_ELEVES = "UPDATE eleves SET nom = ?, prenom = ?, classe = ? WHERE eleve = ?";
	public static final String DELETE_ELEVES = "DELETE FROM eleves WHERE nom = ?";
	public static final String SELECT_ELEVE_PAR_NOM = "SELECT * FROM eleves WHERE nom= ?";

	public Eleve addeleve(final String prenom, final String nom,
			final Classe classe) throws SQLException {
		final PreparedStatement preparedStatement = ServicesDAO
				.preparedStatement(INSERT_ELEVES);
		preparedStatement.setString(1, prenom);
		preparedStatement.setString(2, nom);
		preparedStatement.setObject(3, classe);
		preparedStatement.executeUpdate();

		return new Eleve(prenom, nom, classe);
	}

	public List<Eleve> listEleves() throws SQLException {
		final PreparedStatement preparedStatement = ServicesDAO
				.preparedStatement(SELECT_ELEVES);
		final ResultSet rst = preparedStatement.executeQuery();
		return null;
	}
}