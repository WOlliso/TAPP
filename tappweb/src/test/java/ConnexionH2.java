

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import classesMetier.Connexion;

public class ConnexionH2 implements Connexion {

	static final String URL = "jdbc:h2:mem:tapp;MODE=PostgreSQL";
	private Connection connexion;

	public Connection connexion() {

		try {
			connexion = DriverManager.getConnection(URL);
		} catch (final SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return connexion;
	}

}
