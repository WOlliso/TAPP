package com.humanbooster.tedi.tapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnexionPgSql implements Connexion {

	/*
	 * private String url; private String user; private String pwd;
	 */

	private final String url;
	private final String user;
	private final String pwd;
	private Connection connexion;

	public ConnexionPgSql(String url, String user, String pwd) {
		super();
		this.url = url;
		this.user = user;
		this.pwd = pwd;
	}

	public Connection connexion() {

		try {

			connexion = DriverManager.getConnection(url, user, pwd);

<<<<<<< HEAD
		} catch (final SQLException e) {
			// TODO Auto-generated catch block
=======
		} catch (SQLException e) {

>>>>>>> refs/heads/master
			e.printStackTrace();
		}

		return connexion;
	}

}
