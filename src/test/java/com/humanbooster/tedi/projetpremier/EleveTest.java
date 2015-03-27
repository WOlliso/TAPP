package com.humanbooster.tedi.projetpremier;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EleveTest {
	Connection connection;

	@Before
	public void init() {
		ConnexionH2 connexionH2 = new ConnexionH2();
		this.connection = connexionH2.connexion();
	}

	@Test
	public void testSomething() {
		Assert.assertTrue(true);
	}

	@After
	public void end() {
		try {
			this.connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
