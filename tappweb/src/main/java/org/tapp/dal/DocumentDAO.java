package org.tapp.dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.tapp.bll.Document;

public class DocumentDAO extends ServicesDAO {
	public static final String INSERT_DOCUMENTS = "INSERT INTO documents (nom_documents) VALUES(?)";
	public static final String SELECT_DOCUMENTS = "SELECT * FROM documents";
	public static final String SELECT_DOCUMENT_PAR_NOM = "SELECT * FROM documents WHERE nom_documents= ?";
	public static final String UPDATE_DOCUMENTS = "UPDATE documents SET nom_documents = ? WHERE nom_documents = ?";
	public static final String DELETE_DOCUMENTS = "DELETE FROM documents WHERE nom_documents = ?";

	public Document adddoc(String nom) {
		PreparedStatement preparedStatement;
		try {
			preparedStatement = ServicesDAO.preparedStatement(INSERT_DOCUMENTS);
			preparedStatement.setString(1, nom);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return new Document(nom);
	}

	public Document modifydoc(String nominit, String nommodif)
			throws SQLException {
		final PreparedStatement prepareStatement = ServicesDAO
				.preparedStatement(UPDATE_DOCUMENTS);
		prepareStatement.setString(1, nommodif);
		prepareStatement.setString(2, nominit);
		prepareStatement.executeUpdate();
		return new Document(nommodif);

	}

	public Document selectdoc(String nom) {
		PreparedStatement prepareStatement;
		String nomfinal = null;
		try {
			prepareStatement = ServicesDAO
					.preparedStatement(SELECT_DOCUMENT_PAR_NOM);
			prepareStatement.setString(1, nom);
			final ResultSet rst = prepareStatement.executeQuery();

			while (rst.next()) {

				nomfinal = rst.getString("nom_documents");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return new Document(nomfinal);

	}

	public ArrayList<Document> alldocs() {
		ArrayList<Document> tab = new ArrayList<Document>();
		PreparedStatement preparedStatement;
		try {
			preparedStatement = ServicesDAO.preparedStatement(SELECT_DOCUMENTS);
			final ResultSet rst = preparedStatement.executeQuery();
			while (rst.next()) {
				String nom = rst.getString("nom_documents");

				tab.add(new Document(nom));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return tab;

	}

	public void deletedoc(String nom) throws SQLException {
		final PreparedStatement preparedStatement = ServicesDAO
				.preparedStatement(DELETE_DOCUMENTS);
		preparedStatement.setString(1, nom);
		preparedStatement.executeUpdate();
	}

}
