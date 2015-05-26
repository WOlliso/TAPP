package org.tapp.gui;

import java.sql.Date;
import java.sql.SQLException;
import javax.enterprise.inject.Model;
import org.tapp.dal.JournalDAO;
import org.tapp.dal.ServicesDAO;

@Model
public class JournalBean {
	private String name;
	private Date date;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	
	
	public void createJournal(String name, Date date) {

	}
	
	public void deleteJournal() throws SQLException {
		
	}
	
	public void modifyJournal() throws SQLException {
		
	}
	
	public void readJournal() throws SQLException {
		
	}
}
