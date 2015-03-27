package com.humanbooster.tedi.projetpremier;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.humanbooster.tedi.tapp.Connexion;

public class ConnexionH2 implements Connexion {

	static final String URL = "jdbc:h2:mem:tapp;MODE=PostgreSQL";
	private Connection connexion;

	@Override
	public Connection connexion() {

		try {
			connexion = DriverManager.getConnection(URL);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return connexion;
	}

}
