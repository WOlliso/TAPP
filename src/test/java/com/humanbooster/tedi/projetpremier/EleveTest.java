package com.humanbooster.tedi.projetpremier;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.humanbooster.tedi.tapp.Eleve;
import com.humanbooster.tedi.tapp.tests.ConnexionH2;

public class EleveTest {

	Eleve eleve;
	ConnexionH2 connection;
	Connection connect;

	@Before
	public void init() throws SQLException {
		eleve = new Eleve();
		connection = new ConnexionH2();
		connect = connection.connexion();
		String reqtable = "CREATE TABLE eleves (id_eleves serial NOT NULL,  prenom character varying, nom character varying, classe character varying, CONSTRAINT primary_eleves PRIMARY KEY (id_eleves))";
		connect.createStatement().executeUpdate(reqtable);
	}

	/**
	 * Test requete ajout eleve
	 *
	 * @throws SQLException
	 */
	@Test
	public void testInsertioneleve() throws SQLException {

		try {
			// requete comptant le nombre de lignes
			String requete1 = eleve.listeleves();
			Statement statement = connect.createStatement(
					ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_UPDATABLE);
			ResultSet rs = statement.executeQuery(requete1);
			rs.last();
			int nbre1 = rs.getRow();

			// lancement de la methode ajout
			eleve.requeteajouteleve("nom", "prenom", "classe", connect);
			// requete comptant le nombre de lignes apres l'insertion
			String requete2 = eleve.listeleves();
			Statement stat2 = connect.createStatement();
			ResultSet rs2 = stat2.executeQuery(requete2);
			rs2.last();
			int nbre2 = rs2.getRow();
			Assert.assertTrue(nbre2 != nbre1);

		} catch (SQLException e) {
			// traitement de l'exception

		}
	}
}
