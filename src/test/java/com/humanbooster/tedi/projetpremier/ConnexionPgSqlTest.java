package com.humanbooster.tedi.projetpremier;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ConnexionPgSqlTest {

	String driver = "org.postgresql.Driver";

	@Before
	public void init() {

	}

	@Test
	public void testCorrectConnection() {
		try {
			Class<?> driverClass = Class.forName(driver);

			Assert.assertNotNull(driverClass);
		} catch (ClassNotFoundException e) {
			Assert.fail("Driver class not found!");
		}
	}
}
