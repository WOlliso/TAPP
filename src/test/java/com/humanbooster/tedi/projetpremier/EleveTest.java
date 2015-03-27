package com.humanbooster.tedi.projetpremier;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.humanbooster.tedi.tapp.Eleve;

public class EleveTest {

	Eleve eleve;

	@Before
	public void init() {
		eleve = new Eleve();
	}

	/**
	 * Test requete ajout eleve
	 *
	 * @throws SQLException
	 */
	@Test
	public void testInsertioneleve() throws SQLException {
		String url = "jdbc:postgresql://localhost:5432/tapp";
		String user = "utilisateur";
		String passwd = "utilisateur";
		int nbre1 = 0;
		int nbre2 = 0;
		try {
			Connection connect = DriverManager.getConnection(url, user, passwd);
			// requete comptant le nombre de lignes
			String requete1 = eleve.listeleves();
			Statement statement = connect.createStatement(
					ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_READ_ONLY);
			ResultSet rs = statement.executeQuery(requete1);
			nbre1 = rs.getRow();

			// lancement de la methode ajout
			eleve.requeteajouteleve();
			String requete2 = eleve.listeleves();
			Statement stat2 = connect.createStatement();
			ResultSet rs2 = stat2.executeQuery(requete2);
			nbre2 = rs2.getRow();

		} catch (SQLException e) {
			// traitement de l'exception
			Assert.assertTrue(nbre2 != nbre1 + 1);
		}

	}
}
