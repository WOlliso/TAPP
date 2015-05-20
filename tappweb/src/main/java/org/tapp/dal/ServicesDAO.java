package org.tapp.dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.tapp.bll.Constantes;
import org.tapp.bll.Requests;


public class ServicesDAO {

	/*
	 * private String user; private String pwd;
	 */

	public static Connection connexion() throws SQLException {

		return DriverManager.getConnection(Constantes.URL_POSTGRESQL, "admin",
				"admin");
	}

	public static PreparedStatement preparedStatement(String sql)
			throws SQLException {
		return connexion().prepareStatement(sql);
	}

	public static ResultSet resulSet(String sql) throws SQLException {

		return preparedStatement(sql).executeQuery();
	}

	// SELECT_PROF_MDP = "SELECT pwd FROM professeurs WHERE user=?";
	public static String selectPwdProf(String user) throws SQLException {
		final PreparedStatement preparedStatement = preparedStatement(Requests.SELECT_PROF_MDP);
		preparedStatement.setString(1, user);
		return preparedStatement.executeQuery().toString();

	}

	public boolean verifierMdp(String user, String mdp) throws SQLException {
		if (ServicesDAO.selectPwdProf(user) == mdp) {
			return true;
		} else {
			return false;
		}
	}

	public Connection connexion(String user, String mdp) throws SQLException {
		if (verifierMdp(user, mdp)) {

			return DriverManager.getConnection(Constantes.URL_POSTGRESQL, user,
					mdp);

		} else {
			return null;
		}
	}

	public void deconnexion(Connection connexion) {
		if (connexion != null) {
			try {
				connexion.close();
			} catch (final SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
