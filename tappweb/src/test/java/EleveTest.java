

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.After;
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
	// Test de l'insertion de l'éléve dans la base
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
			// Comparaison:le nombre doit être different du comptage precedent
			Assert.assertTrue(nbre2 != nbre1);

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Test
	// Test de la modification de l'éléve dans la base en comptant le nombre de
	// lignes de la base
	public void testModifeleve() throws SQLException {
		try {

			// requetes comptant le nombre de lignes
			String requete1 = eleve.listeleves();
			Statement statement = connect.createStatement(
					ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_UPDATABLE);
			ResultSet rs = statement.executeQuery(requete1);
			rs.last();
			int nbre1 = rs.getRow();

			// Modification de la classe de l'eleve
			eleve.modifeleve("nomeleve", "prenomeleve", "classemodifie",
					connect);

			// requete comptant le nombre de lignes apres l'insertion
			String requete2 = eleve.listeleves();
			Statement stat2 = connect.createStatement();
			ResultSet rs2 = stat2.executeQuery(requete2);
			rs2.last();
			int nbre2 = rs2.getRow();
			// Comparaison: le nombre doit être egal au comptage precedent
			Assert.assertTrue(nbre2 == nbre1);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	// Verification de la modification de la classe de l'eleve
	public void testVerifmodifeleve() throws SQLException {
		eleve.requeteajouteleve("martin", "toto", "6A", connect);
		String nomeleve = "martin";
		String prenomeleve = "toto";
		//String request = "SELECT id_eleves , nom, prenom, classe FROM eleves WHERE nom ='"
		+ nomeleve + "'" + "AND prenom =" + "'" + prenomeleve + "'";
		try {
			// On autorise la mise à jour des données
			Statement stmt = connect
					.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
							ResultSet.CONCUR_UPDATABLE);
			// Recuperation de la ligne à modifier
			ResultSet result = stmt.executeQuery(request);
			result.first();
			// recuperation de la classe avant la modif
			String classe1 = result.getString("classe");
			// Modification de la classe de l'eleve
			eleve.modifeleve("nom", "prenom", "classemodifie", connect);
			// recuperation de la classe apres la modif
			String classe2 = result.getString("classe");
			// Comparaison: les chaines de caracteres doivent être differente
			Assert.assertFalse(classe1.equals(classe2));

		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	@After
	public void end() throws SQLException {
		String sql2 = "DROP TABLE public.eleves;";
		connect.createStatement().executeUpdate(sql2);
		connect.close();

	}
}
