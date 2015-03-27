package com.humanbooster.tedi.tapp.tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.humanbooster.tedi.tapp.ConnexionPgSql;

public class ConnexionPgSqlTest {

	String url;
	String user;
	String pass;

	@Before
	public void init() {
		user = "aqli";
		pass = "aqli";

	}

	@Test
	public void testCorrectConnection() {
		url = "jdbc:postgresql://localhost:5432/tapp";
		ConnexionPgSql connexionPgSql = new ConnexionPgSql(url, user, pass);
		Assert.assertNotNull(connexionPgSql.connexion());
	}

	@Test
	public void testIncorrectConnection() {
		url = "jdbc:postgresql://localhost:54/tapp";
		ConnexionPgSql connexionPgSql = new ConnexionPgSql(url, user, pass);
		Assert.assertNull(connexionPgSql.connexion());
	}

	/*
	 * @Test public void test() { ConnexionPgSql connexionPgSql = new
	 * ConnexionPgSql( "jdbc:postgresql://localhost:5432/tapp", "aqli", "aqli");
	 * assertNotNull(connexionPgSql.connexion()); }
	 */
}
