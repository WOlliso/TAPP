package classesMetier;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Journal {

	String name;
	String url = "jdbc:postgresql://localhost:5432/tapp";
	String user = "user";
	String password = "formation";
	Services connection = new Services(url, user, password);
	Connection con = connection.connexion();

	// Constructor method
	public Journal() {
	}

	// Create a new memo
	public void createMemo(String name, Connection con) {
		try {
			final Statement stmt = con
					.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
							ResultSet.CONCUR_UPDATABLE);
			final String insert = "INSERT INTO cahier_journal (nom_memo) VALUES('"
					+ name + "')";
			stmt.executeUpdate(insert);

		} catch (final SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// Edit an existing memo
	public void editMemo() {

	}

	// View an existing memo
	public void viewMemo() {

	}

	// Delete a memo
	public void deleteMemo() {

	}
}
