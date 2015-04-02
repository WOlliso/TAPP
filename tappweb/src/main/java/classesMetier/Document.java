package classesMetier;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Document {
	String url = "jdbc:postgresql://localhost:5432/tapp";
	String user = "user";
	String password = "formation";
	ConnexionPgSql connection = new ConnexionPgSql(url, user, password);
	Connection con = connection.connexion();

	public void adddoc(String nom, Connection con) {

		try {
			Statement stmt = con
					.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
							ResultSet.CONCUR_UPDATABLE);
			String insert = "INSERT INTO documents (nom_documents) VALUES('"
					+ nom + "')";
			stmt.executeUpdate(insert);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void modifydoc(String nominit, String nommodifie, Connection con) {

		try {
			Statement stmt = con.createStatement();
			String insert = "UPDATE documents SET nom_documents='" + nommodifie
					+ "' WHERE nom_documents='" + nominit + "'";
			stmt.executeUpdate(insert);

		} catch (SQLException e) { // TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void alldocs(Connection con) {

		try {
			Statement stmt = con.createStatement();
			ResultSet resultat = stmt.executeQuery("SELECT * FROM documents");
			while (resultat.next()) {
				String nom = resultat.getString("nom_documents");
				System.out.println(nom);
			}

		} catch (SQLException e) { // TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
