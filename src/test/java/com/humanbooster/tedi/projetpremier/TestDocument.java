package com.humanbooster.tedi.projetpremier;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.humanbooster.tedi.tapp.Document;
import com.humanbooster.tedi.tapp.tests.ConnexionH2;

public class TestDocument {

	Document document;
	ConnexionH2 connection;
	Connection con;

	@Before
	public void init() throws SQLException {
		document = new Document();
		connection = new ConnexionH2();
		con = connection.connexion();
		String sql = "CREATE TABLE documents (id_documents serial NOT NULL,nom_documents character varying);";
		con.createStatement().executeUpdate(sql);

	}

	@Test
	public void testajout() {
		Statement stmt;
		try {
			stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
					ResultSet.CONCUR_UPDATABLE);
			ResultSet rst1 = stmt.executeQuery("SELECT * FROM documents");
			rst1.last();
			int nbelements1 = rst1.getRow();

			document.adddoc("nom", con);
			ResultSet rst2 = stmt.executeQuery("SELECT * FROM documents");
			rst2.last();
			int nbelements2 = rst2.getRow();

			Assert.assertTrue(nbelements1 != nbelements2);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test
	public void testmodify() {
		try {
			Statement stmt = con.createStatement();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test
	public void testall() {

	}

	@After
	public void end() throws SQLException {
		con.close();
	}
}
