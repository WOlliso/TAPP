package classesMetier;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnexionPgSql {

	/*
	 * private String url; private String user; private String pwd;
	 */

	private static String url;
	private static String user;
	private static String pwd;
	private static Connection connexion;

	/*
	 * public ConnexionPgSql(String url, String user, String pwd) { super();
	 * this.url = url; this.user = user; this.pwd = pwd; }
	 */
	public static Connection connexion() {

		try {

			connexion = DriverManager.getConnection(url, user, pwd);

		} catch (final SQLException e) {
			// TODO Auto-generated catch block

		}

		return connexion;
	}

}
