package com.humanbooster.tedi.tapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnexionPgSql implements Connexion {

	/*
	 * private String url; private String user; private String pwd;
	 */

	private String url;
	private String user;
	private String pwd;
	private Connection connexion;

	public ConnexionPgSql(String url, String user, String pwd) {
		super();
		this.url = url;
		this.user = user;
		this.pwd = pwd;
	}

	@Override
	public Connection connexion() {

		try {

			connexion = DriverManager.getConnection(url, user, pwd);

		} catch (SQLException e) {

			e.printStackTrace();
		}

		return connexion;
	}

}
