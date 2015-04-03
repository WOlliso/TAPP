package classesMetier;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class DocumentDAO extends Services {
	public static final String INSERT_DOCUMENTS = "INSERT INTO documents (nom_documents) VALUES(?)";
	public static final String SELECT_DOCUMENTS = "SELECT * FROM documents";
	public static final String SELECT_DOCUMENT_PAR_NOM = "SELECT * FROM documents WHERE nom_documents= ?";
	public static final String UPDATE_DOCUMENTS = "UPDATE documents SET nom_documents = ? WHERE nom_documents = ?";
	public static final String DELETE_DOCUMENTS = "DELETE FROM documents WHERE nom_documents = ?";

	public Document adddoc(String nom) throws SQLException {
		PreparedStatement preparedStatement = Services
				.preparedStatement(INSERT_DOCUMENTS);
		preparedStatement.setString(1, nom);
		preparedStatement.executeUpdate();

		return new Document(nom);
	}

	public Document modifydoc(String nominit, String nommodif)
			throws SQLException {
		PreparedStatement prepareStatement = Services
				.preparedStatement(UPDATE_DOCUMENTS);
		prepareStatement.setString(1, nommodif);
		prepareStatement.setString(2, nominit);
		prepareStatement.executeUpdate();
		return new Document(nommodif);

	}

	public Document selectdoc(String nom) throws SQLException {
		PreparedStatement prepareStatement = Services
				.preparedStatement(SELECT_DOCUMENT_PAR_NOM);
		prepareStatement.setString(1, nom);
		ResultSet rst = prepareStatement.executeQuery();
		String nomfinal = rst.getString("nom_documents");
		return new Document(nomfinal);

	}

	public List<Document> alldocs() throws SQLException {
		PreparedStatement preparedStatement = Services
				.preparedStatement(SELECT_DOCUMENTS);
		ResultSet rst = preparedStatement.executeQuery();

		return null;
	}

	public void deletedoc(String nom) throws SQLException {
		PreparedStatement preparedStatement = Services
				.preparedStatement(DELETE_DOCUMENTS);
		preparedStatement.setString(1, nom);
		preparedStatement.executeUpdate();
	}
}
