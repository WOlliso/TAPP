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

	/*
	 * static Statement statement; static ResultSet resulSet;
	 */

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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return connexion;
	}

	/*
	 * public ResultSet resultSet(String request) { try { statement =
	 * connexion().createStatement(); resulSet =
	 * statement.executeQuery(request);
	 * 
	 * } catch (SQLException e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); }
	 * 
	 * return resulSet; }
	 * 
	 * 
	 * public List<Object> getResulSet() { List<Object> list = new
	 * ArrayList<Object>();
	 * 
	 * try { while (resulSet.next()) { list.add(resulSet.getConcurrency());
	 * 
	 * } } catch (SQLException e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); } return list;
	 * 
	 * }
	 */

}
